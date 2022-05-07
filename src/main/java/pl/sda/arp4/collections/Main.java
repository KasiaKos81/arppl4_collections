package pl.sda.arp4.collections;

public class Main {
    public static void main(String[] args) {
        // deklaracja tablicy
        int[] tablica = new int[5]; // deklaracja zer
        int[] tablicaDeklaracja = new int[]{5, 10, 15, 20, 25};
        tablica[0] = 1; // przypisanie do komórki 0 wartości 1
        tablica[1] = 2;
        tablica[2] = 20;
        tablica[3] = -30;
        tablica[4] = 75;

       // for (int i = 0; i < tablica.length; i++) {
         //   System.out.println(tablica);

        for (int i : tablica) {
            System.out.println(i);
        }

    }

    }


