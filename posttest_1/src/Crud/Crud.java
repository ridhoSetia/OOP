package Crud;
import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    public static <T> void tampilkanData(ArrayList<T> daftar, Scanner input) throws Exception {
        if (daftar.isEmpty()) {
            input.nextLine(); 

            System.out.println("Daftar kosong.");
            System.out.println("Tekan ENTER untuk lanjut...");
            
            input.nextLine();
            return;
        }


        System.out.println("\n--- Data ---");
            for (int i = 0; i < daftar.size(); i++) {
                T objek = daftar.get(i);
                System.out.print((i + 1) + ". "); // Menampilkan nomor urut
                
                java.lang.reflect.Field[] fields = objek.getClass().getDeclaredFields();
                for (java.lang.reflect.Field field : fields) {
                    field.setAccessible(true);
                    // Mengambil nilai field secara dinamis
                    System.out.print(field.getName() + ": " + field.get(objek) + " | ");
                }
                System.out.println();
            }

        input.nextLine(); 
        System.out.println("Tekan ENTER untuk lanjut...");
        input.nextLine(); 
    }

    public static <T> void tambahData(ArrayList<T> daftar, Scanner input, Class<T> tipe) throws Exception {
        // 1. Cari constructor, lalu paksa buka aksesnya (untuk akses antar package)
        java.lang.reflect.Constructor<T> constructor = tipe.getDeclaredConstructor();
        constructor.setAccessible(true); 
        T objekBaru = constructor.newInstance();

        // 2. Ambil semua field yang ada di class tersebut secara dinamis
        java.lang.reflect.Field[] fields = tipe.getDeclaredFields();

        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true); // Supaya bisa mengisi field
            
            System.out.print("Masukkan " + field.getName() + " " + tipe.getSimpleName().toLowerCase() + ": ");

            // 3. Logika input berdasarkan tipe field
            if (field.getType() == String.class) {
                field.set(objekBaru, input.next());
                input.nextLine(); // Bersihkan buffer
            } 
            else if (field.getType() == float.class) {
                field.set(objekBaru, input.nextInt());
                input.nextLine(); // Bersihkan buffer
            }
        }
        daftar.add(objekBaru);
        System.out.println("Data berhasil ditambahkan!");
    
        System.out.println("Tekan ENTER untuk lanjut...");
        input.nextLine(); 
    }

    public static <T> void updateData(ArrayList<T> daftar, Scanner input) throws Exception {
        tampilkanData(daftar, input);
        if (daftar.isEmpty()) return;

        System.out.print("Pilih nomor data yang ingin diubah: ");
        int nomor = input.nextInt();
        input.nextLine(); // Bersihkan buffer

        if (nomor > 0 && nomor <= daftar.size()) {
            T objek = daftar.get(nomor - 1);
            java.lang.reflect.Field[] fields = objek.getClass().getDeclaredFields();

            System.out.println("Masukkan data baru:");
            for (java.lang.reflect.Field field : fields) {
                field.setAccessible(true);
                System.out.print("Ubah " + field.getName() + " (saat ini: " + field.get(objek) + "): ");

                if (field.getType() == String.class) {
                    field.set(objek, input.next());
                    input.nextLine();
                } else if (field.getType() == int.class) {
                    field.set(objek, input.nextInt());
                    input.nextLine();
                } else if (field.getType() == float.class) {
                    field.set(objek, input.nextFloat());
                    input.nextLine();
                }
            }
        System.out.println("Data berhasil diperbarui!");
        
        } else {
            System.out.println("Nomor tidak valid.");
        }

        System.out.println("Tekan ENTER untuk lanjut...");
        input.nextLine(); 
    }

    public static <T> void hapusData(ArrayList<T> daftar, Scanner input) throws Exception {
        tampilkanData(daftar, input);
        if (daftar.isEmpty()) return;

        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int nomor = input.nextInt();
        input.nextLine(); // Bersihkan buffer

        if (nomor > 0 && nomor <= daftar.size()) {
            daftar.remove(nomor - 1);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
        
        System.out.println("Tekan ENTER untuk lanjut...");
        input.nextLine(); 
    }

    public static void menuCRUD(String namaClass) {
        Clear.clearScreen();
        System.out.println("=== MENU " + namaClass + " ===");        
        System.out.println("1. LIAT DAFTAR " + namaClass);
        System.out.println("2. TAMBAH " + namaClass);
        System.out.println("3. UPDATE " + namaClass);
        System.out.println("4. HAPUS " + namaClass);
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
            
    }
}
