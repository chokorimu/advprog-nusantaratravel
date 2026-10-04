package com.nusantaratravel.ticket;

public class Tiket {
    protected String kodeBooking;
    protected String namaPenumpang;
    protected double hargaDasar;

    public Tiket(String kodeBooking, String namaPenumpang) {
        this.kodeBooking = kodeBooking;
        this.namaPenumpang = namaPenumpang;
        this.hargaDasar = 100000.0;
    }

    public double hitungTotal() {
        return this.hargaDasar;
    }

    public void cetakTiket() {
        System.out.println("Kode Booking: " + this.kodeBooking);
        System.out.println("Nama Penumpang: " + this.namaPenumpang);
        System.out.println("Jenis Tiket: Tiket Umum");
        System.out.println("Total Harga: Rp" + this.hitungTotal());
        System.out.println("");
    }
}