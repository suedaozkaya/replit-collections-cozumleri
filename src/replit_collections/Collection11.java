package replit_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection11 {
    /*
    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
    HashSet List: sari,mavi,kirmizi,yesil,mor
    Beklenen Çıktı:
    TreeSet elements:
    kirmizi
    mavi
    mor
    sari
    yesil
     */
    public static void main(String[] args) {
        HashSet<String> renkler = new HashSet<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("yesil");
        renkler.add("mor");
        TreeSet<String> renklerTree = new TreeSet<>();

        renklerTree.addAll(renkler);

        System.out.println("TreeSet elements: ");
        Iterator itr = renklerTree.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
// addAll ile set elemanlarini tree set'e atayabiliriz
