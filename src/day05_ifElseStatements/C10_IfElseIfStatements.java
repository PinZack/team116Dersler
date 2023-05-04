package day05_ifElseStatements;

import java.util.Scanner;

public class C10_IfElseIfStatements {

    public static void main(String[] args) {

         /*
            If   else-if   else-if.... birbirine bagimli durum sayisi
            2 den fazla ise kullanilir
            tum durumlar birbirine bagimli oldugundan
            SADECE bir tanesi calisir, otekiler calismaz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if ( not <0 || not>100) {
            System.out.println("Gecersiz not");
        } else if (not>=85) {
            System.out.println("AA ile gectiniz");
        } else if (not >=65) {
            System.out.println("BB ile gectiniz");
        } else if (not >=50 ) {
            System.out.println("CC ile gectiniz");
        }else System.out.println( "Notunuz DD, Kaldınız");


    }
}
