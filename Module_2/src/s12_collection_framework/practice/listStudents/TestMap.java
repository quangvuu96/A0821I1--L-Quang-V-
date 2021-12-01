package s12_collection_framework.practice.listStudents;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Vũ",22);
        hashMap.put("Tuấn",20);
        hashMap.put("Trâm",20);
        hashMap.put("Rim",23);
        System.out.println("Display entries in HashMap ");
        System.out.println(hashMap + "\n");


        System.out.println("-------------------");

        TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        System.out.println("--------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Vũu" , 22);
        linkedHashMap.put("Tuấn" , 40);
        linkedHashMap.put("Trâm" , 20);
        linkedHashMap.put("Vũ" , 23);
        System.out.println("\n The age for Vũ is " + linkedHashMap.get("Vũ"));
    }
}
