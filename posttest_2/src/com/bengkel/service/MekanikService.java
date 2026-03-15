package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Mekanik;

public class MekanikService {
    public static void tambahMekanik(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        System.out.print("Masukkan ID: ");
        String id = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Spesialisasi: ");
        String spesialis = input.next();
        
        Mekanik baru = new Mekanik(id, nama, spesialis);
        daftarMekanik.add(baru);
        System.out.println("Data berhasil ditambahkan!");
    }

    // Public: agar Main.java bisa memanggil metode ini
    public static void tampilkanMekanik(ArrayList<Mekanik> daftarMekanik) {
        for (Mekanik m : daftarMekanik) {
            // Mengakses protected (nama) dan private via getter (spesialisasi)
            System.out.println("ID: " + m.getId() + " | Nama: " + m.getNama() + 
                            " | Spesialisasi: " + m.getSpesialisasi());
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
                m.setNama(input.next());
                System.out.print("Masukkan Spesialisasi Baru: ");
                m.setSpesialisasi(input.next());
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
