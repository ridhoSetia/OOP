package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Sparepart;

public class SparepartService {;
    // Overload
    public static void ubahHarga(Sparepart s, float hargaBaru) {
        s.setHarga(hargaBaru);
        s.updateStatus();
    }

    public static void ubahHarga(Sparepart s, double persentase) {
        float hargaAwal = s.getHarga();
        float hargaBaru = hargaAwal + (hargaAwal * (float)persentase);
        s.setHarga(hargaBaru);
        s.updateStatus();
    }

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
                System.out.println("Metode update harga:");
                System.out.println("1. Harga Manual");
                System.out.println("2. Persentase Kenaikan");
                System.out.print("Pilih metode: ");
                int opsi = input.nextInt();

                if (opsi == 1) {
                    System.out.print("Masukkan harga Baru (float): ");
                    float hrg = input.nextFloat();
                    ubahHarga(s, hrg);
                } else {
                    System.out.print("Masukkan persentase kenaikan (contoh 0.1 untuk 10%): ");
                    double persen = input.nextDouble();
                    ubahHarga(s, persen);
                }
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
