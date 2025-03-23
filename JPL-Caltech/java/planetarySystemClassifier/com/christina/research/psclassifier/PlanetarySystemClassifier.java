package com.christina.research.psclassifier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class implements the planetary system architecture framework mentioned by
 * the paper (https://www.aanda.org/articles/aa/pdf/2023/02/aa43751-22.pdf)
 */

public class PlanetarySystemClassifier {
    private List<String[]> csvCache;
    private HashMap<String, PlanetarySystem> planetarySystemHashMap;
    private HashMap<String, String> exoplanetNameToStellarHostNameMap;

    public PlanetarySystemClassifier() {
        this.csvCache = new ArrayList<>();
        this.planetarySystemHashMap = new HashMap<>();
        this.exoplanetNameToStellarHostNameMap = new HashMap<>();
    }

    public void loadCSV(final String csvFileName, final String delimiter) {
        csvCache.clear();
        planetarySystemHashMap.clear();
        exoplanetNameToStellarHostNameMap.clear();

        String line;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {
            while ((line = br.readLine()) != null) {
                String[] dataFields = line.split(delimiter);
                csvCache.add(dataFields);
                count++;

                // Print out the first 100 data row for sanity check
                if (count <= 100) {
                    System.out.println(String.join(" | ", dataFields));
                }

                if (count == 1) {
                    continue;
                }

                final String exoplanetName = dataFields[1];
                final String stellarHostName = dataFields[2];
                final String exoplanetType = dataFields[19];
                double exoplanetMass = 0;
                double exoplanetRadius = 0;
                double exoplanetOrbitRadius = 0;
                try {
                    exoplanetMass = Double.parseDouble(dataFields[6]);
                    exoplanetRadius = Double.parseDouble(dataFields[5]);
                    exoplanetOrbitRadius = Double.parseDouble(dataFields[4]);

                    // Add exoplanet name => stellar host name mapping pair into the hash map
                    if (!exoplanetNameToStellarHostNameMap.containsKey(exoplanetName)) {
                        exoplanetNameToStellarHostNameMap.put(exoplanetName, stellarHostName);
                    }

                    Exoplanet exoplanet = new Exoplanet(exoplanetName,
                            exoplanetType,
                            exoplanetMass,
                            exoplanetRadius,
                            exoplanetOrbitRadius);

                    if (!planetarySystemHashMap.containsKey(stellarHostName)) {
                        // The planetary system hash map dosen't contain the planetary system,
                        // create a new planetary system and put into the hash map
                        PlanetarySystem planetarySystem = new PlanetarySystem(stellarHostName);
                        planetarySystem.addExoplanet(exoplanet);
                        planetarySystemHashMap.put(stellarHostName, planetarySystem);
                    } else {
                        // The planetary system hash map contains the planetary system
                        PlanetarySystem planetarySystem = planetarySystemHashMap.get(stellarHostName);
                        planetarySystem.addExoplanet(exoplanet);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error when parsing double from string, skip the record...");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void classifyPlanetarySystems() {
        for (Map.Entry<String, PlanetarySystem> entry : planetarySystemHashMap.entrySet()) {
            String planetarySystemClass = entry.getValue().classify();
        }
    }

    public void outputToCSV(final String csvFileName, final String delimiter) {
        List<String> header = Arrays.asList("st_host_name", "pl_lm_class");
        List<List<String>> data = new ArrayList<>();

        // Populate data (stellar_host_names and planet_system_lm_classes) for output CSV file
        for (Map.Entry<String, PlanetarySystem> entry : planetarySystemHashMap.entrySet()) {
            String stellarHostName = entry.getValue().getStellarName();
            String planetarySystemClass = entry.getValue().getPlanetarySystemClass();
            data.add(Arrays.asList(stellarHostName, planetarySystemClass));
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFileName))) {
            // Write header
            writeLine(writer, header, delimiter);

            // Write data rows
            for (List<String> row : data) {
                writeLine(writer, row, delimiter);
            }

            System.out.println("CSV file created successfully: " + csvFileName);

        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    private static void writeLine(BufferedWriter writer,
                                  List<String> values,
                                  String delimiter) throws IOException {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            line.append(escapeSpecialCharacters(values.get(i)));
            if (i < values.size() - 1) {
                line.append(delimiter);
            }
        }
        writer.newLine();
        writer.write(line.toString());
    }

    private static String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            escapedData = data.replace("\"", "\"\"");
            escapedData = "\"" + escapedData + "\"";
        }
        return escapedData;
    }
}
