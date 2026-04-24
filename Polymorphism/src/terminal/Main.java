package terminal;

public class Main {
    public static void main(String[] args) {
        Pegawai[] daftarKaryawan = new Pegawai[3];
        
        daftarKaryawan[0] = new Manajer("Andi", 5000000, 2000000);
        daftarKaryawan[1] = new Programmer("Budi", 6000000, 1500000);
        daftarKaryawan[2] = new Pegawai("Citra", 3000000); 
        
        System.out.println("== Slip Gaji Perusahaan ==");
        
        for (int i = 0; i < daftarKaryawan.length; i++) {
            System.out.println(daftarKaryawan[i].getInfo());
            System.out.println("Total Gaji: " + daftarKaryawan[i].hitungGaji());
            System.out.println("---------------------------");
            
        }
        
        
    }
}
