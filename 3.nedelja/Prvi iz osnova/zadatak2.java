package Domaci3nedelja;

import java.util.Scanner;

public class zadatak2 {

    public static void main(String[] args) {

        System.out.println("Da li je vikend sada?");
        System.out.println("Unesite broj dana u nedelji koji je:");

        Scanner sken = new Scanner(System.in);
        int x = sken.nextInt();

        if (x > 8 || x <= 0) {
            System.out.println("Zanimljivo!Sa koje ste vi planete?");
        } else if (x == 6 || x == 7) {
            System.out.println("Vikend je tu.Iskoristi ga!!");
        } else  {
            System.out.println("Nije vikend!Jos mora da se radi!");
        }


    }

}



