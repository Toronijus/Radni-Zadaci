package Domaci3nedelja;

import java.util.Scanner;

public class zadatak5 {


    public static void main(String[] args) {

        System.out.println("Unesite trocifren broj:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a / 100;
        int c = (a - b * 100) / 10;
        int d = (a - b * 100 - c * 10);

        if (a > 999 || a < 100) {
            System.out.println("Unos nije dobar!!!");
        } else {
            System.out.println("stotine: " + b + " desetice: " + c + " jedinice: " + d);

            double b1 = b * 1.0;
            double c1 = c * 1.0;
            double d1 = d * 1.0;

            double b2 = Math.pow(b1, 3);
            double c2 = Math.pow(c1, 3);
            double d2 = Math.pow(d1, 3);

            if (b2 + c2 + d2 == a * 1.0) {
                System.out.println("Ovo jeste Amstrongov broj.");
            } else {
                System.out.println("Ovo nije Armstrongov broj.");
            }


        }
    }
}


