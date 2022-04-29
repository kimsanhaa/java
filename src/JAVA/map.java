package JAVA;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();



        map.put("key1",100);
        map.put("key2", 200);



        System.out.println(map.get("key1"));
        System.out.println(map.containsKey("key1"));
        //contatinsKey(key값) 안에 key값이 들어있으면 true 없으면 false;

        Map<String, Integer> map_1 = new HashMap<>();
        Map<String, Integer> map_2 = new HashMap<>();

        map_1.put("map_1_key1", 123);
        map_2.put("map_2_key1", 1000);
        System.out.println(map_2);
        map_2.putAll(map_1);

        System.out.println(map_2);
        System.out.println(map_2.keySet()); //키 출력

        map_2.forEach((key,value)->{
            System.out.println(key);
        });

        int [] temp = new int[4];
        int a = temp.length;
        System.out.println(a);

        // 중복을 제거 HashSet
        // ArrayList
        //


    }
}
