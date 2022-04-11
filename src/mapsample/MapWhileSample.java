package mapsample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapWhileSample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");
        map.put("5", "E");
        map.put("6", "F");
        map.put("7", "G");
        map.put("8", "H");
        map.put("9", "I");

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println("{key: " + key + ", value: " + value + "}");
        }

        System.out.println();

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("{key: " + key + ", value: " + value + "}");
        }

        System.out.println();

        for (int i = 0; i < map.size(); i++) {

        }
    }
}
