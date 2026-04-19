package model;

import core.Identitas;
import core.ManajemenAset;

public class Sparepart extends Identitas implements ManajemenAset {
    private int stok;
    private float harga;

    public Sparepart(String id, String nama, int stok, float harga) {
        super(id, nama);
        this.stok = stok;
        this.harga = harga;
    }

    // Implementasi dari Identitas
    @Override
    public void tampilkanProfil() {
        System.out.println("[Sparepart] ID: " + id + " | Item: " + nama + " | Harga: Rp" + harga);
    }

    // Implementasi dari Interface ManajemenAset
    @Override
    public void perbaruiStatus() {
        if (stok < 5) {
            System.out.println("Peringatan: Stok " + nama + " hampir habis!");
        } else {
            System.out.println("Status: Stok " + nama + " aman.");
        }
    }

    @Override
    public void tampilkanKetersediaan() {
        System.out.println("Sisa Stok " + nama + ": " + stok + " unit.");
    }

    public int getStok() {
        return stok;
    }
    public float getHarga() {
        return harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setHarga(float harga) {
        this.harga = harga;
    }
}