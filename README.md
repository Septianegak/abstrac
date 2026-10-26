# Sistem Penggajian Karyawan (PBO Case Study)

Proyek ini dibuat untuk memenuhi tugas **Studi Kasus dan Diskusi Pemrograman Berbasis Objek (PBO)**. Program ini mensimulasikan sistem penggajian sederhana dengan menerapkan konsep-konsep utama PBO dalam bahasa pemrosesan Java.

---

## 📌 Konsep PBO yang Diterapkan

1. **Interface (`Cetakable`)**
   - Mendefinisikan kontrak/perilaku tambahan `cetakLaporan()` yang wajib diimplementasikan oleh kelas yang menggunakannya.
2. **Abstract Class (`Karyawan`)**
   - Bertindak sebagai *template* dasar untuk semua jenis karyawan.
   - Memiliki *abstract method* `hitungGaji()` yang pemrosesan spesifiknya diserahkan ke kelas turunan.
   - Mengimplementasikan interface `Cetakable`.
3. **Inheritance (Pewarisan)**
   - Kelas `KaryawanTetap` dan `KaryawanKontrak` menurunkan atribut (`nama`, `id`) dan method dari kelas induk `Karyawan`.
4. **Polymorphism (Banyak Bentuk)**
   - **Method Overriding**: Kelas `KaryawanTetap` dan `KaryawanKontrak` meng-override method `hitungGaji()` sesuai dengan rumus gaji masing-masing.
   - **Dynamic Binding**: Penggunaan variabel bertipe kelas induk (`Karyawan`) untuk menampung instans dari kelas turunan pada saat runtime.

---

## 📐 Class Diagram

### Visual Diagram (Mermaid)
```mermaid
classDiagram
    class Cetakable {
        <<interface>>
        +cetakLaporan()* void
    }

    class Karyawan {
        <<abstract>>
        #String nama
        #String id
        +Karyawan(String nama, String id)
        +hitungGaji()* double
        +cetakLaporan() void
    }

    class KaryawanTetap {
        -double gajiPokok
        -double bonus
        +KaryawanTetap(String nama, String id, double gajiPokok, double bonus)
        +hitungGaji() double
    }

    class KaryawanKontrak {
        -double tarifPerJam
        -int jamKerja
        +KaryawanKontrak(String nama, String id, double tarifPerJam, int jamKerja)
        +hitungGaji() double
    }

    Cetakable <|.. Karyawan : Implements
    Karyawan <|-- KaryawanTetap : Inherits
    Karyawan <|-- KaryawanKontrak : Inherits
