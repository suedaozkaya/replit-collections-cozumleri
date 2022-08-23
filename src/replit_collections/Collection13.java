package replit_collections;

import java.util.TreeSet;

public class Collection13 {
    /*
    Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.
    TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah
    Beklenen Çıktı:
    beyaz
    kirmizi
    mavi
    sari
    siyah
    yesil
     */

    public static void main(String[] args) {
        TreeSet<String> renklerTree = new TreeSet<>();
        renklerTree.add("yesil");
        renklerTree.add("mavi");
        renklerTree.add("kirmizi");
        renklerTree.add("sari");
        renklerTree.add("beyaz");
        renklerTree.add("siyah");
        for (String each:renklerTree) {
            System.out.println(each);
        }
    }
}
