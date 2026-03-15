package model;

import core.Identitas;

public class Pelanggan extends Identitas { 
    private String jenisKendaraan, keluhan;

    public Pelanggan(String id, String nama, String jenisKendaraan, String keluhan) {
        super(id, nama);
        this.jenisKendaraan = jenisKendaraan;
        this.keluhan = keluhan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
    public String getKeluhan() {
        return keluhan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
}
