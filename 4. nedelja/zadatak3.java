package Domaci4;

import java.util.Scanner;

public class zadatak3 {


    public static void main(String[] args) {
        /*
        Написати програм који исписује збир свих унетих бројева док се не унесе 0
        Напомена: Није неопходан детаљан испис као испод, али је пожељан
        Пример тока програма:
        Унесите број: 5
        Збир је: 5 , Унесите следећи број или 0 да изађете из програма: 3
        Збир је: 8 , Унесите следећи број или 0 да изађете из програма: -7
        Збир је: 1 , Унесите следећи број или 0 да изађете из програма: 0
        Укупан збир је 1
         */
        System.out.println("Unesite broj:");
        Scanner sc = new Scanner(System.in);
        int zbir = 0;
        int a = sc.nextInt();
        while (a != 0) {
            zbir = zbir += a;
            System.out.println("Zbir je: " + zbir);
            System.out.print("Unesite sledeci broj ili 0 da izadjete iz programa: ");
            a = sc.nextInt();

        }
    }
}
