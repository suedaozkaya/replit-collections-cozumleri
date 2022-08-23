package replit_collections;

import java.util.ArrayList;
import java.util.List;

public class Collection05 {
    /*
    Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.
    ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu
    Beklenen Çıktı:
    Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
    siyah
    mavi
    kirmizi
    yesil
    mor
    turuncu
     */
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("siyah");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("yesil");
        liste.add("mor");
        liste.add("turuncu");
        System.out.println(liste);
        for (String each:liste) {
            System.out.println(each);
        }
    }
}
