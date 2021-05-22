/*  Uebung Array initialisieren
    und mit Werten belegen
    2021-05-21
    marcus.pjetrog.2020@gmail.com
 */

package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rd = new Random();
        int[] zuZahlen = new int[6];

        // Daten in Array einfügen
        for (int i = 0; i < zuZahlen.length;i++){
            int zufallZahl = rd.nextInt(50);
            zuZahlen[i] = zufallZahl;
        }
        // Daten aus Array auslesen
        for (int i = 0; i < zuZahlen.length;i++){
            if (i == 0){
                System.out.print(zuZahlen[i]);
            }else{
                System.out.print(" ," + zuZahlen[i]);
            }
        }
    }
}

