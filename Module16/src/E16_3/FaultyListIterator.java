package E16_3;

import java.util.NoSuchElementException;

public class FaultyListIterator implements E16_2.ListIterator {
    private Node position;
    private Node previous;
    
    public FaultyListIterator(Node start) {
        position = start;
        previous = null;
    }

    public boolean hasNext() {
        // Faulty version as per the exercise
        return position != null;
    }

    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object data = position.data;
        previous = position; // Remember for remove
        position = position.next;
        return data;
    }
	
	//HIDE
	/**
	 A list iterator allows access of a position in a linked list.    
	 This interface contains a subset of the methods of the 
	 standard java.util.ListIterator interface. The methods for
	 backward traversal are not included.
	*/
	public interface ListIterator
	{  
	 /**
	    Moves the iterator past the next element.
	    @return the traversed element
	 */
	 Object next();
	    
	 /**
	    Tests if there is an element after the iterator 
	    position.
	    @return true if there is an element after the iterator 
	    position
	 */
	 boolean hasNext();
	    
	 /**
	    Adds an element before the iterator position
	    and moves the iterator past the inserted element.
	    @param element the element to add
	 */
	 void add(Object element);
	    
	 /**
	    Removes the last traversed element. This method may
	    only be called after a call to the next() method.
	 */
	 void remove();

	 /**
	    Sets the last traversed element to a different 
	    value. 
	    @param element the element to set
	 */
	 void set(Object element);
	}
	

    public void add(Object element) {
        throw new UnsupportedOperationException("Add not supported by FaultyListIterator.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Remove not supported by FaultyListIterator.");
    }

    public void set(Object element) {
        throw new UnsupportedOperationException("Set not supported by FaultyListIterator.");
    }
	
	
	public boolean hasNext1() {
        // Faulty version as per the exercise
        return position != null;
    }

}