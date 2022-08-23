package replit_collections;

import java.util.ArrayList;
import java.util.List;

public class Collection02 {
    /*
    Array list oluşturun daha sonra aşağıda belirtilen yerlere yebi array elemanlarını ekleyen java kodunu yazınız.
    Array List:  siyah,mavi,kirmizi,beyaz
    en başa: **pembe**
    mavi-kirmizi arasına **yesil**  renk eklenecek.
    Beklenen Çıktı: [pembe,siyah,mavi,yesil,kirmizi,beyaz]
     */
    public static void main(String[] args) {
        List<String> renkler = new ArrayList<>();
        renkler.add("siyah");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add(0,"pembe");
        renkler.add(3,"yesil");
        System.out.println(renkler);
    }

}
