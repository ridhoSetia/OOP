package Crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelanggan {
    String nama, jenisKendaraan, keluhan;

    // DRY: Inisialisasi sekaligus dalam satu constructor
    Pelanggan(String nama, String jenisKendaraan, String keluhan) {
        this.nama = nama;
        this.jenisKendaraan = jenisKendaraan;
        this.keluhan = keluhan;
    }

    public static void tambahPelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
        System.out.print("Masukkan ID: ");
        String id = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Keluhan: ");
        String keluhan = input.next();
        
        // Sesuai Modul 2: Menggunakan Parameterized Constructor dan keyword 'new'
        Pelanggan baru = new Pelanggan(id, nama, keluhan);
        daftarPelanggan.add(baru);
        System.out.println("Data berhasil ditambahkan!");
    }

    public static void tampilkanPelanggan(ArrayList<Pelanggan> daftarPelanggan) {
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Daftar kosong.");
            return;
        }
        // Menggunakan Enhanced For Loop sesuai Modul 1
        for (Pelanggan m : daftarPelanggan) {
            System.out.println("Nama: " + m.nama + " | Jenis Kendaraan: " + m.jenisKendaraan + " | Keluhan: " + m.keluhan);
        }
    }

    public static void updatePelanggan(ArrayList<Pelanggan> daftarPelanggan, Scanner input) {
        tampilkanPelanggan(daftarPelanggan);
        if (daftarPelanggan.isEmpty()) return;
        
        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Pelanggan m : daftarPelanggan) {
            if (pilihan == daftarPelanggan.indexOf(m) + 1) {
                System.out.print("Masukkan Nama Baru: ");
                m.nama = input.next();
                System.out.print("Masukkan keluhan Baru: ");
                m.keluhan = input.next();
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
