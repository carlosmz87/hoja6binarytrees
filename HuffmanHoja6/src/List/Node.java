package List;

/**
 * @param <E> clase genérica
 * basado en: http://www.cs.williams.edu/~bailey/JavaStructures/doc/structure5/index.html 
 *            Node.java
 * @author, 2001 duane a. bailey
 * @version $Id: Node.java 34 2007-08-09 14:43:44Z bailey $
 * Modificado por Douglas Dávila
 */
public class Node<E>
{
    /**
     * The data value stored in this node.
     */
    protected E data; 
    /**
     * Reference to the next node in the list.
     */
    protected Node<E> nextElement; 

    /**
     * Construct a singly linked list element.
     * @pre v is a value, next is a reference to remainder of list
     * @Post an element is constructed as the new head of list
     * @param v
     * @param next 
     */
    public Node(E v, Node<E> next)
    {
        data = v;
        nextElement = next;
    }   
    /**
     * onstructs a node not associated with any list.
     * @pre n/a
     * @post constructs a new tail of a list with value v
     * @param v
     */
    public Node(E v)
    {
        this(v,null);
    }

    /**
     * obtiene el siguiente elemento
     * @pre n/a
     * @post returns reference to next value in list
     * @return nextElement   
     */
    public Node<E> next()
    {
        return nextElement;
    }

    /**
     * Update the next element.
     * @pre n/a
     * @post sets reference to new next value
     * @param next 
     */
    public void setNext(Node<E> next)
    {
        nextElement = next;
    }

    /**
     * Fetch the value associated with this element.
     * @pre n/a
     * @post returns value associated with this element
     * @return Reference to the value stored within this element.
     */
    public E value()
    {
        return data;
    }
    
    /**
     * Set the value associated with this element.
     * @pre n/a
     * @post sets value associated with this element
     * @param value
     */
    public void setValue(E value)
    {
        data = value;
    }
}