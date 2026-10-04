package com.nusantaratravel.app;
    
import com.nusantaratravel.ticket.Tiket;
import com.nusantaratravel.ticket.TiketPesawat;
import com.nusantaratravel.ticket.TiketKereta;

public class Main {
    public static void main(String[] args) {
        Tiket[] daftarTiket = new Tiket[] {
            new Tiket("TKT-001", "Budi Santoso"),
            new TiketPesawat("PSW-002", "Siti Aminah"),
            new TiketKereta("KRT-003", "Andi Wijaya", "Eksekutif")
        };

        for (Tiket tiket : daftarTiket) {
            tiket.cetakTiket();
        }
    }
}