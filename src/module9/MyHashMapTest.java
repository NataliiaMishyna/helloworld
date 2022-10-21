package module9;
import java.util.*;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap<>();
        myHashMap.put("1", "1one");
        myHashMap.put("2", "2two");
        myHashMap.put("3", "3three");
        myHashMap.put("11", "3three");
        myHashMap.put("21", "3three");
        myHashMap.put("100", "3three");
        myHashMap.put("100", "3three");
        System.out.println("One " + myHashMap.get("One"));
        System.out.println("Two " + myHashMap.get("Two"));
        System.out.println("Three " + myHashMap.get("Three"));
        System.out.println("Size: " + myHashMap.size());
        myHashMap.remove("Three");
        System.out.println("Size: " + myHashMap.size());
        myHashMap.clear();
        System.out.println("Size: " + myHashMap.size());
    }
}
