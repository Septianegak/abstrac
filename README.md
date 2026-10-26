# Studi Kasus PBO: Sistem Penggajian Karyawan

Proyek ini dibuat untuk memenuhi tugas **Studi Kasus dan Diskusi Pemrograman Berbasis Objek (PBO)**. Program ini mensimulasikan sistem perhitungan gaji karyawan menggunakan konsep **Abstract Class**, **Inheritance**, dan **Polymorphism** dalam bahasa Java.

---

## 📌 Penjelasan Konsep PBO

1. **Abstract Class (`Karyawan`)**
   - Berfungsi sebagai kelas induk (*parent class*) umum yang tidak diinstansiasi secara langsung.
   - Memiliki *abstract method* `hitungGaji()` yang mewajibkan setiap kelas turunan (*subclass*) untuk mengimplementasikan perhitungan gajinya masing-masing.

2. **Inheritance (Pewarisan)**
   - Kelas `KaryawanTetap` dan `KaryawanKontrak` mewarisi atribut (`nama`, `id`) dan method (`tampilkanProfil()`) dari kelas induk `Karyawan`.

3. **Polymorphism (Banyak Bentuk)**
   - **Method Overriding**: Method `hitungGaji()` di-override oleh kelas `KaryawanTetap` (gaji pokok + bonus) dan `KaryawanKontrak` (tarif × jam kerja).
   - **Dynamic Binding**: Variabel bertipe kelas induk `Karyawan` digunakan pada `Main.java` untuk menampung objek dari `KaryawanTetap` dan `KaryawanKontrak`.

---

## 📐 Class Diagram

```mermaid
classDiagram
    class Karyawan {
        <<abstract>>
        #String nama
        #String id
        +Karyawan(String nama, String id)
        +hitungGaji()* double
        +tampilkanProfil() void
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

    Karyawan <|-- KaryawanTetap : Inherits
    Karyawan <|-- KaryawanKontrak : Inherits
