package core;

public class Identitas {
    protected String id, nama;
    
    public Identitas(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public void updateStatus() {
        System.out.println("Berhasil memperbarui data identitas dasar...");
    }

    // Public: agar bisa dipanggil dari package manapun (seperti di service)
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
