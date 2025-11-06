import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main (String[]args){

        // hashmap kullanarak metin içinde geçen kelimelerin frekansına bakılacak.

        String metin = "elma elma elma armut armut muz elma muz elma " +
                "portakal armut elma muz elma armut elma muz elma.\n";

        metin = metin.toLowerCase().replaceAll("[^a-zA-ZğüşöçıİĞÜŞÖÇ\\s]", "");

        String[] kelimeler = metin.split("\\s+");

        Map<String, Integer> frekans = new HashMap<>();

        for (String kelime : kelimeler) {
            frekans.merge(kelime, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> e : frekans.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    }
}