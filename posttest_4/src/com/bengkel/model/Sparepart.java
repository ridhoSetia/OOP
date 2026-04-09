package model;

import core.Identitas;

public class Sparepart extends Identitas {
    private int stok;
    private float harga;

    public Sparepart(String id, String nama, int stok, float harga) {
        super(id, nama);
        this.stok = stok;
        this.harga = harga;
    }

    @Override
    public void updateStatus() {
        System.out.println("Harga sparepart telah dimodifikasi.");
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