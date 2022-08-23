package replit_collections;

import java.util.PriorityQueue;

public class Collection18 {
    /*
    Bir Priority Queue  oluşruralım, elemanlarını ekleyim priority queue yazdıralım.
    priority queue elemanları: sari,yesil,mavi,kirmizi
    Beklenen Çıktı:
    Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
     */

    public static void main(String[] args) {
        PriorityQueue<String> renk = new PriorityQueue<>();
        renk.add("sari");
        renk.add("yesil");
        renk.add("mavi");
        renk.add("kirmizi");

        System.out.println("Priority Queue elemanlari: " + renk);
    }
}
