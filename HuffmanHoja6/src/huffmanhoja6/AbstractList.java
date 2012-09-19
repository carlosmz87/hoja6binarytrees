package huffmanhoja6;

/**
 * @version $Id: SinglyLinkedList.java,v 4.1 2000/12/29 02:39:16 bailey Exp bailey $
 * @author, 2001 duane a. bailey
 * modificada por: Douglas Dávila
 * @param <E>
 */
public abstract class AbstractList <E> implements List <E>{
    /**
     * Determine if list is empty.
     * @pre n/a
     * @post returns true iff list has no elements
     * @return True if list has no elements.
     */
    @Override
    public boolean isEmpty()
    {
        return size() == 0;
    }    
}