package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    private static final Scanner sc = new Scanner(System.in);
    private static String[] pakli = new String[22];

    public static void main(String[] args) {
        kirak();
        kever();
        ezVolt();
        int valasztas = melyik();
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
        switch (melyik()) {
            case 1:
                for (int i = 2; i < 7; i++) { //fontos h itt kettessel kezdődik a számolás és a ciklus után csináljuk az egyest
                    pakli[i] = pakli[20 - (i - 1) * 3];
                    pakli[i + 7] = pakli[19 - (i - 1) * 3];
                    pakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                pakli[1] = pakli[20];
                break;
            case 2:
                break;
            case 3:
                break;
        }
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
