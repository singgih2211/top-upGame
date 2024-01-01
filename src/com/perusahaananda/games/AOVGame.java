package com.perusahaananda.games;

public class AOVGame {
    private String idGame;
    private double saldo;

    public AOVGame(String idGame, double saldoAwal) {
        this.idGame = idGame;
        this.saldo = saldoAwal;
    }

    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top-up AOV berhasil. Saldo sekarang: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
