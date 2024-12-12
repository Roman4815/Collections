package CollectionExample;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void describeMap(Map<?, ?>map){

    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple",1);
        map.put("Banana",2);
        map.put("Chery",3);
        map.put("Apple",4);
        describeMap(map);
        System.out.println(map);

    }
}
