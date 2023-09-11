package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    private static final Scanner sc = new Scanner(System.in);
    private static String[] pakli = new String[22];

    public static void main(String[] args) {
        kirak();
        kever();
        melyik();    
        ezVolt();
    }

    private static void kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int j = 0; i < 22 && j < ertek.length; j++) {
                pakli[i++] = szin+ "_" +ertek[j];
            }
        }
    }

    private static int melyik() {

        System.out.print("Melyik oszlopot választod: ");
        int oszlop = sc.nextInt();
        
        while(oszlop < 1 || oszlop > 3){
            System.out.println("Az általad megadott számhoz nem tartozik oszlop! \nPróbáld újra!\n");
            System.out.print("Melyik oszlopot választod: ");
            oszlop = sc.nextInt();
        }
        return oszlop - 1;

    }

    private static void kever() {

    }

    private static void ezVolt() {
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
