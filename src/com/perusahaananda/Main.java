package com.perusahaananda;

import com.perusahaananda.games.AOVGame;
import com.perusahaananda.sistem.SistemTopUpAOV;
import com.perusahaananda.users.Pengguna;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Contoh pengguna
        Pengguna pengguna = new Pengguna("123", "JohnDoe", 100.0);

        // Contoh game AOV
        AOVGame gameAOV = new AOVGame("AOV", 0);
        SistemTopUpAOV sistemTopUpAOV = new SistemTopUpAOV(gameAOV);

        // Input dan output utama
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("1. Masukkan ID game:");
            System.out.println("2. Lanjut ke:");
            System.out.println("   1. Lihat saldo Game");
            System.out.println("   2. Isi saldo Game");
            System.out.println("   3. Exit");

            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID game: ");
                    String idGame = scanner.next();
                    AOVGame newGameAOV = new AOVGame(idGame, 0);
                    sistemTopUpAOV.setGameAOV(newGameAOV);
                    break;
                case 2:
                    lanjutKeMenu(sistemTopUpAOV, pengguna, scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih. Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 3);
    }

    private static void lanjutKeMenu(SistemTopUpAOV sistemTopUpAOV, Pengguna pengguna, Scanner scanner) {
        int pilihanMenu;
        do {
            System.out.println("1. Lihat saldo Game");
            System.out.println("2. Isi saldo Game");
            System.out.println("3. Kembali ke menu utama");

            System.out.print("Pilih: ");
            pilihanMenu = scanner.nextInt();

            switch (pilihanMenu) {
                case 1:
                    System.out.println("Saldo AOV: " + sistemTopUpAOV.getGameAOV().getSaldo());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah top-up AOV: ");
                    double jumlahTopUpAOV = scanner.nextDouble();
                    sistemTopUpAOV.topUp(pengguna, jumlahTopUpAOV);
                    break;
                case 3:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihanMenu != 3);
    }
}
