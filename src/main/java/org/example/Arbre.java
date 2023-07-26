package org.example;

public class Arbre extends Plante {

    private double circonference;

    public double getCirconference() {
        return circonference;
    }

    public void setCirconference(double circonference) {
        this.circonference = circonference;
    }

    public Arbre(String nom, float hauteur, String couleurFeuilles, double circonference) {
        super(nom, hauteur, couleurFeuilles);
        this.circonference = circonference;
    }

    public void infoFleur(){
        System.out.println(this.nom);
        System.out.println(this.hauteur);
        System.out.println(this.couleurFeuilles);
        System.out.println(this.circonference);
    }
}
