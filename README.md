# Laporan Posttest 1 

Proyek ini adalah aplikasi manajemen data bengkel sederhana menggunakan bahasa pemrograman Java dengan konsep **Object-Oriented Programming (OOP)**. Aplikasi ini memungkinkan pengelolaan data Mekanik, Sparepart, dan Pelanggan melalui operasi CRUD (Create, Read, Update, Delete) yang diimplementasikan secara dinamis menggunakan *Java Reflection*.

## Identitas
- **Nama**: Ridho
- **NIM**: 2409106029

---

## Deskripsi Program
Program ini dirancang untuk mengelola tiga jenis entitas utama di sebuah bengkel:
1. **Mekanik**: Mengelola ID, nama, dan spesialisasi mekanik.
2. **Sparepart**: Mengelola ID, nama, dan harga suku cadang.
3. **Pelanggan**: Mengelola nama pelanggan, jenis kendaraan, dan keluhan.

Keunggulan program ini adalah penggunaan **Generic Method** dan **Java Reflection** pada kelas `Crud.java`, sehingga logika penambahan, penampilan, pembaruan, dan penghapusan data dapat digunakan kembali untuk berbagai jenis *class* (objek) tanpa menulis ulang kode yang sama.

---

## Struktur Folder
Sesuai dengan konfigurasi VS Code, struktur folder proyek ini adalah sebagai berikut:
- `src/`: Berisi kode sumber Java (.java).
    - `Crud/*`: Package untuk logika utama CRUD.
    - `Crud/Helper.java`: Package untuk program pendukung seperti clear screen.
    - `Main.java`: Kelas utama yang berisi definisi objek dan alur program.
---

## Implementasi Fitur

### 1. Create (Tambah Data)
Menambahkan objek baru ke dalam `ArrayList` secara dinamis. Program akan mendeteksi field dari kelas yang bersangkutan dan meminta input kepada pengguna.

### 2. Read (Tampilkan Data)
Menampilkan seluruh data yang tersimpan dalam `ArrayList`. Jika daftar kosong, program akan memberikan notifikasi.

### 3. Update (Ubah Data)
Mengubah data yang sudah ada berdasarkan nomor urut. Program menampilkan nilai lama sebelum meminta pengguna memasukkan nilai baru.

### 4. Delete (Hapus Data)
Menghapus data tertentu dari `ArrayList` berdasarkan indeks nomor yang dipilih pengguna.

---

## Alur Program
### 1. Menu Utama
![alt text](images/image.png) <br>
Misal pilih menu mekanik

### 2. CRUD di menu mekanik
![alt text](images/image-1.png) <br>
disini akan dicontohkan menggunakan menu Mekanik:
- Tambah Mekanik (Create)
- Liat Daftar Mekanik (Read)
- Update Mekanik (Update)
- Hapus Mekanik (Delete)

1. Tambah Mekanik <br>
![alt text](images/image-2.png)

2. Liat Daftar Mekanik <br>
![alt text](images/image-3.png)

3. Update Mekanik <br>
![alt text](images/image-4.png) <br>
![alt text](images/image-5.png)

4. Hapus Mekanik <br>
![alt text](images/image-6.png) <br>
![alt text](images/image-7.png)

5. Keluar <br>
![alt text](images/image-8.png) <br>
![alt text](images/image-9.png)

Berikut adalah draf laporan `README.md` untuk **Posttest 2** yang sudah disesuaikan dengan struktur folder terbaru dan implementasi konsep *Encapsulation* (termasuk penerapan ke-4 jenis *access modifier* untuk poin plus).

---

# Laporan Posttest 2

Proyek ini merupakan pengembangan dari Posttest 1, di mana sistem manajemen bengkel kini telah mengimplementasikan prinsip **Encapsulation** dan **Inheritance**. Data dikelola dengan lebih aman menggunakan *access modifier* dan metode *Getter/Setter*.

## Identitas

* **Nama**: Ridho
* **NIM**: 2409106029

---

## Perubahan Utama (Posttest 2)

Pada pembaruan ini, struktur kode telah dirapikan ke dalam beberapa *package* untuk mendukung penerapan *access modifier* secara maksimal:

1. **`com.bengkel.core`**: Berisi *base class* `Identitas`.
2. **`com.bengkel.model`**: Berisi *subclass* (Mekanik, Sparepart, Pelanggan).
3. **`com.bengkel.service`**: Logika bisnis untuk operasi CRUD.
4. **`com.bengkel.utils`**: Berisi helper untuk tampilan program, jeda, dan clear terminal.

---

## Implementasi Encapsulation

Program ini menerapkan **4 jenis Access Modifier** sebagai berikut:

### 1. Private

Atribut spesifik pada setiap model (seperti `spesialisasi` pada Mekanik atau `stok` pada Sparepart) dideklarasikan sebagai `private`. Atribut ini tidak dapat diakses langsung dari luar kelas tersebut.

* **Contoh**: `private String spesialisasi;`

![alt text](images/image-10.png)

### 2. Protected

Digunakan pada atribut `id` dan `nama` di kelas induk `Identitas`. Hal ini memungkinkan *subclass* di *package* lain untuk mengakses atribut tersebut secara langsung melalui pewarisan.

* **Contoh**: `protected String id, nama;`

![alt text](images/image-11.png)

### 3. Public

Digunakan pada kelas layanan (*service*), *constructor*, serta metode *Getter* dan *Setter* agar fungsi program dapat dipanggil oleh kelas `Main`.

* **Contoh**: `public String getNama()` dan `public static void tambahMekanik()`.

![alt text](images/image-12.png)

### 4. Default (No Modifier)

Metode `infoInternal()` pada kelas `Mekanik` menggunakan akses *default*, sehingga hanya dapat diakses oleh kelas lain yang berada dalam package `model`.

![alt text](images/image-13.png)

---

## Metode Getter dan Setter

Untuk mengelola data yang bersifat `private`, program menggunakan metode **Getter** untuk mengambil nilai dan **Setter** untuk mengubah nilai secara terkontrol.

**Contoh Implementasi pada Sparepart:**

```java
public int getStok() { 
    return stok; 
}
public void setStok(int stok) { 
    this.stok = stok; 
}
```

---

## Struktur Proyek

```text
src/com/bengkel/
├── core/
│   └── Identitas.java      (Base Class - Protected)
├── model/
│   ├── Mekanik.java        (Private, Default)
│   ├── Pelanggan.java
│   └── Sparepart.java
├── service/                (Public CRUD)
│   ├── MekanikService.java
│   ├── PelangganService.java
│   └── SparepartService.java
├── utils/
│   └── Helper.java         (Utilities)
└── Main.java               (Entry Point)

```