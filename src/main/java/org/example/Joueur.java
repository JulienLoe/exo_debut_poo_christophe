package org.example;

public class Joueur {
    private String nom;
    private int niveau;
    private int points_exp;




    public Joueur(String nom, int niveau, int points_exp){
        this.nom = nom;
        this.niveau = niveau;
        this.points_exp = points_exp;
    }

    public void effectuerUneQuete(int i){
        System.out.println("Le joueur " + getNom() + " effectue la quête n°" + i  );
        this.points_exp += 10;
        augExp();
    }

    public void augExp(){
        if(this.points_exp == 100) {
            this.niveau += 1;
            System.out.println("Le joueur " + getNom() +  " passe au niveau : " +getNiveau());
            this.points_exp = 0;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPoints_exp() {
        return points_exp;
    }

    public void setPoints_exp(int points_exp) {
        this.points_exp = points_exp;
    }


}
