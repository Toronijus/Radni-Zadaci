package Domaci7nedelja2;

import java.util.ArrayList;

public class Autobus {
    private String naziv;
    private double cenaKarte;
    ArrayList <Putnik> putnici = new ArrayList<>();
    ArrayList <Vozac> vozac = new ArrayList<>(1);

    public Autobus(String naziv, double cenaKarte, ArrayList<Putnik> putnici, ArrayList<Vozac> vozac) {
        this.naziv = naziv;
        this.cenaKarte = cenaKarte;
        this.putnici = putnici;
        this.vozac = vozac;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public ArrayList<Putnik> getPutnici() {
        return putnici;
    }

    public void setPutnici(ArrayList<Putnik> putnici) {
        this.putnici = putnici;
    }

    public ArrayList<Vozac> getVozac() {
        return vozac;
    }

    public void setVozac(ArrayList<Vozac> vozac) {
        this.vozac = vozac;
    }
}
