package Domaci4;

import java.util.Scanner;

public class zadatak2 {

    public static void main(String[] args) {

        /*2. Написати збир целих бројева од N до M (Укључујући оба)
            N и M се уносе са тастатуре
            Напомена: N може бити и мање од M, видети Пример2
            Пример1:
            Корисник уноси: 5 11
            Испис: 56  (5 + 6 + 7 + 8 + 9 + 10 + 11)

            Пример2:
            Корисник уноси: 11 8
            Испис: 38  (8 + 9 + 10 + 11) */
        System.out.println("Unesi bilo koja dva broja ciji zbir niza zelis da proveris: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = sc.nextInt();
        int zbir = 0;

        if (n < m){

            while (n <= m) {
                if (n == m) {
                    System.out.print(n);
                } else {
                    System.out.print(n + " + ");
                }
                zbir += n;
                n++;
            }
        } else if (m < n) {
            while (m <= n) {
                if (n == m) {
                    System.out.print(m);
                } else {
                    System.out.print(m + " + ");
                }
                zbir += m;
                m++;

            }
        }
        else {
            System.out.print(m);
            zbir += m;
        }
        System.out.println();
        System.out.println("Zbir ovih brojeva je " + zbir);


    }
}
