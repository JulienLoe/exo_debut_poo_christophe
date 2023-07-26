package org.example;

public class Plante {
    private String nom;
    private float hauteur;
    private String couleurFeuilles;



    public Plante(String nom, float hauteur, String couleurFeuilles) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuilles = couleurFeuilles;
    }

    public void infoFleur(){
        System.out.println(getNom());
        System.out.println(getHauteur());
        System.out.println(getCouleurFeuilles());
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuilles() {
        return couleurFeuilles;
    }

    public void setCouleurFeuilles(String couleurFeuilles) {
        this.couleurFeuilles = couleurFeuilles;
    }
}
