package replit_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection14 {
    /*
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından
    descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.
    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
    Tersten Siralanisi:
    yesil
    turuncu
    sari
    mavi
    kirmizi
     */

    public static void main(String[] args) {
        TreeSet<String> renklerTreeSet = new TreeSet<>();
        renklerTreeSet.add("yesil");
        renklerTreeSet.add("turuncu");
        renklerTreeSet.add("sari");
        renklerTreeSet.add("mavi");
        renklerTreeSet.add("kirmizi");

        System.out.println("Orijinal Tree sonucu: " + renklerTreeSet);

        Iterator<String> itr = renklerTreeSet.descendingIterator(); // guzel bir method, tersten aliyor

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
