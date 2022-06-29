package Domaci6nedelja.nedelja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    /*Kreirati klasu Student, koja ce imati sledece podatke:
            - ime i prezime studenta
    - broj indexa
    - smer
    - rezultate ispita izrazeni u procentima (51% za polozen ispit)
     U svom programu koristiti klasu i sve navedene parametre gde ce korisnik programa unositi rezultat ispita
      i na osnovu njih poruku da li je student polozio ispit ili ne.
      Mozete koristiti nizove ili liste, ali i ne morate.
      Za najhrabrije dodatak: Unosom samo broja indexa treba da izbaci sve podatke o studentu. Naravno, ovaj deo trazi da se koristi lista.
    */
    private String imeStudenta;
    private String prezimeStudenta;
    private int index;
    private String smer;
    private int ocena;
    private static int brojStudenata = 0;
    private ArrayList<Integer> Indeksi = new ArrayList<>();


    public void dodeliIndexa() {
        brojStudenata++;
        this.index = brojStudenata;
        Indeksi.add(index);


    }


    public Student(String imeStudenta, String prezimeStudenta, String smer,int ocena) {
        this.imeStudenta = imeStudenta;
        this.prezimeStudenta = prezimeStudenta;
        this.smer = smer;
        dodeliIndexa();
        this.ocena = ocena; 

    }

    public Student() {
        this.imeStudenta = "";
        this.prezimeStudenta = "";
        this.smer = "";
        dodeliIndexa();
        this.index = index;

    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public void setPrezimeStudenta(String prezimeStudenta) {
        this.prezimeStudenta = prezimeStudenta;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public int getIndex() {
        return index;
    }

    public ArrayList<Integer> getIndeksi() {
        return Indeksi;
    }
    /*public static void listaStudenata {
        for (int i = 0; i < Indeksi.size(); i++)
            if (imeStudenta.equals("") && prezimeStudenta.equals("")) {
                System.out.println("Student je napustio studije");
            } else {
                System.out.println(imeStudent);


            }
    }*/

    @Override
    public String toString() {
        String opis = "Puno ime studenta: ".concat(imeStudenta).concat(" ").concat(prezimeStudenta).concat("\n");
        opis = opis.concat("Broj indeksa: ").concat(String.valueOf(index)).concat("\n");
        opis = opis.concat("Smer: ").concat(smer).concat("\n");
        return opis;
    }

    public boolean proveraIspita() {

        if (ocena >= 51) {
            System.out.println("Student je polozio ispit.");
            int sum = ((ocena + 9)/10);
            System.out.println("Sa ocenom: " + sum);
            return true;
        } else System.out.println("Student nije polozio ispit.");

        return false;


    }

 }




