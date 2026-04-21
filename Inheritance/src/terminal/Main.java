package terminal;

public class Main {
    public static void main(String[] args) {
        KamarStandar p1 = new KamarStandar("Asep", 1, true);
        KamarSuite p2 = new KamarSuite("Budi", 4, true);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
