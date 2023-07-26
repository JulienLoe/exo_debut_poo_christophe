package org.example;

public class WaterTank {
    private int poids_a_vide;
    private int capMax;
    private int niveau_remplissage;

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    private int poids;

    static int volume_total;


    public WaterTank(int poids_a_vide, int capMax, int niveau_remplissage) {
        this.poids_a_vide = poids_a_vide;
        this.capMax = capMax;
        this.niveau_remplissage = niveau_remplissage;
        volume_total += niveau_remplissage;


    }

    public void totalCiterne(){
        poids = (poids_a_vide + niveau_remplissage);


    }
    public void  remplir(int volume) {

        if (niveau_remplissage <= capMax ) {
            setNiveau_remplissage(volume);
        setVolume_total(volume);
        }
    }

    public void vider(int volume) {

        if (niveau_remplissage > 0) {
            setNiveau_remplissage(-volume);
            setVolume_total(-volume);
        }
    }

    public int total() {
        volume_total += niveau_remplissage;
        return volume_total;
    }


    public static int getVolume_total() {
        return volume_total;
    }

    public static void setVolume_total(int volume_total) {
        WaterTank.volume_total += volume_total;
    }

    public int getPoids_a_vide() {
        return poids_a_vide;
    }

    public void setPoids_a_vide(int poids_a_vide) {
        this.poids_a_vide = poids_a_vide;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getNiveau_remplissage() {
        return niveau_remplissage;
    }

    public void setNiveau_remplissage(int niveau_remplissage) {
        this.niveau_remplissage += niveau_remplissage;
    }
}