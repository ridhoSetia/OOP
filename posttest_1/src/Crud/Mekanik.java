package Crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Mekanik {
    public String id, nama, spesialisasi;

    // DRY: Inisialisasi sekaligus dalam satu constructor
    Mekanik(String id, String nama, String spesialisasi) {
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public static void tambahMekanik(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        System.out.print("Masukkan ID: ");
        String id = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Spesialisasi: ");
        String spesialis = input.next();
        
        // Sesuai Modul 2: Menggunakan Parameterized Constructor dan keyword 'new'
        Mekanik baru = new Mekanik(id, nama, spesialis);
        daftarMekanik.add(baru);
        System.out.println("Data berhasil ditambahkan!");
    }

    public static void tampilkanMekanik(ArrayList<Mekanik> daftarMekanik) {
        if (daftarMekanik.isEmpty()) {
            System.out.println("Daftar kosong.");
            return;
        }
        // Menggunakan Enhanced For Loop sesuai Modul 1
        for (Mekanik m : daftarMekanik) {
            System.out.println("ID: " + (m.id) + " | Nama: " + m.nama + " | Spesialisasi: " + m.spesialisasi);
        }
    }

    public static void updateMekanik(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        tampilkanMekanik(daftarMekanik);
        if (daftarMekanik.isEmpty()) return;
        
        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Mekanik m : daftarMekanik) {
            if (pilihan == daftarMekanik.indexOf(m) + 1) {
                System.out.print("Masukkan Nama Baru: ");
                m.nama = input.next();
                System.out.print("Masukkan Spesialisasi Baru: ");
                m.spesialisasi = input.next();
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
    
    public static void hapusMekanik(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        tampilkanMekanik(daftarMekanik);
        if (daftarMekanik.isEmpty()) return;

        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Mekanik m : daftarMekanik) {
            if (pilihan == daftarMekanik.indexOf(m) + 1) {
                daftarMekanik.remove(pilihan - 1);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
}
