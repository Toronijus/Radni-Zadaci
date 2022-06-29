package Domaci3nedelja;

import java.util.Scanner;

public class zadatak4 {

    public static void main(String[] args) {

        System.out.println("Unesite mesec(1-12):");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 1 || a > 12) {
            System.out.println("Pogresan broj ste uneli");
        } else if (a == 2) {
            System.out.println("Unesite Godinu: ");
            int b = sc.nextInt();
            if (b % 400 == 0) {
                System.out.println("Dana ima:");
                System.out.println("29");
            } else if (b % 4 == 0 && b % 100 != 0) {
                System.out.println("Dana ima:");
                System.out.println("29");
            } else {
                System.out.println("Dana ima:");
                System.out.println("28");
            }

        } else if (a == 4 || a == 6 || a == 9 || a == 11) {
            System.out.println("Dana ima:");
            System.out.println("30");
        } else {
            System.out.println("Dana ima:");
            System.out.println("31");
        }

    }
}


