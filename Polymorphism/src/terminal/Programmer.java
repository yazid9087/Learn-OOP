package terminal;

class Programmer extends Pegawai {
    private double bonusProyek;
    
    Programmer(String nama, double gajiPokok, double bonusProyek){
        super(nama, gajiPokok);
        this.bonusProyek = bonusProyek;
    }
    
    @Override
    public String toString(){
        return super.getInfo() + "as a (Programmer)";
    } 
}
