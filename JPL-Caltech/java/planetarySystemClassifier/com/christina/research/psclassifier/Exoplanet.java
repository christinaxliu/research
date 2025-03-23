package com.christina.research.psclassifier;

public class Exoplanet implements Comparable<Exoplanet> {
    private String name;
    private String type;
    private double mass;
    private double radius;
    private double orbitRadius;

    public Exoplanet(final String name,
                     final String type,
                     final double mass,
                     final double radius,
                     final double orbitRadius) {
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.radius = radius;
        this.orbitRadius = orbitRadius;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getOrbitRadius() {
        return orbitRadius;
    }

    @Override
    public int compareTo(Exoplanet other) {
        return this.orbitRadius < other.orbitRadius ? -1 : (this.orbitRadius > other.orbitRadius) ? 1 : 0;
    }
}
