package model;

public class Fiets extends Voertuig {

    // attributen

    protected static final int AANTAL_WIELEN = 2;

    // constructors

    public Fiets(String merk, String type, int gewicht) {
        super(merk, type, AANTAL_WIELEN, gewicht);
    }

    // methoden


    public String geefAandrijfKracht(){
        return " aangedreven door menskracht";
    }

    // getters en setters

}
