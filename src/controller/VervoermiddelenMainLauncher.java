package controller;

import model.*;

import java.util.ArrayList;

public class VervoermiddelenMainLauncher {

    public static void main(String[] args) {

        Koets mijnKoets = new Koets("Glinkowski", "marathonwagen", 320, 2);
        Auto mijnAuto = new Auto("Dacia", "Logan MPV", 1150, "benzine");
        Fiets mijnFiets = new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9);
        Zeilboot mijnZeilboot = new Zeilboot("Dufour","36 Classic", 11.5);
        Motorboot mijnMotorboot = new Motorboot("Broesder","Kotter", 13.75, "diesel");
        Auto mijnTweedeAuto = new Auto("Tesla", "type S 100D", 2200, "elektrisch");

//        Vervoermiddel[] mijnVervoermiddelen = new Vervoermiddel[5];
//        mijnVervoermiddelen[0] = mijnKoets;
//        mijnVervoermiddelen[1] = mijnAuto;
//        mijnVervoermiddelen[2] = mijnFiets;
//        mijnVervoermiddelen[3] = mijnZeilboot;
//        mijnVervoermiddelen[4] = mijnMotorboot;
//
//        for (int i = 0; i < 5; i++) {
//            printVervoermiddelen(mijnVervoermiddelen[i]);
//        }

        ArrayList<Vervoermiddel> mijnAutoArrayList= new ArrayList<Vervoermiddel>();
        mijnAutoArrayList.add(mijnKoets);
        mijnAutoArrayList.add(mijnAuto);
        mijnAutoArrayList.add(mijnFiets);
        mijnAutoArrayList.add(mijnZeilboot);
        mijnAutoArrayList.add(mijnMotorboot);
        mijnAutoArrayList.add(mijnTweedeAuto);

        for (Vervoermiddel vervoermiddel : mijnAutoArrayList) {
            if (vervoermiddel instanceof Koets || vervoermiddel instanceof Fiets || vervoermiddel instanceof Zeilboot){
            System.out.println(vervoermiddel);
            }
        }

        // opdracht 6 van ArrayList2WillekeurigeOpdrachten
//        ArrayList<Auto> autoLijst = new ArrayList<>();
//        autoLijst.add(new Auto("Dacia", "Logan", 1150, "benzine"));
//        autoLijst.add(new Auto("Tesla", "S 100D", 2200, "elektrisch"));
//        autoLijst.add(new Auto("Fiat", "Ducato", 2700, "diesel"));
//        autoLijst.add(new Auto("Citroën", "C1", 2075, "benzine"));
//        autoLijst.add(new Auto("Ford", "Focus", 1150, "benzine"));
//        autoLijst.add(new Auto("Toyota", "Prius", 1750, "hybride"));
//        autoLijst.add(new Auto("Volkswagen", "Golf", 1150, "diesel"));
//        autoLijst.add(new Auto("Honda", "Civic", 1075, "benzine"));
//
//        System.out.println(geefZwaarsteAuto(autoLijst));

    }

    // methoden
    public static void printVervoermiddelen(Vervoermiddel vervoermiddel) {
        System.out.println(vervoermiddel);
    }

    public static Auto geefZwaarsteAuto(ArrayList<Auto> autos) {
        Auto zwaarsteAuto = null;
        for (Auto auto : autos) {
            if (zwaarsteAuto == null) {
                zwaarsteAuto = auto;
            } else if (auto.getGewicht() > zwaarsteAuto.getGewicht()) {
                zwaarsteAuto = auto;
            }
        }
        return zwaarsteAuto;
    }

}
