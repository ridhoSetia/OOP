import java.util.Scanner;

import Crud.Clear;

import java.util.ArrayList;
import static Crud.Crud.*;

class Sparepart {
    String id;
    String nama;
    float harga;

    Sparepart() {
    }
}

class Mekanik {
    String id;
    String nama;
    String spesialisasi;

    Mekanik() {
    }
}

class Pelanggan {
    String nama;
    String jenisKendaraan;
    String keluhan;

    Pelanggan() {
    }
}

public class Main {
    static void mekanikList(Scanner input) throws Exception {
        ArrayList<Mekanik> daftarMekanik = new ArrayList<>();
        int pilihan;

        do {
            menuCRUD("MEKANIK");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanData(daftarMekanik, input);
                    break;
                case 2:
                    tambahData(daftarMekanik, input, Mekanik.class);
                    break;
                case 3:
                    updateData(daftarMekanik, input);
                    break;
                case 4:
                    hapusData(daftarMekanik, input);
                    break;
                case 5:
                    System.out.println("Exit Menu!\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 5);
    }

    static void sparepartList(Scanner input) throws Exception {
        ArrayList<Sparepart> daftarSparepart = new ArrayList<>();
        int pilihan;

        do {
            menuCRUD("SPAREPART");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanData(daftarSparepart, input);
                    break;
                case 2:
                    tambahData(daftarSparepart, input, Sparepart.class);
                    break;
                case 3:
                    updateData(daftarSparepart, input);
                    break;
                case 4:
                    hapusData(daftarSparepart, input);
                    break;
                case 5:
                    System.out.println("Exit Menu!\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 5);
    }

    static void pelangganList(Scanner input) throws Exception {
        ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
        int pilihan;

        do {
            menuCRUD("PELANGGAN");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanData(daftarPelanggan, input);
                    break;
                case 2:
                    tambahData(daftarPelanggan, input, Pelanggan.class);
                    break;
                case 3:
                    updateData(daftarPelanggan, input);
                    break;
                case 4:
                    hapusData(daftarPelanggan, input);
                    break;
                case 5:
                    System.out.println("Exit Menu!\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 5);;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            Clear.clearScreen();
            System.out.println("=== MENU BENGKEL  ===");
            System.out.println("1. Mekanik");
            System.out.println("2. Sparepart");
            System.out.println("3. Pelanggan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            // Membaca input angka
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    mekanikList(input);
                    break;
                case 2:
                    sparepartList(input);
                    break;
                case 3:
                    pelangganList(input);
                    break;
                case 4:
                    System.out.println("Exit Program!\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 4);;
    }
}
