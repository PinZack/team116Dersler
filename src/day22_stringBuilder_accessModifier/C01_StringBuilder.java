package day22_stringBuilder_accessModifier;

import com.sun.security.jgss.GSSUtil;

public class C01_StringBuilder {

    public static void main(String[] args) {


        // StringBuilder sb = "Java";

        // non-primitive data turlerinde bir data turundeki bir degeri,
        // farkli data turundeki bir variable'a atamayabilmek icin aralarinda
        // parent-child iliskisi olmalidir


        Object obj="java";
        Object obj1=23;
        Object obj3 =true;


        // 3 farkli sekilde StringBuilder olusturulabilir
        // bu yontemler arasindaki fark capacity yani hafiza kullanimi ile ilgilidir


        StringBuilder sb2 = new StringBuilder("Java Candir");

        System.out.println(sb2);

        System.out.println(sb2.length()); // 11

        System.out.println(sb2.capacity()); // 11+16 =27

        sb2.append(", buna inanmayan mi var ?");

        System.out.println(sb2); // Java Candir,buna inanmayan mı var ?

        System.out.println(sb2.length()); // 36

        System.out.println(sb2.capacity());

        // Eger SB'da fazla kullanilmis kapasiteyi temizlemek,
        // length = kapasite yapmak isterseniz

        sb2.trimToSize();
        System.out.println(sb2.length());  //36

        System.out.println(sb2.capacity()); //36


    }

}
