package Domaci6nedelja.nedelja;

public class TestAutomobil {

    public static void main(String[] args) {


        Automobil n1 = new Automobil("Fiat", "Uno", 234567, "Milos Pavlovic");
        Automobil n2 = new Automobil("Audi", "A3", 554555, "Sinisa Mladenovic");
        Automobil n3 = new Automobil("Volkswagen", "Golf 4", 342393, "Stanko Pavlovic");

        System.out.println(n1);
        System.out.println("_______________________");
        System.out.println("Model Audija je:");
        System.out.println(n2.getModel());
        System.out.println("Serijski broj Golfa je: ");
        System.out.println(n3.getSerijskiBroj());
        System.out.println("_______________________");
        System.out.println("Prvi vlasnik je bio: ");
        System.out.println(n1.getVlasnik());
        n1.setVlasnik("Stefan Petrovic");
        System.out.println("Trenutni vlasnik je: ");
        System.out.println(n1.getVlasnik());



    }

}

