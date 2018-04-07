package praktek03;
public class SepedaAksi {
    public static void main(String[] args) {
        Sepeda a = new Sepeda();
       a.setMerk("Lion");
       a.setWarna("Merah");
       a.setHarga(12000);
       
       a.cetakInfo();
       
       System.out.print("Merknya  \t:");
       System.out.println(a.getMerk());
       System.out.print("Warnanya  \t:");
       System.out.println(a.getWarna());
       System.out.print("Harganya  \t:");
       System.out.println(a.getHarga());
    }
}
