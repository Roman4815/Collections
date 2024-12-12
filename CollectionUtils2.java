package CollectionExample;

import java.util.*;

public class CollectionUtils2 {

        public static void demonstrateCollections(){
        List<String> list = Arrays.asList("Apple","Banana","Cherry","Apple");
            System.out.println("List (ArrayList): " + list);

            Set<String> set = new HashSet<>(list);
            System.out.println("Set (HashSet): " + set);

            Queue<String> queue = new LinkedList<>(list);
            System.out.println("Queue (LinkedList): " + queue);

        }

    public static void main(String[] args) {
        demonstrateCollections();
    }
    }

