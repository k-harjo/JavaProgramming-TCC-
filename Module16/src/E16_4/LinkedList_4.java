package E16_4;

import java.util.NoSuchElementException;

// Assuming E16_2.ListIterator has next, hasNext, add, remove, and set methods.
import E16_2.ListIterator;

public class LinkedList_4 {
    private Node first;

    // Flag to enable the faulty iterator for testing purposes.
    private boolean useFaultyIterator = false;

    // Inner class Node
    private class Node {
        public Object data;
        public Node next;
    }

    public LinkedList_4() {
        first = null;
    }

    public void reverse() {
        Node prev = null;
        Node current = first;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }

    public Object getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public Object removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        Object element = first.data;
        first = first.next;
        return element;
    }

    public void addFirst(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }

    public ListIterator listIterator() {
        if (useFaultyIterator) {
            return new FaultyListIterator();
        } else {
            return new LinkedListIterator();
        }
    }

    // Call this method to enable the faulty iterator.
    public void enableFaultyIterator() {
        useFaultyIterator = true;
    }

    // Standard iterator for LinkedList_3
    private class LinkedListIterator implements ListIterator {
        private Node position;
        private Node previous;

        public LinkedListIterator() {
            position = null;
            previous = null;
        }

        public Object next() {
            if (!hasNext())
                throw new NoSuchElementException();
            previous = position;
            position = (position == null) ? first : position.next;
            return position.data;
        }

        public boolean hasNext() {
            return (position == null) ? first != null : position.next != null;
        }

        public void add(Object element) {
            if (position == null) {
                addFirst(element);
                position = first;
            } else {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
            }
            previous = position;
        }
        /**
         * Computes the number of elements in the list.
         * @return the number of elements in the list
         */
        public int size() {
            int count = 0;
            Node current = first;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        public void remove() {
            if (previous == position)
                throw new IllegalStateException();
            if (position == first) {
                removeFirst();
            } else {
                previous.next = position.next;
            }
            position = previous;
        }

        public void set(Object element) {
            if (position == null)
                throw new NoSuchElementException();
            position.data = element;
        }
    }

    // Faulty iterator for LinkedList_3
    private class FaultyListIterator implements ListIterator {
        private Node position;
        private Node previous;

        public FaultyListIterator() {
            position = null;
            previous = null;
        }

        public Object next() {
            if (!hasNext())
                throw new NoSuchElementException();
            previous = position;
            position = (position == null) ? first : position.next;
            return position.data;
        }

        public boolean hasNext() {
            return (position == null) ? first != null : position.next != null;
        }

        public void add(Object element) {
            // Faulty behavior can be simulated here
            throw new UnsupportedOperationException("Faulty add operation");
        }

        public void remove() {
            // Faulty behavior can be simulated here
            throw new UnsupportedOperationException("Faulty remove operation");
        }

        public void set(Object element) {
            // Faulty behavior can be simulated here
            throw new UnsupportedOperationException("Faulty set operation");
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = first;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }
}
