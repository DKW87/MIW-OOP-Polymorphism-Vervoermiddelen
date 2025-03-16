package model;

public class Koets extends Voertuig {

    // attributen

    private int aantalPaarden;
    protected static final int AANTAL_WIELEN = 4;

    // constructors

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.aantalPaarden = aantalPaarden;

    }

    // methoden


    public String geefAandrijfKracht(){
        return " aangedreven door " + this.aantalPaarden + " paarden";
    }

    // getters en setters

}
