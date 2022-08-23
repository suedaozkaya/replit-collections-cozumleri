package replit_collections;

import java.util.ArrayList;
import java.util.List;

public class Collection04 {
    /*
    Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
    Array Elemanları: sari,yesil,mavi,pembe
    **mavi rengini turuncu ile değiştirelim.**
    Beklene Çıktı: [sari,yesil,mavi,pembe]
    [sari,yesil,turuncu,pembe]
     */
    public static void main(String[] args) {
        List<String> renklerArrList = new ArrayList<>();
        renklerArrList.add("sari");
        renklerArrList.add("yesil");
        renklerArrList.add("mavi");
        renklerArrList.add("pembe");
        renklerArrList.set(2,"turuncu");
        System.out.println(renklerArrList);
    }
}
