package Domaci3nedelja;

import java.util.Scanner;

public class zadatak1 {

    public static void main(String[] args) {

        System.out.println("Dobrodosli u pivnicu Kod Pospanog Dzo-a!!!");
        System.out.println("Ja sam Dzo i bicu vas domacin,ali pre nego sto nastavimo dalje.");
        System.out.println("Jedan vazan podatak mi je potreban.Koliko vam je godina?");

        Scanner sc=new Scanner(System.in);
        int z = sc.nextInt();

        if (z > 18) {
            System.out.println("Za vas imamo veliki izbor piva i najrazlicitijih krajeva?Kakva volite ?");
        } else if (z < 0) {
            System.out.println("Nemojte lagati za godine,da pokusamo jos jednom?");
        }
            else if (z < 18) {
                System.out.println("Za vas imamo sokove najrazlicitijih vrsta.");
        } else {
            System.out.println("Dobrodosli u svet odraslih." + "Da zapocnemo s jednim pivom?");
        }
    }
}