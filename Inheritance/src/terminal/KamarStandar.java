package terminal;
import java.text.DecimalFormat;

public class KamarStandar extends Kamar {
    private boolean tambahSarapan;

    KamarStandar(String namaPenyewa, int lamaMenginap, boolean tambahSarapan){
        super(namaPenyewa, lamaMenginap);
        this.tambahSarapan = tambahSarapan;
        this.hargaPerMalam = 300000;
    }

    public double hitungTotal(){
        double total = super.hitungTotal();

        if (this.tambahSarapan) {
            total += (50000 * this.lamaMenginap); 
        }

        return total;
    }

    @Override
    public String toString(){
        String sarapan = (this.tambahSarapan) ? "Iya" : "Tidak";
        DecimalFormat formatRupiah = new DecimalFormat("Rp #,###");

        return "== Biaya Total ==" + 
        super.getInfoDasar() + 
        "\nSarapan: " + sarapan + 
        "\n-------------------"+
        "\nTotal: " + formatRupiah.format(hitungTotal()) ;
    }
}
