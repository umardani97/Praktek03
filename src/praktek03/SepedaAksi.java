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
       
       SepedaMotor ym = new SepedaMotor();
       ym.setMerk("Yamaha");
       ym.setWarna("Biru");
       ym.setHarga(300000);
       ym.setJenismotor("kaerbo");
       
       ym.cetakInfo();
       System.out.println("JenisMotor \t:"+ym.getJenismotor());
       ym.throttle();
       
       SepedaOntel UI = new SepedaOntel();
       UI.setMerk("Jali-jali");
       UI.setWarna("Abu-abu");
       UI.setHarga(50000);
       UI.setJenisontel("tinjak");
       
       UI.cetakInfo();
       System.out.println("Jenis Ontel \t:"+UI.getJenisontel());
       UI.throttle();
       
    }
}
