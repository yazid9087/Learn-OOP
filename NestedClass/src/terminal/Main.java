package terminal;

public class Main {
    public static void main(String[] args) {
        Komputer k1 = new Komputer("Legion 5i");

        Komputer.Processor intel = k1.new Processor("i7");

        intel.cetakSpesifikasi();
    }
}