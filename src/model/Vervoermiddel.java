package model;

public abstract class Vervoermiddel {

    // attributen
    private int id;
    private static int aantalVervoermiddelen;
    private String merk;
    private String type;

    // constructors

    protected Vervoermiddel(String merk, String type) {
        this.merk = merk;
        this.type = type;
        ++aantalVervoermiddelen;
        this.id = aantalVervoermiddelen;
    }

    // methoden

    public abstract String geefAandrijfKracht();

    public String toString() {
        return "Vervoermiddel #" + id + " " + merk + " " + type + this.geefAandrijfKracht();
    }

    // getters en setters


}
