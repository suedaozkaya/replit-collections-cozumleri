package replit_collections;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {
    /*
    Bir ArrayList oluşturun ve array elemanlarını tek tek yazdırın.
    Array elemanları:  siyah,sari,mavi,turuncu
    Beklenen Çıktı:
    siyah
    sari
    mavi
    turuncu
     */
    public static void main(String[] args) {
        List<String> renkler = new ArrayList<>();
        renkler.add("siyah");
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");
        for(int i=0; i<renkler.size(); i++){
            System.out.println(renkler.get(i));
        }
    }
}
