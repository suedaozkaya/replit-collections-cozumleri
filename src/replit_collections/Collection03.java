package replit_collections;

import java.util.ArrayList;
import java.util.List;

public class Collection03 {
    /*
    Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.
    ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu
    Beklenen Çıktı: Arrayin 1. elemani: beyaz
    Arrayin 3. elemani: sari
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("beyaz");
        stringList.add("siyah");
        stringList.add("sari");
        stringList.add("kirmizi");
        stringList.add("turuncu");

        System.out.println("Array'in 1. elemani: " + stringList.get(0));
        System.out.println("Array'in 3. elemani: " + stringList.get(2));
    }
}
