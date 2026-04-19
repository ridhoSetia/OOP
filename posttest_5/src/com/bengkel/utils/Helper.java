package utils;
import java.util.Scanner;

public class Helper {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n");
        System.out.println("\n");
    }

    public static void jeda(Scanner input) {
        System.out.println("Tekan ENTER untuk lanjut...");
        input.nextLine();
        input.nextLine(); 
    }

    public static void menuCRUD(String namaClass) {
        clearScreen();
        System.out.println("=== MENU " + namaClass + " ===");        
        System.out.println("1. LIAT DAFTAR " + namaClass);
        System.out.println("2. TAMBAH " + namaClass);
        System.out.println("3. UPDATE " + namaClass);
        System.out.println("4. HAPUS " + namaClass);
        if (namaClass == "MEKANIK") {
            System.out.println("5. Proses Administrasi");
        }
        System.out.println("0. Keluar");
        System.out.print("Pilih menu (1-5): ");
            
    }
}
