package Domaci4;

import java.util.Scanner;

public class zadatak4 {

    public static void main(String[] args) {

       /* 4. Написати програм који исписује следеће облике:
        Квадрат
                N = 4     N = 3                                Правоугаоник
                                                             a = 5 b = 4        a = 2 b = 6
                    ####      ###
                    ####      ###
                    ####      ###
                    ####
                                                                #####              ##
                                                                #####              ##
                                                                #####              ##
                                                                #####              ##
                                                                                   ##
                                                                                   ##
         *Марио пирамида - Бонус задатак
                N = 5

                    # #
                   ## ##
                  ### ###
                 #### ####
                ##### ##### */


        //4a zadatak
        System.out.println("Unesi velicinu stranicu kvadrata: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("# ");
            }
            System.out.println();


        }

        //4b.zadatak
        System.out.println("Unesi duzinu vertikalne stranice: ");
        int d = sc.nextInt();
        System.out.println("Unesi duzinu horizontalne stranice: ");
        int c = sc.nextInt();

        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("# ");
            }
            System.out.println();

        }
        //4c.zadatak
        System.out.println("Uneti visinu kule: ");
        int vsn = sc.nextInt();

        for (int a = 1; a <= vsn; a++) {
            for (int s = a; s < vsn; s++) {
                System.out.print("  ");
            }
            for (int f = 1; f <= a; f++) {
                System.out.print("# ");

            }
            System.out.print("  ");

            for (int f = 1; f <= a; f++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }


}


