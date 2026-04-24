package terminal;

class Manajer extends Pegawai {
    private double tunjanganJabatan;
    
    Manajer(String nama, double gajiPokok, double tunjanganJabatan){
        super(nama, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }
    
    @Override
    public String toString(){
        return super.getInfo() + "as a (Manajer)";
    } 
}
