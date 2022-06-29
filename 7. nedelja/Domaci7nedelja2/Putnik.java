package Domaci7nedelja2;

public class Putnik extends Covek{
    private double novac;



    public Putnik(String ime, String prezime, double novac) {
        super(ime, prezime);
        this.novac = novac;


    }
    public double getNovac() {
        return novac;
    }

    public void setNovac(double novac) {
        this.novac = novac;
    }

    public void dodajNovac(double br){
        novac += br;
    }
    public void oduzmiNovac(double br){
        if(novac !=0 && novac > br){novac -=br;
        }
        else if (br > novac){
            novac = 0;
        }
    }
}
