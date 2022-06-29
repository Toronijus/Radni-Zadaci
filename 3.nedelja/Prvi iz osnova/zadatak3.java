package Domaci3nedelja;

import java.util.Scanner;

public class zadatak3 {

    public static void main(String[] args) {

        System.out.println("Unesite godinu koju zelite da proverite:");

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        if (r % 400 == 0){
            System.out.println("Godina je prestupna!");
        }
            else if (r %4==0 && r %100!=0){System.out.println("Godina je prestupna!");
            }
                     else {System.out.println("Godina nije prestupna!");
                     }

    }


}



