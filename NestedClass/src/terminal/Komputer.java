package terminal;

class Komputer {
    String merk;

    Komputer(String merk){
        this.merk = merk;
    }

    class Processor{
        String namaModel;

        Processor(String namaModel){
            this.namaModel = namaModel;
        }

        void cetakSpesifikasi(){
            System.out.println("=== INFO SPESIFIKASI ===");
            System.out.println("Processor : " + this.namaModel);
            System.out.println("Dipakai di : Laptop " + merk);
        }
    }
}
