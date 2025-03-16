package model;

public class Zeilboot extends Vaartuig {

    // attributen



    // constructors

    public Zeilboot(String merk, String type, double lengte) {
        super(merk, type, lengte);
    }

    // methoden


    public String geefAandrijfKracht(){
        return " aangedreven door windkracht";
    }

    // getters en setters

}
