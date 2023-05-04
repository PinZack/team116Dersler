package day05_ifElseStatements;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

        // verilen bir sayinin 2,3,5,7,11 ve 23 sayilarindan kac tanesine
        // kalansiz olarak bolunebildigini yazdirin
        // ornegin kullaci 30 dediginde output : 3


        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int sayac = 0;


        if (girilenSayi % 2 == 0) sayac++;
        if (girilenSayi % 3 == 0) sayac++;
        if (girilenSayi % 5 == 0) sayac++;
        if (girilenSayi % 7 == 0) sayac++;
        if (girilenSayi % 11 == 0) sayac++;
        if (girilenSayi % 23 == 0) sayac++;



        System.out.println("Girilen sayi :" +girilenSayi+"\n"+sayac+" tanesine tam bolunuyor");

        if (sayac > 2) System.out.println("tebrikler"); // kendi orneklerim
        if (sayac < 2) System.out.println("basarısız");

    }
}
