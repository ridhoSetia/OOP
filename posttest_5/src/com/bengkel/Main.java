import java.util.Scanner;
import java.util.ArrayList;

import service.*;
import model.*;
import utils.Helper;

public class Main {
    static void mekanikList(Scanner input) throws Exception {
        ArrayList<Mekanik> daftarMekanik = new ArrayList<>();
        int pilihan;

        do {
            Helper.menuCRUD("MEKANIK");

            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    MekanikService.tampilkanMekanik(daftarMekanik);
                    Helper.jeda(input);
                    break;
                case 2:
                    MekanikService.tambahMekanik(daftarMekanik, input);
                    Helper.jeda(input);
                    break;
                case 3:
                    MekanikService.updateMekanik(daftarMekanik, input);
                    Helper.jeda(input);
                    break;
                case 4:
                    MekanikService.hapusMekanik(daftarMekanik, input);
                    Helper.jeda(input);
                    break;
                case 5:
                    MekanikService.prosesAdministrasi(daftarMekanik, input);                    Helper.jeda(input);
                    break;
                case 0:
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
                    SparepartService.tampilkanSparepart(daftarSparepart);
                    Helper.jeda(input);
                    break;
                case 2:
                    SparepartService.tambahSparepart(daftarSparepart, input);
                    Helper.jeda(input);
                    break;
                case 3:
                    SparepartService.updateSparepart(daftarSparepart, input);
                    Helper.jeda(input);
                    break;
                case 4:
                    SparepartService.hapusSparepart(daftarSparepart, input);
                    Helper.jeda(input);
                    break;
                case 0:
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
                    PelangganService.tampilkanPelanggan(daftarPelanggan);
                    Helper.jeda(input);
                    break;
                case 2:
                    PelangganService.tambahPelanggan(daftarPelanggan, input);
                    Helper.jeda(input);
                    break;
                case 3:
                    PelangganService.updatePelanggan(daftarPelanggan, input);
                    Helper.jeda(input);
                    break;
                case 4:
                    PelangganService.hapusPelanggan(daftarPelanggan, input);
                    Helper.jeda(input);
                    break;
                case 0:
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
            System.out.println("0. Keluar");
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
                case 0:
                    System.out.println("Exit Program!\n");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 4);;
    }
}
