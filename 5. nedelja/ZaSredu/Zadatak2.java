package Domaci5nedelja;

import java.util.Scanner;

public class Zadatak2 {

    /*2. Написати функцију која враћа true/false у зависности од тога да ли је година преступна или није
        Искористити услове од раније*/
    public static boolean prestupna(int q) {
        if (q % 400 == 0 || (q % 4 == 0 && q % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu:");
        int q = sc.nextInt();

        if (prestupna(q) == true) {
            System.out.println("Godina je prestupna.");
        } else {
            System.out.println("Godina nije prestupna.");

        }
    }
}
