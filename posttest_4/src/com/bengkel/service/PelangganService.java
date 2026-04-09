package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Pelanggan;

public class PelangganService {
    public static void tambahPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
        System.out.print("Masukkan ID: ");
        String id = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Jenis Kendaraan: ");
        String jenisKendaraan = input.next();
        System.out.print("Masukkan Keluhan: ");
        String keluhan = input.next();
        
        Pelanggan baru = new Pelanggan(id, nama, jenisKendaraan, keluhan);
        daftarPelanggan.add(baru);
        System.out.println("Data berhasil ditambahkan!");
    }

    public static void tampilkanPelanggan(ArrayList<Pelanggan> daftarPelanggan) {
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Daftar kosong.");
            return;
        }
        for (Pelanggan p : daftarPelanggan) {
            System.out.println("Nama: " + p.getNama() + " | Jenis Kendaraan: " + p.getJenisKendaraan() + " | Keluhan: " + p.getKeluhan());
        }
    }

    public static void updatePelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
        tampilkanPelanggan(daftarPelanggan);
        if (daftarPelanggan.isEmpty()) return;
        
        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Pelanggan p : daftarPelanggan) {
            if (pilihan == daftarPelanggan.indexOf(p) + 1) {
                System.out.print("Masukkan Nama Baru: ");
                p.setNama(input.next());
                System.out.print("Masukkan Jenis kendaraan Baru: ");
                p.setJenisKendaraan(input.next());
                System.out.print("Masukkan keluhan Baru: ");
                p.setKeluhan(input.next());
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
    
    public static void hapusPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
        tampilkanPelanggan(daftarPelanggan);
        if (daftarPelanggan.isEmpty()) return;

        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Pelanggan m : daftarPelanggan) {
            if (pilihan == daftarPelanggan.indexOf(m) + 1) {
                daftarPelanggan.remove(pilihan - 1);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
}
