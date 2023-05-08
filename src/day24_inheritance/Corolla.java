package day24_inheritance;

public class Corolla extends BToyota {


    String uretimYeri = "Turkiye";
    String lastik = "Coroolla araclar pirelli 205-60-16 lastik kullanir";
    String model = "Corolla";
    boolean otopark = false;
    boolean cruiseControl = true;

    public  void hiz(){
        System.out.println("Corolla araclar max 240 km hiz yapr");
    }
    public void guvenlik(){
        System.out.println("Corolla araclar 12 hava yastigi kullanir");
    }
    public static void main(String[] args) {

        Corolla corolla1= new Corolla();
        System.out.println(corolla1.uretimYeri);
        System.out.println(corolla1.lastik);
        System.out.println(corolla1.model);
        System.out.println(corolla1.otopark);
        System.out.println(corolla1.cruiseControl);
        System.out.println(corolla1.marka);
        corolla1.hiz();
        corolla1.guvenlik();
        corolla1.aku();
        System.out.println(corolla1.tekerSayisi);

    }


}
