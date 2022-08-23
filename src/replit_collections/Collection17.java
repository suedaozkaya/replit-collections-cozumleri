package replit_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Collection17 {
    /*
    Ortak elemanları olan 2 farklı TreeSet oluşturalım ve elemanlarını tektek karşılaştırıp
    aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.
    1. TreeSet: mavi,yesil,kirmizi,sari
    2. TreeSet: yesil,mavi,pembe,turuncu
    Beklenen Çıktı:
    1. TreeSet: [kirmizi,mavi,sari,yesil]
    2. TreeSet: [mavi,pembe,turuncu,yesil
    Karsilastirma Sonucu:
    no`
    yes
    no
    yes
     */
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("mavi");
        treeSet1.add("yesil");
        treeSet1.add("kirmizi");
        treeSet1.add("sari");
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("yesil");
        treeSet2.add("mavi");
        treeSet2.add("pembe");
        treeSet2.add("turuncu");

        System.out.println("1. TreeSet: " + treeSet1);
        System.out.println("2. TreeSet: " + treeSet2);

        Iterator<String> it1 = treeSet1.iterator();
        Iterator<String> it2 = treeSet2.iterator();

        while (it1.hasNext()){
            if (it1.next().equals(it2.next())){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
