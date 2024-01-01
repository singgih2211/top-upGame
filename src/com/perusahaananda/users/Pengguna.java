package com.perusahaananda.users;

public class Pengguna {
    private String idPengguna;
    private String namaPengguna;
    private double saldoTotal;

    public Pengguna(String idPengguna, String namaPengguna, double saldoAwal) {
        this.idPengguna = idPengguna;
        this.namaPengguna = namaPengguna;
        this.saldoTotal = saldoAwal;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void tambahSaldo(double jumlah) {
        saldoTotal += jumlah;
        System.out.println("Saldo berhasil ditambahkan. Saldo sekarang: " + saldoTotal);
    }
}
