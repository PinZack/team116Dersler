package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //         asagidaki formmatta yazdirin.
        //      Isminiz : John
        //      Soyisminiz : DOE
        //      Yasiniz : 44
        //      Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lufen sırasıyla isminizi soyisminizi ve yasinini giriniz");

        String isim = scanner.nextLine();
        String soyisim = scanner.nextLine().toUpperCase();
        int yas = scanner.nextInt();

        /*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
         */

        System.out.println("Isminiz : " + isim + "\n Soyisniniz : " + soyisim +"\n Yasiniz : "+ yas);

        System.out.println("Kaydiniz basarili bir sekilde tamamlanmistir");


    }
}
