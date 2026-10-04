package com.nusantaratravel.ticket;

public class TiketPesawat extends Tiket {
    private double pajakBandara;
    private double biayaBagasi;

    public TiketPesawat(String kodeBooking, String namaPenumpang) {
        super(kodeBooking, namaPenumpang);
        this.pajakBandara = 25000.0;
        this.biayaBagasi = 10000.0;
    }
    
    @Override
    public double hitungTotal() {
        return super.hitungTotal() + this.pajakBandara + this.biayaBagasi;
    }

    @Override
    public void cetakTiket() {
        System.out.println("Kode Booking: " + this.kodeBooking);
        System.out.println("Nama Penumpang: " + this.namaPenumpang);
        System.out.println("Jenis Tiket: Tiket Pesawat");
        System.out.println("Harga Dasar: Rp" + super.hitungTotal());
        System.out.println("Pajak Bandara: Rp" + this.pajakBandara);
        System.out.println("Biaya Bagasi: Rp" + this.biayaBagasi);
        System.out.println("Harga Total: Rp" + this.hitungTotal());
        System.out.println("");
    }
}