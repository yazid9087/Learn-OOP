package terminal;

class Kamar {
    //protected : class pewaris dan class asalnya yang punya hak akses
    protected String namaPenyewa;
    protected int lamaMenginap;
    protected double hargaPerMalam;

    Kamar(String namaPenyewa, int lamaMenginap){
        this.namaPenyewa = namaPenyewa;
        setLamaMenginap(lamaMenginap);
    }

    void setLamaMenginap(int lamaMenginap){
        if (lamaMenginap < 1) {
            this.lamaMenginap = 1;
        } else {
            this.lamaMenginap = lamaMenginap;
        }
    }

    public double hitungTotal(){
        return lamaMenginap * hargaPerMalam;
    }

    public String getInfoDasar(){
        return "\nNama: " + this.namaPenyewa + 
        "\nLama Menginap: " + this.lamaMenginap + " hari";
    }
}
