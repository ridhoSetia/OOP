package Crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Sparepart {
    String id, nama;
    float harga;

    // DRY: Inisialisasi sekaligus dalam satu constructor
    Sparepart(String id, String nama, float harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public static void tambahSparepart(ArrayList<Sparepart> daftarSparepart, Scanner input) {
        System.out.print("Masukkan ID: ");
        String id = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan harga: ");
        float harga = input.nextFloat();
        
        // Sesuai Modul 2: Menggunakan Parameterized Constructor dan keyword 'new'
        Sparepart baru = new Sparepart(id, nama, harga);
        daftarSparepart.add(baru);
        System.out.println("Data berhasil ditambahkan!");
    }

    public static void tampilkanSparepart(ArrayList<Sparepart> daftarSparepart) {
        if (daftarSparepart.isEmpty()) {
            System.out.println("Daftar kosong.");
            return;
        }
        // Menggunakan Enhanced For Loop sesuai Modul 1
        for (Sparepart m : daftarSparepart) {
            System.out.println("ID: " + (m.id) + " | Nama: " + m.nama + " | Harga: " + m.harga);
        }
    }

    public static void updateSparepart(ArrayList<Sparepart> daftarSparepart, Scanner input) {
        tampilkanSparepart(daftarSparepart);
        if (daftarSparepart.isEmpty()) return;
        
        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Sparepart m : daftarSparepart) {
            if (pilihan == daftarSparepart.indexOf(m) + 1) {
                System.out.print("Masukkan Nama Baru: ");
                m.nama = input.next();
                System.out.print("Masukkan harga Baru: ");
                m.harga = input.nextInt();
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
    
    public static void hapusSparepart(ArrayList<Sparepart> daftarSparepart, Scanner input) {
        tampilkanSparepart(daftarSparepart);
        if (daftarSparepart.isEmpty()) return;

        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Sparepart m : daftarSparepart) {
            if (pilihan == daftarSparepart.indexOf(m) + 1) {
                daftarSparepart.remove(pilihan - 1);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
}