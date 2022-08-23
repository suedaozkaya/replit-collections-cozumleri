package replit_collections;

import java.util.LinkedList;

public class Collection06 {
    /*
    Bir linkedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
    LinkedList elemanları: sari,mavi,mor,yesil,beyaz
    Beklenen Çıktı:
    sari
    mavi
    mor
    yesil
    beyaz
     */
    public static void main(String[] args) {
        LinkedList<String> renklerList = new LinkedList<>();
        renklerList.add("sari");
        renklerList.add("mavi");
        renklerList.add("mor");
        renklerList.add("yesil");
        renklerList.add("beyaz");
        for (String each:renklerList) {
            System.out.println(each);
        }
    }
}
