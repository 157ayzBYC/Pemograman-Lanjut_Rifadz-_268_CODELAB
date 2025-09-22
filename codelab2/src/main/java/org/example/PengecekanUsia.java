package org.example;

import java.util.Scanner;

class unvalidAge extends Exception {
    public unvalidAge(String pesan) {
        super(pesan);
    }
}

class PengecekanUsia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Silakan masukkan usia Anda: ");
        try {
            int usia = scanner.nextInt();

            validasiUsia(usia);

            System.out.println("Usia yang Anda masukkan: " + usia);
        } catch (unvalidAge e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Mohon Maaaf terdapat kesalahan:harus berupa angka agar bisa di baca oleh system!");
        } finally {
            scanner.close();
        }
    }

    static void validasiUsia(int usia) throws unvalidAge {
        if (usia < 1 || usia > 119) {
            throw new unvalidAge("Usia harus di antara 1 sampai 119.");
        }
    }
}
