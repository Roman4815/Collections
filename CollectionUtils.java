package CollectionEx;
import java.util.*;

public class CollectionUtils {
    public static void describeCollection(Collection<?> collection){
        if (collection == null || collection.isEmpty()){
            System.out.println("Коллекция пуста");
            return;
        }
        System.out.println("Размер коллекции: " + collection.size());
        System.out.println("Элементы коллекции:");
        for (Object element : collection) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Яблоко");
        list.add("Банан");
        list.add("Вишня");

        describeCollection(list);


    }

}
