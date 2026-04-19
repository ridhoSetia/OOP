package model;

import core.IDdokumentasi;
import core.Identitas;

public class Mekanik extends Identitas implements IDdokumentasi {
    private String spesialisasi;

    public Mekanik(String id, String nama, String spesialisasi) {
        super(id, nama);
        this.spesialisasi = spesialisasi;
    }

    // Implementasi dari abstract class Identitas
    @Override
    public void tampilkanProfil() {
        System.out.println("[Mekanik] ID: " + id + " | Nama: " + nama + " | Spesialisasi: " + spesialisasi);
    }

    // Implementasi dari interface IDokumentasi
    @Override
    public void buatLaporan() {
        System.out.println("Menyusun laporan kinerja mekanik: " + nama);
    }

    @Override
    public void verifikasiData() {
        System.out.println("Memverifikasi sertifikasi spesialisasi: " + spesialisasi);
    }

    // Public: agar service bisa mengambil/mengubah data private ini
    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    // Default: bisa diakses oleh class dalam package com.bengkel.model
    void infoInternal() {
        System.out.println("Akses internal package model.");
    }

    public void panggilInfo() {
        infoInternal(); // Memanggil metode default dari dalam kelas yang sama
    }
}