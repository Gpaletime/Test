package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test extends AttractionsLand {

    public Test(int n, String p, ArrayList<Operation> o) {
        super(n, p, o);
    }

    // write your code here
    public static void main() {

        int choix;

        Scanner sc = new Scanner(System.in);

        System.out.println("Création de Passe:\n1/Passe Zone\n2/Passe Tickets");
        choix = sc.nextInt();

        switch (choix) {


            case 1: {
                int n = 2;
                String p = "Jean Dupond";
                //Operation op = new Operation();
                //Ajout d'une opération
               // Création d'opération pas le temps de l'implémenter

                ArrayList<Operation> o = null;
                boolean a = true;
                boolean b = true;
                boolean c = true;

                PasseZone Pz = new PasseZone(n, p, o, a, b, c);
                Pz.charger();
                Pz.Valider();
                Pz.Historique();
            }
            break;
            case 2: {
                int n = 2;
                int nbTicket = 10;
                String p = "Jean Dupond";
                ArrayList<Operation> o = null;
                

                PasseTickets Pt = new PasseTickets(n, p, o);
                Pt.charger(nbTicket);
                Pt.Valider();
                Pt.Historique();
            }
            break;


        }
    }
}
