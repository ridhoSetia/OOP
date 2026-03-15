package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Sparepart;

public class SparepartService {
    public static void tambahSparepart(ArrayList<Sparepart> daftarSparepart, Scanner input) {
        System.out.print("Masukkan ID: ");
        String id = input.next();
        System.out.print("Masukkan nama: ");
        String nama = input.next();
        System.out.print("Masukkan stok awal: ");
        int stok = input.nextInt();
        System.out.print("Masukkan harga: ");
        float harga = input.nextFloat();
        
        Sparepart baru = new Sparepart(id, nama, stok, harga);
        daftarSparepart.add(baru);
        System.out.println("Data berhasil ditambahkan!");
    }

    public static void tampilkanSparepart(ArrayList<Sparepart> daftarSparepart) {
        if (daftarSparepart.isEmpty()) {
            System.out.println("Daftar kosong.");
            return;
        }
        for (Sparepart m : daftarSparepart) {
            System.out.println("ID: " + (m.getId()) + " | Nama: " + m.getNama() + " | Stok: " + m.getStok() + " | Harga: " + m.getHarga());
        }
    }

    public static void updateSparepart(ArrayList<Sparepart> daftarSparepart, Scanner input) {
        tampilkanSparepart(daftarSparepart);
        if (daftarSparepart.isEmpty()) return;
        
        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Sparepart s : daftarSparepart) {
            if (pilihan == daftarSparepart.indexOf(s) + 1) {
                System.out.print("Masukkan nama Baru: ");
                s.setNama(input.next());
                System.out.print("Masukkan stok Baru: ");
                s.setStok(input.nextInt());
                System.out.print("Masukkan harga Baru: ");
                s.setHarga(input.nextFloat());
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
