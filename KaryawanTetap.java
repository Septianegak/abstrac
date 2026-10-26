class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double bonus;

    public KaryawanTetap(String nama, String id, double gajiPokok, double bonus) {
        super(nama, id); 
        this.gajiPokok = gajiPokok;
        this.bonus = bonus;
    }
    @Override
    public double hitungGaji() {
        return gajiPokok + bonus;
    }
}