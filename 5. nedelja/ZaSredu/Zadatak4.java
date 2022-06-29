package Domaci5nedelja;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {
    /*4. Написати функцију која:
    Проверава да ли низ има дупликата
*Враћа број дупликата
*Враћа низ без дупликата*/

    public static boolean duplikat(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int broji(int[] x) {
        int n = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    n += 1;
                }
            }
        }
        return n;
    }

    // s tim sto za izvlacenje niza bez duplikata sam se namucio nadam se da moze ovako
    public static int[] novi(int[] x) {
        int k = x.length;

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (x[i] == x[j]) {
                    x[j] = x[k - 1];

                    k--;

                    j--;
                }

            }
        }
        int[] novi = Arrays.copyOf(x, k);

        return novi;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj clanova niza");
        int n = sc.nextInt();

        int[] x = new int[n];
        System.out.println("Uneti elemente niza:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        if (duplikat(x) == true) {
            System.out.println("Ima duplikata.");
        } else {
            System.out.println("Nema duplikata.");
        }
        System.out.println("Ima ukupno " + broji(x) + " duplikata.");


        System.out.println(" Niz bez duplikata:");


        for (int i = 0; i < novi(x).length; i++) {
            System.out.print(novi(x)[i] + "  ");


        }

    }
}

