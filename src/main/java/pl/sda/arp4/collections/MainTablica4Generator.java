package pl.sda.arp4.collections;

import java.util.Random;

public class MainTablica4Generator {

    public static void main(String[] args) {
        int[] tablica = new int[100];


        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(900)+100;

            tablica[i] = wylosowanaLiczba;
        }

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ";");

        }
    }
}
