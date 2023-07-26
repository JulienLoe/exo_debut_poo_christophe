package org.example;

import java.util.Arrays;
import java.util.Objects;

import static org.example.Generateur.*;

public class Pendu {

        private int nbEssais = 10;
        public static String mot;

        public static String[] masqueTab;




    public Pendu( int nbEssais) {

        this.mot = mot;
    }

    public static void testChar() {

        String[] motTabSaisi = mot.split("");
        String[] motTab = tab[nombre].split("");


        masqueTab = new String[0];
        for (int i = 0; i < motTabSaisi.length; i++) {


            System.out.println(Objects.equals(motTab[i], motTabSaisi[i]));
            if (!Objects.equals(motTab[i], motTabSaisi[i])) {
                break;
            }
            if (Objects.equals(motTab[i], motTabSaisi[i])) {
                masqueTab = masque.split("");
                for (int j = 0; j < motTabSaisi.length ; j++) {
                    masqueTab[j] = motTabSaisi[j];
                }
            }


        }



    };

    public void testWin(){

    };

    public static void genererMasque(){
        Generateur mot1 = new Generateur();
        mot1.mot();
    };


}
