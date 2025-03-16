package model;

public class Auto extends Voertuig implements Belastbaar {

    // attributen

    private String soortBrandstof;
    protected static final int AANTAL_WIELEN = 4;

    // constructors

    public Auto(String merk, String type, int gewicht, String soortBrandstof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandstof = soortBrandstof;
    }

    // methoden

//    Voor een auto gelden drie tariefgroepen: auto’s lichter dan 1000 kg kosten 85 euro per kwartaal,
//    auto’s zwaarder dan 1450 kg kosten 122 euro per kwartaal en voor de overige auto’s betaal je 104
//    euro per kwartaal. Maar voor dieselauto’s betaal je een opslag van 30% en voor elektrische auto’s
//    krijg je 50% korting.

    public double getVervoerBelasting() {
        double belastingTarief = 0;
        final double ONDERGRENS_GEWICHT = 1000.0;
        final double BOVENGRENS_GEWICHT = 1450.0;
        final double KOSTEN_LICHT_GEWICHT = 85.0;
        final double KOSTEN_MEDIUM_GEWICHT = 104.0;
        final double KOSTEN_ZWAAR_GEWICHT = 122.0;
        final double OPSLAG_DIESEL = 1.3;
        final double KORTING_ELEKTRISCH = 0.5;

        if (this.getGewicht() < ONDERGRENS_GEWICHT) {
            belastingTarief = KOSTEN_LICHT_GEWICHT;
        }
        else if (this.getGewicht() > BOVENGRENS_GEWICHT) {
            belastingTarief = KOSTEN_ZWAAR_GEWICHT;
        }
        else {
            belastingTarief = KOSTEN_MEDIUM_GEWICHT;
        }

        if (this.soortBrandstof.equals("elektrisch")){
            belastingTarief *= KORTING_ELEKTRISCH;
        }
        else if (this.soortBrandstof.equals("diesel")){
            belastingTarief *= OPSLAG_DIESEL;
        }

        return belastingTarief;
    }


    public String geefAandrijfKracht(){
        return " aangedreven door " + this.soortBrandstof + " motor\n" + this.getVervoerBelasting() + " euro belasting per kwartaal";
    }

    // getters en setters

}
