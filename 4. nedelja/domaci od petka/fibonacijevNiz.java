package cetvrtak12maj;

import java.util.Scanner;

public class fibonacijevNiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko zelite elemenata fibonacijevog niza:");
        int b = sc.nextInt();

        while (b < 1) {
            System.out.println("Uneli ste pogresan broj.");
            b = sc.nextInt();
        }
        if (b == 1) {
            int prvi = 0;
            System.out.println("Elementi su:");
            System.out.print(prvi);
        } else if (b == 2) {
            int prvi = 0;
            int drugi = 1;
            System.out.println("Elementi su:");
            System.out.print(prvi + " , " + drugi);
        } else {
            int prvi = 0;
            int drugi = 1;
            System.out.println("Elementi su:");
            System.out.print(prvi + " , " + drugi);
            for (int i = 3; i <= b; i++) {
                int naredni = prvi + drugi;

                if (i == b) {
                    System.out.print(" , " + naredni);
                } else {
                    System.out.print(" , " + naredni );

                }
                prvi = drugi;
                drugi = naredni;

            }


        }
    }
}
