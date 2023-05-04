package day05_ifElseStatements;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0)
            System.out.println("uc ile bolunen sayı");

        if (girilenSayi % 5== 0);
            System.out.println("bes ile bolunen sayı");
;



    }
}
