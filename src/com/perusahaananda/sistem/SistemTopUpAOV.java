package com.perusahaananda.sistem;

import com.perusahaananda.games.AOVGame;
import com.perusahaananda.users.Pengguna;

public class SistemTopUpAOV {
    private AOVGame gameAOV;

    public SistemTopUpAOV(AOVGame gameAOV) {
        this.gameAOV = gameAOV;
    }

    public AOVGame getGameAOV() {
        return gameAOV;
    }

    public void setGameAOV(AOVGame gameAOV) {
        this.gameAOV = gameAOV;
    }

    public void topUp(Pengguna pengguna, double jumlah) {
        if (gameAOV != null) {
            gameAOV.topUp(jumlah);
            pengguna.tambahSaldo(jumlah);
        } else {
            System.out.println("Game AOV tidak ditemukan.");
        }
    }
}
