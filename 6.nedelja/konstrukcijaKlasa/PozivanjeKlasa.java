package Domaci6nedelja.konstrukcijaKlasa;

public class PozivanjeKlasa {


    public static void main(String[] args) {

        Zivotinja lav = new Zivotinja("Tigar","Sisar","Macka","Velika",10);
        Zivotinja konj = new Zivotinja("Konj","Sisar","Kopitar","Velika", 30);
        Zivotinja pas = new Zivotinja("Pas","Sisar","Pas", "Srednja", 20 );

        Knjiga zivotinjskaFarma = new Knjiga("Zivotinjska farma","Dzordz","Orvel",1945);
        Knjiga alisaUZemljiCuda = new Knjiga("Alisa U zemlji cuda", "" , "Kerol" ,1865);
        Knjiga knjigaODzungli = new Knjiga("Knjiga O Dzungli", "Radjard","Kipling",1894);


        System.out.println("Koje godine je izdata knjiga " + zivotinjskaFarma.NaslovKnjige + " ?");
        System.out.println(zivotinjskaFarma.GodinaIzdavanja);
        System.out.println("___________________");
        alisaUZemljiCuda.ImeAutora = "Luis";
        System.out.println("Provera promene:");
        System.out.println(alisaUZemljiCuda.ImeAutora);
        System.out.println("___________________");

        System.out.println("Zivotinje koje se pojavljuju u knjizi " + zivotinjskaFarma.NaslovKnjige + " su:");
        System.out.println(konj.imeZivotinje + " i "  + pas.imeZivotinje );


    }
}
