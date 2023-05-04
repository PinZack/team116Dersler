package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyin
        // girilen sayinin 2 katini yazdirin

        // 1- Scanner objesi olusturmak

        Scanner scanne = new Scanner(System.in);

        // 2- Kullaniciya ne istedigimizi soyleyin

        System.out.println("Lutfen bir tamssayı giriniz");

        // 3- kullanicinin girecegi data turune uygun bir variable olusturun
        //    scanner objesi ile variable'a uygun hazir method'u kullanip
        //    kullanicidan degeri alin ve olusturdugumuz variable'a atayin

        int girilenSayi = scanne.nextInt();

        System.out.println("Girdıgınız sayının iki katı :" + 25*girilenSayi);





    }
}
