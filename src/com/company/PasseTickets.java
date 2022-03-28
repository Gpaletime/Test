package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PasseTickets extends AttractionsLand {
    int m_tickets;

    public PasseTickets(int n, String p, ArrayList<Operation> o) {
        super(n, p, o);
    }

    public int getTickets() {
        return m_tickets;
    }

    public void charger(int nb_tickets) {
        nb_tickets = m_tickets;
    }

    public boolean Valider() {
        if (m_tickets < 1) {
            return false;
        } else {
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

