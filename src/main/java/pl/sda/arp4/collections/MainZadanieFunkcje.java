package pl.sda.arp4.collections;

public class MainZadanieFunkcje {

    public static void main(String[] args) {


        // c. wypisz sumę elementów w tablicy
        //d. znajdź i wypisz najmniejszy element tablicy
        //e. znajdź i wypisz największy element tablicy
        //f. znajdź i wypisz numer komórki największego elementu w tablicy
        //g. wypisz średnią arytmetyczną tablicy
        //h. wypisz ilość elementów większych/mniejszych od średniej
        //i. wypisz tablicę w odwrotnej kolejności

        int[] tablica = new int[]{1, 2, 3, 4, 5};

        // suma elementów

        int sumaMain = sumujElementy(tablica);
        System.out.println("suma: " + sumaMain);

        // d. szukanie minimum
        int znalezioneMinimum = znajdzMinimum(tablica);
        System.out.println("minimum: " + znalezioneMinimum);

        int znalezioneMaksimum = znajdzMaksimum(tablica);
        System.out.println("maksimum: " + znalezioneMaksimum);

        // f. znajdź i wypisz numer komórki największego elementu w tablicy
        int znalezionyIndeksMaksimum = znajdzIndeksMaksimum(tablica);
        System.out.println("znaleziony indeks max: " + znalezionyIndeksMaksimum);

        double zmiennaSrednia = obliczSrednia(tablica);
        System.out.println("Srednia :" + zmiennaSrednia);


        int ilosc = iloscElementowWiekszychodSredniej(tablica);
        System.out.println("Ilość elementów większyc od średniej: " + ilosc);

        // i. wypisz tablicę w odwrotnej kolejności
        wypiszTabliceWOdwrotnejKolejnosci(tablica);

    }

    private static void wypiszTabliceWOdwrotnejKolejnosci(int[] tablica) {
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }
    }

    private static int iloscElementowWiekszychodSredniej(int[] tablica) {
        double zmiennaSrednia = obliczSrednia(tablica);
        int licznikWiekszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > zmiennaSrednia) { // tylko dla elementów większych od średniej
              //  System.out.print(tablica[i] + " ");
                licznikWiekszychElementow = licznikWiekszychElementow + 1;
            }
        }
        return licznikWiekszychElementow;
    }

    private static double obliczSrednia(int[] tablica) {
        double suma = sumujElementy(tablica);
        double srednia = suma / tablica.length;
        return srednia;
    }

    private static int znajdzIndeksMaksimum(int[] tablica) {
        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
                indeksMaksimum = i;
            }
        }
        return indeksMaksimum;
    }

    private static int znajdzMaksimum(int[] tablica) {
        // e. znajdź i wypisz największy element tablicy
        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne maksimum jest mniejsze niż element tablicy
            if (maksimum < tablica[i]) {
                // musimy nadpisać maksimum elementem tablicy
                maksimum = tablica[i];
            }
        }
        return maksimum;
    }

    private static int znajdzMinimum(int[] tablica) {
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne minimum jest większe niż element tablicy
            if (minimum > tablica[i]) {
                // to znaczy że musimy nadpisać minimum
                // znaleźliśmy mniejszy element
                minimum = tablica[i];
            }
        }
        return minimum;
    }

    private static int sumujElementy(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            // tablica[i] to wartość (liczba) w komórce
            suma = suma + tablica[i];

        }
        // zwracamy wynik, wynikiem jest wartość
        return suma;
    }



}
