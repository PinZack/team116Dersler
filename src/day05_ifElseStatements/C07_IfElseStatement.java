package day05_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseStatement {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //         ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ucgene ait uc kenar uzunlugunu yazin");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();



        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 1) {
            System.out.println("Girilen degerler eskenar ucgen olusturur");
        }
        else {
            System.out.println(" Girilen degerler eskenar ucgen olusturmaz");
        }



    }
}
