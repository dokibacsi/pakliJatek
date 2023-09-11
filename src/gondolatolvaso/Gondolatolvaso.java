/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    static Scanner sc = new Scanner(System.in);
    static String[] pakli = new String[22];

    public static void main(String[] args) {
        kirak();
        kever();
        melyik();    
        ezVolt();
    }

    public static void kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

//        for (int i = 0; i < szinek.length; i++) {
//            pakli[i] = "";
//            for (int j = 0; j < ertek.length; j++) {
//                //System.out.println(pakli[i]);
//                pakli[i] += szinek[i] + " - " + ertek[j];
//            }
//
//        }

        int i = 1;
        for (String szin : szinek) {
            for (int j = 0; i < 22 && j < ertek.length; j++) {
                pakli[i++] = szin+ "_" +ertek[j];
            }
        }
    }

    public static int melyik() {

        System.out.print("Melyik oszlopot választod(1-3): ");
        int oszlop = sc.nextInt();
        
        while(oszlop < 1 || oszlop > 3){
            System.out.println("Az általad megadott számhoz nem tartozik oszlop! \nPróbáld újra!\n");
            System.out.print("Melyik oszlopot választod: ");
            oszlop = sc.nextInt();
        }
        return oszlop - 1;

    }

    public static void kever() {
        switch(2){
            case 1:
                for (int i = 0; i < 7; i++) {
                    pakli[i] = pakli[19 - ( i - 1 ) * 3];
                    pakli[i + 7] = pakli[20 - ( i - 1 ) * 3];
                    pakli[i + 14] = pakli[21 - ( i - 1 ) * 3];
                }
                
        }
    }

    public static void ezVolt() {
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
