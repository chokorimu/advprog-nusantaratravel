package com.nusantaratravel.ticket;

public class TiketKereta extends Tiket {
    private double subsidiPemerintah;
    private String tipeGerbong;

    public TiketKereta(String kodeBooking, String namaPenumpang, String tipeGerbong) {
        super(kodeBooking, namaPenumpang);
        this.subsidiPemerintah = 5000.0;
        this.tipeGerbong = tipeGerbong;
    }
    
    @Override
    public double hitungTotal() {
        return super.hitungTotal() - this.subsidiPemerintah;
    }

    @Override
    public void cetakTiket() {
        System.out.println("Kode Booking: " + this.kodeBooking);
        System.out.println("Nama Penumpang: " + this.namaPenumpang);
        System.out.println("Jenis Tiket: Tiket Kereta");
        System.out.println("Tipe Gerbong: " + this.tipeGerbong);
        System.out.println("Harga Dasar: Rp" + super.hitungTotal());
        System.out.println("Subsidi Pemerintah: -Rp" + this.subsidiPemerintah);
        System.out.println("Harga Total: Rp" + this.hitungTotal());
        System.out.println("");
    }
}