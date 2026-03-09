import java.util.Scanner;

import static Crud.Helper.jeda;

import java.util.ArrayList;

import Crud.*;

public class Main {
    static void mekanikList(Scanner input) throws Exception {
        ArrayList<Mekanik> daftarMekanik = new ArrayList<>();
        int pilihan;

        do {
            Helper.menuCRUD("MEKANIK");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    Mekanik.tampilkanMekanik(daftarMekanik);
                    jeda(input);
                    break;
                case 2:
                    Mekanik.tambahMekanik(daftarMekanik, input);
                    jeda(input);
                    break;
                case 3:
                    Mekanik.updateMekanik(daftarMekanik, input);
                    jeda(input);
                    break;
                case 4:
                    Mekanik.hapusMekanik(daftarMekanik, input);
                    jeda(input);
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
            Helper.menuCRUD("SPAREPART");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    Sparepart.tampilkanSparepart(daftarSparepart);
                    jeda(input);
                    break;
                case 2:
                    Sparepart.tambahSparepart(daftarSparepart, input);
                    jeda(input);
                    break;
                case 3:
                    Sparepart.updateSparepart(daftarSparepart, input);
                    jeda(input);
                    break;
                case 4:
                    Sparepart.hapusSparepart(daftarSparepart, input);
                    jeda(input);
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
            Helper.menuCRUD("PELANGGAN");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    Pelanggan.tampilkanPelanggan(daftarPelanggan);
                    jeda(input);
                    break;
                case 2:
                    Pelanggan.tambahPelanggan(daftarPelanggan, input);
                    jeda(input);
                    break;
                case 3:
                    Pelanggan.updatePelanggan(daftarPelanggan, input);
                    jeda(input);
                    break;
                case 4:
                    Pelanggan.hapusPelanggan(daftarPelanggan, input);
                    jeda(input);
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
            Helper.clearScreen();
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
