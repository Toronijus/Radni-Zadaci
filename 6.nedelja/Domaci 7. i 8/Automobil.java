package Domaci6nedelja.nedelja;

public class Automobil {
    /*Napisati klasu Automobil. Automobil ima:
        - marku (polje tipa String) koje moze da se dohvati, ali ne i postavi
- model (polje tipa String) koje moze da se dohvati ali ne i postavi
- serijski broj (polje tipa int) koje moze da se dohvati ali ne i postavi
    Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku

    Napisati glavni program koji kreira tri automobila.
    U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil. */
   private String marka;
   private String model;
   private int serijskiBroj;
   private String vlasnik;


   public Automobil (String marka, String model, int serijskiBroj, String vlasnik) {
      this.marka = marka;
      this.model = model;
      this.serijskiBroj = serijskiBroj;
      this.vlasnik = vlasnik;

   }

   public Automobil(){
      this.marka="";
      this.model = "";
      this.serijskiBroj = 0;
      this.vlasnik = "";

   }
   public void setVlasnik(String vlasnik) {
      this.vlasnik = vlasnik;
   }

   public String getMarka() {
      return marka;
   }

   public String getModel() {
      return model;
   }

   public int getSerijskiBroj() {
      return serijskiBroj;
   }

   public String getVlasnik() {
      return vlasnik;
   }



   @Override
   public String toString() {
     String opis = "Marka ovog automobila je: ".concat(getMarka()).concat("\n");
     opis = opis.concat("Model ovog automobila je: ").concat(getModel()).concat("\n");
     opis = opis.concat("Serijski broj: ").concat(String.valueOf(getSerijskiBroj())).concat("\n");
     opis = opis.concat("Vlasnik je: " ).concat(getVlasnik()).concat("\n");
   return opis;
   }
}
