# Studi Kasus: Sistem Penggajian Karyawan

## Penerapan Konsep PBO:
1. **Abstract Class (`Karyawan`)**:
   - Class `Karyawan` diset `abstract` karena representasi umum dan tidak diinstansiasi langsung.
   - Punya `abstract method` `hitungGaji()` yang mewajibkan tiap subclass menghitung gajinya sendiri.

2. **Inheritance**:
   - Class `KaryawanTetap` dan `KaryawanKontrak` menurunkan atribut `nama` dan `id` serta method `tampilkanProfil()` dari class parent `Karyawan`.

3. **Polymorphism**:
   - Terjadi overriding method `hitungGaji()` sesuai kondisi masing-masing subclass (Gaji Tetap = Pokok + Bonus; Gaji Kontrak = Tarif x Jam Kerja).
   - Pada `Main.java`, objek dipanggil lewat referensi class parent (`Karyawan`), tetapi mengeksekusi perhitungan gaji milik subclass-nya masing-masing.