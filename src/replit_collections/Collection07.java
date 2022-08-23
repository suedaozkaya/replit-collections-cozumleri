package replit_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection07 {
    /*
    bir LinkedList oluşturalım ve Iterator methodunu kullanarak
    listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
    LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
    1. elemandan itibaren yazdıralım.
    Beklenen Çıktı:
    beyaz
    mavi
    yesil
    turuncu
     */
    public static void main(String[] args) {
        LinkedList<String> renklerList = new LinkedList<>();
        renklerList.add("sari");
        renklerList.add("beyaz");
        renklerList.add("mavi");
        renklerList.add("yesil");
        renklerList.add("turuncu");
        int kacinciElemandan = 1;
        Iterator iterator = renklerList.iterator();
        for (int i = 0; i < kacinciElemandan; i++) {
            iterator.next();
        }
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
