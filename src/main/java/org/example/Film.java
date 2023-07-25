package org.example;

import java.util.Date;

public class Film {
    private String titre;
    private String realisateur;
    private String annee_de_sortie;
    private String genre;


    public Film(String titre, String realisateur, String annee_de_sortie, String genre){
        this.titre = titre;
        this.realisateur = realisateur;
        this.annee_de_sortie = annee_de_sortie;
        this.genre = genre;
    }

    public String toString(){
        return("Film{titre= " + getTitre() +", realisateur=" + getRealisateur() + " dateSortie=" + getAnnee_de_sortie() +", genre=" + getGenre() + "}");
};

public void setTitre(String titre){
        this.titre = titre;
        }

public String getTitre(){
        return titre;
        }

public void setRealisateur(String realisateur){
        this.realisateur = realisateur;
        }

public String getRealisateur(){
        return realisateur;
        }

public void setAnnee_de_sortie(String annee_de_sortie){
        this.annee_de_sortie = annee_de_sortie;
        }

public String  getAnnee_de_sortie(){
        return annee_de_sortie;
        }

public void setGenre(String genre){
        this.genre = genre;
        }

public String getGenre(){
        return genre;
        }
}
