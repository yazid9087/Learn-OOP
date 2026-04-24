package terminal;

class Pegawai {
    protected String nama;
    protected double gajiPokok;
    
    Pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    public double hitungGaji(){
        return this.gajiPokok;
    }
    
    public String getInfo(){
        return "Nama: " + this.nama;
    }
}
