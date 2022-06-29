package cetvrtak12maj;

import java.util.Arrays;
import java.util.Scanner;

public class DanUGodini {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                int[] mesec = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Unesite godinu:");
        int g = sc.nextInt();
        if (g % 400 == 0 || g %4==0 && g %100!=0) {
            mesec[1] = 29;
        }
        System.out.println("Unesite broj meseca:");
        int m = sc.nextInt();
        while (m> 12 || m < 1) {
            System.out.println("Niste uneli validan mesec.");
            System.out.println("Unesite broj meseca:");
            m = sc.nextInt();
        }
        System.out.println("Unesite dan u mesecu:");
        int d = sc.nextInt();
        while ( d< 1 || d > mesec[m]){
            System.out.println("Zeljeni mesec nema toliko dana.");
            System.out.println("Unesite dan u mesecu:");
            d = sc.nextInt();
        }
        int danUGodini = 0;
        for (int i = 0;i < m-1; i++){
            danUGodini += mesec[i];
        }
        danUGodini += d;
        System.out.println("Ovaj datum je " + danUGodini + " dan u godini.");
    }
}
