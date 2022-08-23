package replit_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection12 {
    /*
    Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
    HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
    Beklenen Çıktı:
    Tree Set Elemanlari:
    kirmizi
    mavi
    sari
    turuncu
    yesil
     */
    public static void main(String[] args) {
        HashSet<String> renklerHash = new HashSet<>();
        renklerHash.add("sari");
        renklerHash.add("mavi");
        renklerHash.add("yesil");
        renklerHash.add("turuncu");
        renklerHash.add("kirmizi");

        TreeSet<String> renklerTree = new TreeSet<>();
        renklerTree.addAll(renklerHash);

        System.out.println("Tree Set Elemanlari: ");
        Iterator it = renklerTree.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
