public class Main {
    public static void main(String[] args) {
        
        Karyawan k1 = new KaryawanTetap("Budi", "KT-001", 5000000, 1000000);
        Karyawan k2 = new KaryawanKontrak("Siti", "KK-002", 50000, 80);

        k1.tampilkanProfil();
        System.out.println("Total Gaji : Rp" + k1.hitungGaji());

        System.out.println("-------------------------");

        k2.tampilkanProfil();
        System.out.println("Total Gaji : Rp" + k2.hitungGaji());
    }
}