package module9;
import java.util.*;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList <String> myLinkedList = new MyLinkedList<>();
        MyLinkedList<Integer> myLinkedList2 = new MyLinkedList<>();
        Integer[] intNumb = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");
        myLinkedList.add("Five");
        myLinkedList.add("Six");
        myLinkedList.add("seven");
        myLinkedList.add("Eight");
        myLinkedList.get(-2);
        myLinkedList.size();
        myLinkedList.get(20);
        myLinkedList.get(7);
        myLinkedList2.size();
        myLinkedList2.get(0);
        myLinkedList2.get(16);
        myLinkedList2.clear();
        myLinkedList2.size();
        myLinkedList2.remove(9);
        MyLinkedList<String> strLl = new MyLinkedList<>();
        strLl.add("FOOO");
        strLl.get(0);
        strLl.size();
        strLl.clear();
    }
}

