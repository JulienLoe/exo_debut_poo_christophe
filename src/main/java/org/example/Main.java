package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Chaise ch1 = new Chaise(4, "chaine", "bleu", 14.4);
        Chaise ch2 = new Chaise( 3, "bambou", "gris", 130.99);
        Chaise ch3 = new Chaise(1, "metal", "orange", 76.25);
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());

//        Film{titre='La Haine', realisateur='Mathieu Kassovitz', dateSortie=1995-05-31, genre='Drame'}
//        Film{titre='Avatar 2', realisateur='James Cameron', dateSortie=2022-12-14, genre='Action'}
        Film f1 = new Film("La Haine", "Mathieu Kassovitz", "1995-05-3", "Drame");
        Film f2 = new Film("Avatar 2", "James Cameron", "2022-12-14", "Action");
        System.out.println(f1.toString());
        System.out.println(f2.toString());

        Joueur j1 = new Joueur("Julien",1,0);

        for(int i = 1; i<=21;i++){
            j1.effectuerUneQuete(i);

        }


    }
}