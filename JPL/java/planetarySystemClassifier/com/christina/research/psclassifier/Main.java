package com.christina.research.psclassifier;

public class Main {
    public static void main(String[] args) {
        PlanetarySystemClassifier psClassifier = new PlanetarySystemClassifier();
        psClassifier.loadCSV("PlanetarySystemDataForLmClassification.csv", ",");
        psClassifier.classifyPlanetarySystems();
        psClassifier.outputToCSV("PlanetarySystemLmClassificationResults.csv", ",");
    }
}
