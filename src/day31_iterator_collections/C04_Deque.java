package day31_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {



        // double ended queue
        // genel olarak queue ozelliklerini gosterir
        // ancak bastan ve sondan ekleme-cıkarma gibi ozellikler olur

        Deque<String > deq = new LinkedList<>();

        deq.add("Adnan");
        deq.addLast("Sevda");

        System.out.println(deq); // [Adnan, Sevda]

        deq.addFirst("Saida");
        System.out.println(deq); // [Saida, Adnan, Sevda]

        System.out.println(deq.removeLastOccurrence("Sevda"));
        System.out.println(deq); //  [Saida, Adnan]

        // Tek sevda oldugu icin remove () removeFirstOccurance(Obj) veya lastOcuurance(Obj) fark olmaz


        System.out.println(deq.pop()); // Saida
        System.out.println(deq); // [Adnan]

        // İlk elementi siler ve bize döndürür removeFirst() ' e benzer

        Deque<String > bosDeg = new LinkedList<>();
       // bosDeg.removeFirst(); // NoSuchElementException
       // bosDeg.pop();  // NoSuchElementException




    }
}
