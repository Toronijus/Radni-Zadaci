package Domaci7nedelja2;

public class Vozac extends Covek{
    private String zanimanje;

    public Vozac(String ime, String prezime, String zanimanje) {
        super(ime, prezime);
        this.zanimanje = zanimanje;
    }

    public String getZanimanje() {
        return zanimanje;
    }
}
