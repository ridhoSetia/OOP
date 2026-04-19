package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Mekanik;

public abstract class MekanikService {
    public static void tambahMekanik(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        System.out.print("Masukkan ID: ");
        String id = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Spesialisasi: ");
        String spesialis = input.next();

        Mekanik baru = new Mekanik(id, nama, spesialis);
        baru.panggilInfo();
        daftarMekanik.add(baru);
        System.out.println("Data berhasil ditambahkan!");
    }

    // Public: agar Main.java bisa memanggil metode ini
    public static void tampilkanMekanik(ArrayList<Mekanik> daftarMekanik) {
        if (daftarMekanik.isEmpty()) {
            System.out.println("Daftar kosong.");
            return;
        }
        for (Mekanik m : daftarMekanik) {
            // penggunaan abstract metod
            m.tampilkanProfil();
        }
    }

    public static void updateMekanik(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        tampilkanMekanik(daftarMekanik);
        if (daftarMekanik.isEmpty())
            return;

        System.out.print("Pilih (1,2,..): ");
        int pilihan = input.nextInt();

        for (Mekanik m : daftarMekanik) {
            if (pilihan == daftarMekanik.indexOf(m) + 1) {
                System.out.print("Masukkan Nama Baru: ");
                m.setNama(input.next());
                System.out.print("Masukkan Spesialisasi Baru: ");
                m.setSpesialisasi(input.next());

                m.updateStatus();
                System.out.println("Data berhasil diupdate!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }

    public static void hapusMekanik(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        tampilkanMekanik(daftarMekanik);
        if (daftarMekanik.isEmpty())
            return;

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

    public static void prosesAdministrasi(ArrayList<Mekanik> daftarMekanik, Scanner input) {
        tampilkanMekanik(daftarMekanik);
        if (daftarMekanik.isEmpty())
            return;

        System.out.print("Pilih mekanik untuk diproses (1,2,..): ");
        int pilihan = input.nextInt();

        // Validasi indeks
        if (pilihan > 0 && pilihan <= daftarMekanik.size()) {
            Mekanik m = daftarMekanik.get(pilihan - 1);

            System.out.println("Memulai Proses Dokumentasi");
            // Memanggil metode dari Interface IDokumentasi
            m.verifikasiData();
            m.buatLaporan();
            System.out.println("");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
