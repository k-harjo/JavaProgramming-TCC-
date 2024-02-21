package E16_2;


public class ListTester {
    public static void main(String[] args) {
        LinkedList_2 list = new E16_2.LinkedList_2();
        BadLinkedList badList = new BadLinkedList();

        // Add some elements to the good list
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");

        // Add the same elements to the bad list
        badList.addFirst("C");
        badList.addFirst("B");
        badList.addFirst("A");

        // Check the order of elements in the good list
        if (!list.toString().equals("A B C ")) {
            System.out.println("Failure in LinkedList");
        } else {
            System.out.println("LinkedList passed");
        }

        // Check the order of elements in the bad list
        if (!badList.toString().equals("A B C ")) {
            System.out.println("Failure in BadLinkedList");
        } else {
            System.out.println("BadLinkedList passed - this is not expected!");
        }
    }
}