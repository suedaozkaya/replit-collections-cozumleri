package replit_collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection08 {
    /*
    Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
    LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
    Beklenen Çıktı:
    Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
    Listenin ilk elemani: sari
    listenin son elemani: beyaz
     */
    public static void main(String[] args) {
        LinkedList<String> liste = new LinkedList<>();
        liste.add("sari");
        liste.add("mavi");
        liste.add("turuncu");
        liste.add("siyah");
        liste.add("yesil");
        liste.add("beyaz");
        Iterator itr = liste.iterator();
        System.out.println("Orijinal list elemanlari: " + liste);
        System.out.println("Listenin ilk elemani: " + itr.next());

        for (int i = 1; i < liste.size()-1; i++) {
            itr.next();
        }
        System.out.println("Listenin son elemani: " + itr.next());
    }
}
