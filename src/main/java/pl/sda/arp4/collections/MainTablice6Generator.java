package pl.sda.arp4.collections;

import java.util.Arrays;
import java.util.Random;

public class MainTablice6Generator {

    public static void main(String[] args) {
        int[] tablica = new int[10];

        int licznik = 0;
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(10);
            tablica[i] = wylosowanaLiczba;
            if(wylosowanaLiczba == 5){
                licznik++;
            }
        }

            System.out.println(Arrays.toString(tablica));
        System.out.println("Licznik: " + licznik);


        }




    }


