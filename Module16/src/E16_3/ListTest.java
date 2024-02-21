package E16_3;

import java.util.NoSuchElementException;

import E16_2.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        LinkedList_3 correctList = new LinkedList_3();
        correctList.add("Element 1");
        correctList.add("Element 2");

        LinkedList_3 faultyList = new LinkedList_3(); // We will assume this uses the faulty iterator
        faultyList.add("Element 1");
        faultyList.add("Element 2");

        // Test the correct implementation
        ListIterator correctIterator = correctList.listIterator();
        while (correctIterator.hasNext()) {
            System.out.println(correctIterator.next());
        }

        // Test the faulty implementation
        ListIterator faultyIterator = faultyList.listIterator(); // Ensure this returns FaultyListIterator
        try {
            while (faultyIterator.hasNext()) {
                System.out.println(faultyIterator.next());
            }
            System.out.println("Faulty iterator test failed: No error thrown");
        } catch (NoSuchElementException e) {
            System.out.println("Faulty iterator test passed: NoSuchElementException thrown");
        }
    }
}