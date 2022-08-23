package replit_collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Collection09 {
    /*
    Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.
    LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor
    Beklenen Çıktı:
    Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
    LinkedList Tersi:
    mor
    beyaz
    kirmizi
    yesil
    mavi
    sari
     */
    public static void main(String[] args) {
        LinkedList<String> renklerListe = new LinkedList<>();
        renklerListe.add("sari");
        renklerListe.add("mavi");
        renklerListe.add("yesil");
        renklerListe.add("kirmizi");
        renklerListe.add("beyaz");
        renklerListe.add("mor");
        System.out.println("Orijinal linked list: " + renklerListe);
        System.out.println("LinkedList Tersi: ");
        ListIterator lit = renklerListe.listIterator();
        while (lit.hasNext()){
            lit.next();
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
