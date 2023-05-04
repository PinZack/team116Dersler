package day05_ifElseStatements;

import java.util.Scanner;

public class C06_IfStatements {

    public static void main(String[] args) {


        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        int girilenNot = scanner.nextInt();

        if (girilenNot >= 50 ) System.out.println("Sinifi Gectin");
        if (girilenNot < 50 ) System.out.println(" Maalesef kaldiniz Tembel teneke");



        /*
            onceki sorulardan farkli olarak
            bu soruda iki if birbirine bagimlidir
            iki if'den sadece 1'i calisir
            ikisinin birden calisma ihtimali yoktur
            ikisinin de calismama ihtimali de yoktur
         */
        if (girilenNot>=50) {
            System.out.println("sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }
        /*
             if ve else body'leri tek bir boolean sarta bagimlidir
            ikisinden sadece 1'i calisir
            ikisinin birden calisma ihtimali yoktur
            ikisinin calismama ihtimali de yoktur
         */

    }
}
