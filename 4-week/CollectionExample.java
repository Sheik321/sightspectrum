package practitce;
import java.util.ArrayList;
public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Elements in the list: " + list);
        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);

        System.out.println("Iterating through the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
