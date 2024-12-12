package CollectionExample;

import java.util.*;

public class CollectionsEx {

    public static void useCollectionsUtility(Collection<Integer> collection) {
        if (collection == null || collection.isEmpty()){
            System.out.println("Коллекция пуста или равна null.");
            return;
        }
        List<Integer>list = new ArrayList<>(collection);

        Collections.sort(list);
        System.out.println("Отсортированная коллекция: " + list);
        Integer max = Collections.max(list);
        System.out.println("Максимальный элемент: " + max);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(8);
        numbers.add(21);
        numbers.add(13);
        numbers.add(44);
        useCollectionsUtility(numbers);
    }

    }
