package pl.sda.arp4.collections;

import java.util.Random;

// Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
//wypełnij je losowymi wartościami z przedziału -10 - 10
//wypisz na ekranie zawartość tablicy

public class MainTablica1 {

    public static void main(String[] args) {

        int[] tablica = new int[10];

        // a

        for (int i = 0; i < tablica.length; i++) {
            // new Random().nextInt(21) -> losuje od 0 do 21 (bez 21)
            // new Random().nextInt(21) -> losuje od 0 do 21 (bez 21) odejmuje potem -10
            int wylosowanaLiczba = new Random().nextInt(21)-10;

            tablica[i] = wylosowanaLiczba;
        }
        // b

        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);

        }
    }
}
