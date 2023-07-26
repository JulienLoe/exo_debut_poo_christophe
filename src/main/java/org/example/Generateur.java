package org.example;

public class Generateur  {

    public static String masque;
    static String[] tab = {"dodo", "camion", "dormir", "rat"};

    static  int nombre;






    public static void mot(){

         nombre = (int) (Math.random() * (4 - 2));
         for (int i = 0; i < tab[nombre].length()+1; i++){
             if (masque == null) {
                 masque = "";}
             else {
                 masque += "*";
             }

         }




    };

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }
}
