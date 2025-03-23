package com.christina.research.psclassifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlanetarySystem {
    private String stellarName;
    private List<Exoplanet> exoplanetList;
    private int numOfExoplanets;
    private double totalExoplanetMass;
    private double avgExoplanetMass;
    private double standardDeviation;
    private double similarityCoefficient;
    private double variationCoefficient;
    private String planetaryClass;

    public PlanetarySystem(final String stellarName) {
        this.stellarName = stellarName;
        this.exoplanetList = new ArrayList<>();
        this.numOfExoplanets = 0;
        this.totalExoplanetMass = 0;
        this.avgExoplanetMass = 0;
        this.standardDeviation = 0;
        this.similarityCoefficient = 0;
        this.variationCoefficient = 0;
        this.planetarySystemClass = "N/A";
    }

    public String getStellarName() {
        return stellarName;
    }

    public List<Exoplanet> getExoplanetList() {
        return exoplanetList;
    }

    public String getPlanetarySystemClass() {
        return planetarySystemClass;
    }

    public void addExoplanet(Exoplanet exoplanet) {
        exoplanetList.add(exoplanet);
        numOfExoplanets++;
        totalExoplanetMass += exoplanet.getMass();
        avgExoplanetMass = totalExoplanetMass / numOfExoplanets;
    }

    public void sortExoplanets() {
        Collections.sort(exoplanetList);
    }

    public void computeStandardDeviation() {
        double totalSquareDiff = 0;
        for (Exoplanet exoplanet : exoplanetList) {
            totalSquareDiff += Math.pow((exoplanet.getMass() - avgExoplanetMass), 2);
        }
        standardDeviation = Math.sqrt(totalSquareDiff / numOfExoplanets);
    }

    public void computeSimilarityCoefficient() {
        if (numOfExoplanets <= 1) {
            return;
        }

        double logSum = 0;
        for (int i = 0; i < exoplanetList.size() - 1; i++) {
            logSum += Math.log10(exoplanetList.get(i+1).getMass() / exoplanetList.get(i).getMass());
        }
        similarityCoefficient = logSum / (numOfExoplanets - 1);
    }

    public void computeVariationCoefficient() {
        if (numOfExoplanets <= 1) {
            return;
        }

        computeStandardDeviation();
        variationCoefficient = standardDeviation / avgExoplanetMass;
    }

    public String classify() {
        if (numOfExoplanets <= 1) {
            return "N/A";
        }

        sortExoplanets();
        computeSimilarityCoefficient();
        computeVariationCoefficient();

        double variationCoefficientThreshold = Math.sqrt(numOfExoplanets - 1) / 2;
        if (similarityCoefficient < -0.2) {
            planetarySystemClass = "Anti-ordered";
        } else if (similarityCoefficient > 0.2) {
            planetarySystemClass = "Ordered";
        } else {
            if (variationCoefficient <= variationCoefficientThreshold) {
                planetarySystemClass = "Similar";
            } else {
                planetarySystemClass = "Mixed";
            }
        }
        return planetarySystemClass;
    }
}
