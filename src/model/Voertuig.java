package model;

public abstract class Voertuig extends Vervoermiddel {

    // attributen

    private int aantalWielen;
    private int gewicht;

    // constructors

    protected Voertuig(String merk, String type, int aantalWielen, int gewicht) {
        super(merk, type);
        this.aantalWielen = aantalWielen;
        this.gewicht = gewicht;
    }

    // methoden



    // getters en setters

    public int getGewicht() {
        return gewicht;
    }
}
