package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    static Scanner sc = new Scanner(System.in);
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        kirak();
        kever();
        kiir();
    }

    public static void kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int j = 0; i < 22 && j < ertek.length; j++) {
                pakli[i++] = szin+ "_" +ertek[j];
            }
        }
    }

    public static int melyik() {

        int oszlop = 0;
        while (oszlop < 1 || oszlop > 3) {
            System.out.print("Hanyadik oszlopban van a kártya: ");
            oszlop = sc.nextInt();
        }
        return oszlop - 1;

    }

    public static void kever() {

    }

    public static void kiir() {
        int j = 1;
        for (int i = 0; i < 7; i++) {
            String sor = "";
            for (int k = 0; k < 3; k++) {
                sor += pakli[j++]+"\t\t";
            }
            System.out.println(sor);
        }

    }

}
