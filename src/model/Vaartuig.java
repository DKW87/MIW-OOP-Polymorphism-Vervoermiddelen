package model;

public abstract class Vaartuig extends Vervoermiddel {

    // attributen

    private double lengteInMeter;

    // constructors

    protected Vaartuig(String merk, String type, double lengte) {
        super(merk, type);
        this.lengteInMeter = lengte;
    }

    // methoden



    // getters en setters

    public double getLengteInMeter() {
        return lengteInMeter;
    }
}
