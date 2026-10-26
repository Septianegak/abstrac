class KaryawanKontrak extends Karyawan {
    private double tarifPerJam;
    private int jamKerja;

    public KaryawanKontrak(String nama, String id, double tarifPerJam, int jamKerja) {
        super(nama, id); 
        this.tarifPerJam = tarifPerJam;
        this.jamKerja = jamKerja;
    }
    @Override
    public double hitungGaji() {
        return tarifPerJam * jamKerja;
    }
}