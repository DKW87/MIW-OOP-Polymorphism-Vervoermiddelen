package model;

public class Motorboot extends Vaartuig {

    // attributen

    private String soortBrandstof;

    // constructors

    public Motorboot(String merk, String type, double lengte, String brandstof) {
        super(merk, type, lengte);
        this.soortBrandstof = brandstof;
    }

    // methoden

//    Bij motorboten wordt gekeken naar de lengte. Boten kleiner dan 12 meter kosten
//    60 euro per kwartaal en grote boten kosten 100 euro per kwartaal. Ook hier betaal je meer voor
//    dieselmotoren, namelijk 50% meer.

    public double getVervoerBelasting() {
        double belastingTarief = 0;
        final double GRENS_KLEINE_BOTEN = 12.0;
        final double KOSTEN_LICHTGEWICHT = 60.0;
        final double KOSTEN_ZWAARGEWICHT = 100.0;
        final double OPSLAG_DIESEL = 1.5;

        if (this.getLengteInMeter() < GRENS_KLEINE_BOTEN) {
            belastingTarief = KOSTEN_LICHTGEWICHT;
        }
        else {
            belastingTarief = KOSTEN_ZWAARGEWICHT;
        }

        if (this.soortBrandstof.equals("diesel")) {
            belastingTarief *= OPSLAG_DIESEL;
        }

        return belastingTarief;

    }

    public String geefAandrijfKracht(){
        return " aangedreven door " + this.soortBrandstof + " motor\n" + this.getVervoerBelasting() + " euro belasting per kwartaal";
    }

    // getters en setters



}
