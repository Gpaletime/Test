package com.company;

import java.util.ArrayList;

public class AttractionsLand {

   protected int m_number;
   protected String m_proprietaire;
   protected ArrayList<Operation> m_op;


   public AttractionsLand(int n, String p, Operation o){}
   public AttractionsLand(int n , String p,ArrayList<Operation> o)
   {
      this.m_number =n;
      this.m_proprietaire=p;
      this.m_op =o;

   }

   public AttractionsLand() {

   }


   /*--------------------getter-------------------*/
   public int number()
   {
      return m_number;
   }

   public String getProprio()
   {
      return m_proprietaire;
   }
   public ArrayList<Operation> getList()
   {
      return m_op;
   }

   public String toString(){
      return m_number + " - " + m_proprietaire+ " -" + m_op;
   }

   void Historique()
   {
      System.out.println(m_op);
   }

}




