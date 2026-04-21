package terminal;
import java.text.DecimalFormat;

class KamarSuite extends Kamar {
    private boolean fasilitasJemputan;

    KamarSuite(String namaPenyewa, int lamaMenginap, boolean fasilitasJemputan) {
        super(namaPenyewa, lamaMenginap);
        this.fasilitasJemputan = fasilitasJemputan;
        this.hargaPerMalam = 1000000;
    }

    public double hitungTotal() {
        double total = super.hitungTotal();
        if (fasilitasJemputan) {
            total += 250000;
        }

        if (this.lamaMenginap >= 3) {
            total *= 0.85;
        }

        return total;
    }

    @Override
    public String toString() {
        String jemput = (this.fasilitasJemputan) ? "Iya" : "Tidak";
        DecimalFormat formatRupiah = new DecimalFormat("Rp #,###");

        return "== Biaya Total ==" +
                super.getInfoDasar() +
                "\nJemput: " + jemput +
                "\n-------------------"+
                "\nTotal: " + formatRupiah.format(hitungTotal());
    }

}
