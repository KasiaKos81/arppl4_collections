package pl.sda.arp4.collections;

import java.util.Arrays;
import java.util.Scanner;

public class MainTablica2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę:");
            int wpisanaLiczba = scanner.nextInt();

            tablica[i] = wpisanaLiczba;

        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");

        }
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];


        }
        System.out.println();
        System.out.print("suma:" + suma);

        // d szukanie minimum

        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne minimum jest większe niż element tablicy
            if (minimum > tablica[i]) {
                // to znaczy, że znaleźliśmy nadpisać minimum
                // znaleźliśmy mniejszy element
                minimum = tablica[i];
            }
        }
        System.out.println("Minimum: " + minimum);

        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne max jest większe niż element tablicy
            if (maksimum < tablica[i]) {
                // to znaczy, że znaleźliśmy nadpisać max
                // znaleźliśmy mniejszy element
                maksimum = tablica[i];
            }
        }
        System.out.println("Maksimum " + maksimum);

        // f znajdź i wypisz numer komórki największego elementu w tablicy

        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
                indeksMaksimum = i;
            }
        }
        System.out.println("Maksimm o wartości: " + szukaneMaksimum + " znalezione w komórce: " + indeksMaksimum);

    // g średnia arytmetyczna

        double zmiennaSrednia = ((double)suma) / tablica.length;
        System.out.println("Średnia " + zmiennaSrednia);

        // h. wypisz ilośc elem większych od średniej

        int licznikWiekszychElementow = 0;

        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] > zmiennaSrednia) {
                System.out.println(tablica[i] + " ");
                licznikWiekszychElementow = licznikWiekszychElementow+1;
            }
        }
        System.out.println("Licznik większych elementów " + licznikWiekszychElementow);

        // i wypisz tablicę w odwrotnj kolejności

        for (int i = tablica.length-1; i >= 0 ; i--) {
            System.out.print(tablica[i] + " ");

        }
// sortowanie tablicy
        System.out.println("sortowanie");
        Arrays.sort(tablica);
        System.out.println(Arrays.toString(tablica));

        // j. wypisanie mediany (środkowa wartośc tablicy)
        // 10 elementów  0 1 2 3 4 5 6 7 8 9 -> 4.5
        // 11 elementów 0 1 2 3 4 5 6 7 8 9 -> 5

        double mediana;
        if(tablica.length % 2 == 0) {
            // parzysta liczba elementów

            int indeksSrodkowyElement = tablica.length / 2;

            int wartosc1 = tablica[indeksSrodkowyElement];
            int wartosc2 = tablica[indeksSrodkowyElement - 1];

            mediana = (wartosc1 + wartosc2) / 2.0;

        } else {
            // nieparzysta liczba elementów

            int indeksSrodkowyElement = tablica.length / 2;
            mediana = tablica[indeksSrodkowyElement];
        }
        System.out.println("Mediana: " + mediana);


    }}
