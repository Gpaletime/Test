package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PasseZone extends AttractionsLand {
    protected boolean m_zone_1;
    protected boolean m_zone_2;
    protected boolean m_activ;

    public PasseZone(int n, String p, ArrayList<Operation> o, boolean a, boolean b, boolean c) {
        super(n, p, o);
        this.m_zone_1 = a;
        this.m_zone_2 = b;
        this.m_activ = c;

    }

    /*--------getter-------------------*/
    public boolean getZone1() {
        return m_zone_1;
    }

    public boolean getZone2() {
        return m_zone_2;
    }

    public boolean getActiv() {
        return m_activ;
    }

    public void charger() {
        m_activ = true;
    }

    public boolean Valider() {
        if (m_activ == false) {
            return false;

        } else {
            System.out.println("Veuillez saisir la date, l'heure et la zone =");
            Scanner input = new Scanner(System.in);
            String date = input.nextLine();
            String heure = input.nextLine();
            String zone = input.nextLine();

            Operation op = new Operation(date, heure, zone);

            op.getList().add(op);
        }
        return true;
    }
}