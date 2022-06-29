package Domaci5nedelja;

import java.util.Scanner;

public class Zadatak3 {
    /* 3. Написати функцију која враћа String поновљен онолико пута колико му затражимо
Не користити уграђене методе (repeat постоји већ за String, хоћемо да напишемо наш)
Ако је 0, вратити празну ниску
Претпоставити да неће бити негативан број (за сада)*/

    public static void izjava(int n, String c) {

            for (int i = 1; i<=n;
            i++){
                System.out.print(c);
            }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko puta zelite da se ispise:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Unesite izjavu koju zelite da se ispise :");
        String c = sc.nextLine();

        izjava(n,c);


    }
}
