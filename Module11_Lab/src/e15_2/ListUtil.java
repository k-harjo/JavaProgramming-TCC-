package e15_2;

import java.util.LinkedList;

public class ListUtil {
    public static void reverse(LinkedList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            
            strings.addFirst(strings.removeLast());
        }
    }

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.add("Fourth");

        reverse(strings);
        System.out.println(strings);  
    }
}
