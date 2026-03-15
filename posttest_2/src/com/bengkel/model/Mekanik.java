package model;

import core.Identitas;

public class Mekanik extends Identitas {
    private String spesialisasi;

    public Mekanik(String id, String nama, String spesialisasi) {
        super(id, nama);
        this.spesialisasi = spesialisasi;
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
}