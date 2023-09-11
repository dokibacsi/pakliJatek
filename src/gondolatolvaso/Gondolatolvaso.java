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

        System.out.print("Melyik oszlopot választod: ");
        int oszlop = sc.nextInt();
        
        while(oszlop < 1 || oszlop > 3){
            oszlop = sc.nextInt();
        }
        return oszlop;

    }

    public static void kever() {

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
