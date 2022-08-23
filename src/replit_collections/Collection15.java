package replit_collections;

import java.util.TreeSet;

public class Collection15 {
    /*
    Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.
    TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
    Beklenen Çıktı:
    Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
    ilk elemen: kirmizi
    son eleman: yesil
     */

    public static void main(String[] args) {
        TreeSet<String> renkler = new TreeSet<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("turuncu");
        renkler.add("pembe");

        System.out.println("Orijinal Tree: " + renkler);
        System.out.println("ilk eleman: " + renkler.first());
        System.out.println("son eleman: " + renkler.last());
    }
}
