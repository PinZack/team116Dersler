package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalikli bir tam sayi giriniz ");
        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz ");
        int tamSayi = scanner.nextInt();

        System.out.println("Girilen sayıların toplami : " + (ondalikliSayi+tamSayi));
        System.out.println("Girilen sayilarin carpimi : " + ondalikliSayi*tamSayi);

    }
}
