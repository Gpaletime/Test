package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Operation extends AttractionsLand{

    public String m_date;
    public String m_heure;
    public String m_zone;

    public Operation(String msg, String msg1, String msg2, int n , String p, ArrayList<Operation> o) {

        super(n, p, o);
        this.m_date = msg;
        this.m_heure = msg1;
        this.m_zone = msg2;

    }

    public Operation(String date, String heure, String zone) {
        super();
        this.m_date=date;
        this.m_heure=heure;
        this.m_zone=zone;
    }


    /*--------------------setter-------------------*/
    public void setDate(String d) {
        m_date = d;
    }

    public void setHeure(String h) {
        m_heure = h;
    }

    public void setZone(String z) {
        m_zone = z;
    }


    /*--------------------getter-------------------*/
    public String getDate() {
        return m_date;
    }

    public String getHeure() {
        return m_heure;
    }

    public String getZone() {
        return m_zone;
    }

    public String toString() {
        return m_date + " " + m_heure + " | " + m_zone;
    }

    public void Historique(int nbrOperations)
    {

        System.out.println(m_op);
    }
}





