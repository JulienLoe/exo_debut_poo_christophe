package org.example;

public class WaterTank {
    private double poids_a_vide;
    private double capMax;
    private double niveau_remplissage;

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    private double poids;

    static double volume_total;


    public WaterTank(double poids_a_vide, double capMax, double niveau_remplissage) {
        this.poids_a_vide = poids_a_vide;
        this.capMax = capMax;
        this.niveau_remplissage = niveau_remplissage;
        volume_total += niveau_remplissage;


    }

    public void totalCiterne(){
        poids = (poids_a_vide + niveau_remplissage);


    }
    public void  remplir(double volume) {

        if (niveau_remplissage <= capMax ) {
            setNiveau_remplissage(volume);
        setVolume_total(volume);
        }
    }

    public void vider(double volume) {

        if (niveau_remplissage > 0) {
            setNiveau_remplissage(-volume);
            setVolume_total(-volume);
        }
    }

    public double total() {
        volume_total += niveau_remplissage;
        return volume_total;
    }


    public static double getVolume_total() {
        return volume_total;
    }

    public static void setVolume_total(double volume_total) {
        WaterTank.volume_total += volume_total;
    }

    public double getNiveau_remplissage() {
        return niveau_remplissage;
    }

    public void setNiveau_remplissage(double niveau_remplissage) {
        this.niveau_remplissage += niveau_remplissage;
    }
}