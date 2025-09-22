package org.example;

import java.util.ArrayList;

public class Codelab1 {
    public static void main(String[] args) {
        // Array berisi beberapa nama
        String[] nama = {"Adi", "Budi", "Cahyo", "Diana", "Eva"};

        // Cari semua nama terpanjang
        ArrayList<String> namaTerpanjang = mencariNamaTerpanjang(nama);

        //  mencetak Cetak hasil
        System.out.println("Nama terpanjang adalah: " + namaTerpanjang);
    }

    // Method untuk mencari semua nama terpanjang
    public static ArrayList<String> mencariNamaTerpanjang(String[] array) {
        ArrayList<String> hasil = new ArrayList<>();
        int panjangMax = 0;

        // Langkah 1: Cari panjang maksimum
        for (String nama : array) {
            if (nama.length() > panjangMax) {
                panjangMax = nama.length();
            }
        }

        for (String nama : array) {
            if (nama.length() == panjangMax) {
                hasil.add(nama);
            }
        }

        return hasil;
    }
}
