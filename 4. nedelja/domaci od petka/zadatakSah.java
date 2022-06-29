package petak13maj;

import java.util.Arrays;
import java.util.Scanner;

public class zadatakSah {

    public static void main(String[] args) {

        /*
         * Navodimo figure svakog igraca
         * Figure su: Pesak, Lovac, Konj, Top, Kraljica
         * Vrednosti:  1       3     3     5      12
         *
         * 1. Korisnik unosi koliko igrac1 ima figura
         * 2. Unosi imena tih figura (igraca 1)
         * 3. Unosi koliko igrac2 ima figura
         * 4. Unosi mena tih figura (igraca 2)
         * 5. Ispisujete ko ima bolju poziciju. Bolju poziciju ima igrac sa vecom sumom vrednosti
         *       svojih figura
         *
         * Primer:
         * Igrac 1: Pesak, Konj, Pesak, Top  (10)
         * Igrac 2: Pesak, Kraljica, Top, Pesak, Lovac  (22)
         * Dakle, Igrac 2 ima bolju poziciju.
         * */
        String[] figure = {"PESAK", "LOVAC", "KONJ", "TOP", "KRALJICA"};


        System.out.println("Unesite broj figura prvog igraca:");
        Scanner sc = new Scanner(System.in);
        int brojFigura1 = sc.nextInt();
        String[] prviIgrac = new String[brojFigura1];
        System.out.println("Unesite nazive figura Prvog igraca:");


        for (int i = 0; i < brojFigura1; i++) {
            sc.nextLine();
            prviIgrac[i] = sc.nextLine();
            prviIgrac[i] = prviIgrac[i].toUpperCase();
            prviIgrac[i] = prviIgrac[i].trim();


        }
        int zbir1 = 0;
        for (int i = 0; i < brojFigura1; i++) {
            if (prviIgrac[i].equals(figure[0])) {
                zbir1 = zbir1 + 1;
            } else if (prviIgrac[i].equals(figure[1])) {
                zbir1 = zbir1 + 3;
            } else if (prviIgrac[i].equals(figure[2])) {
                zbir1 = zbir1 + 3;
            } else if (prviIgrac[i].equals(figure[3])) {
                zbir1 = zbir1 + 5;
            } else if (prviIgrac[i].equals(figure[4])) {
                zbir1 = zbir1 + 12;
            }

        }

        System.out.println("Unesite broj figura drugog igraca:");
        int brojFigura2 = sc.nextInt();
        String[] drugiIgrac = new String[brojFigura2];
        System.out.println("Unesite nazive figura drugog igraca:");

        for (int j = 0; j < brojFigura2; j++) {
            sc.nextLine();
            drugiIgrac[j] = sc.nextLine();
            drugiIgrac[j] = drugiIgrac[j].toUpperCase();
            drugiIgrac[j] = drugiIgrac[j].trim();


        }
        int zbir2 = 0;
        for (int j = 0; j < brojFigura2; j++) {
            if (drugiIgrac[j].equals(figure[0])) {
                zbir2 = zbir2 + 1;
            } else if (drugiIgrac[j].equals(figure[1])) {
                zbir2 = zbir2 + 3;
            } else if (drugiIgrac[j].equals(figure[2])) {
                zbir2 = zbir2 + 3;
            } else if (drugiIgrac[j].equals(figure[3])) {
                zbir2 = zbir2 + 5;
            } else if (drugiIgrac[j].equals(figure[4])) {
                zbir2 = zbir2 + 12;
            }

        }

        System.out.println("-------------------------------");

        if( zbir1 < zbir2) {
            System.out.println("Drugi igrac je u boljoj poziciji.");
        } else if (zbir1> zbir2) {
            System.out.println("Prvi igrac je u boljoj poziciji.");
        }
        else {
            System.out.println("Niko od igraca nema prednost.");

        }

    }


}

