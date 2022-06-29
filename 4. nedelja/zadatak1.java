package Domaci4;

import java.util.Scanner;

public class zadatak1 {


    public static void main(String[] args) {
        /*  Написати програм који исписује парне природне бројеве до унетог броја
            Природни бројеви су сви цели бројеви већи од 0 - {1,2,...}
            Пример1:
            Корисник уноси: 11
            Испис: 2,4,6,8,10

            Пример2:
            Корисник уноси: 8
            Испис: 2,4,6,8 */

        System.out.println("Unesi broj za proveru:");
        Scanner sken = new Scanner(System.in);
        int a = sken.nextInt();
        int x = 2;
        System.out.print("Niz parnih pozitivnih brojeva je :");

        if (a < 2) {
            System.out.println("Uneli ste broj manji od prvog pozitivnog");
        } else {
            while (x <= a) {
                if (x == a) {
                    System.out.println(x);
                } else {
                    System.out.print(x + ",");

                }

                x += 2;
            }
        }
    }
}
