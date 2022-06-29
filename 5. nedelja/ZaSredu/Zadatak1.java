package Domaci5nedelja;

import java.util.Scanner;

public class Zadatak1 {
/*1. Написати функцију која враћа највећи од 3 прослеђена double-a
    Ако има дупликата, вратити било који
    Без коришћења уграђених функција
    maximum(3.0,4.2,5.1) -> 5.1
    maximum(-4.3,-4.3,-4.4) -> -4.3
    maximum(1,1,1) -> 1
            2.*/

    public static double maksim(double a, double b, double c) {
        double maks = a;
        if (b >= maks) {
            maks = b;
        }
        if (c > maks) {
            maks = c;
        }
        return maks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tri broja:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Najveci broj je " + maksim(a, b, c));

    }

}
