package org.example;
public class Chaise {
    private  int nombre_pîeds;
    private String materiaux;
    private String couleur;

    private Double prix;


    public Chaise( int nombre_pieds, String materiaux, String couleur, double prix  ){
        this.nombre_pîeds = nombre_pieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    };

    public Chaise(){
        this.nombre_pîeds = 4;
        this.materiaux = "bois";
        this.couleur = "rouge";
        this.prix = 20.99;
    };

    public String toString(){
        return("Je suis une chaise avec " + nombre_pîeds + " pied(s) en " + materiaux +  " de couleur " + couleur + " à un prix de " + prix);
    };
}
