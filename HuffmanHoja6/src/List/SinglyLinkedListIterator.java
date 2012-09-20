
package List;

import java.util.Iterator;
/**
 * @param <E>  clase generica
 * @author Douglas Dávila
 * @since 19/09/2012
 * @version 1.0
 * @see List
 */
public class SinglyLinkedListIterator<E> implements Iterator{
    /**
     * Referencia del elemento actual.
     */
    protected Node<E> current;
    /**
     * La cabeza de la lista
     */
    protected Node<E> head;
    
    /**
     * Construye un iterador 
     * @pre n/a
     * @post devuelve un iterador que se desplaza en una linked list 
     * @param t el primer elemento de la lista.
     * @since 19/09/2012
     * @see List
     */
    public SinglyLinkedListIterator(Node<E> t)
    {
        head = t;
        reset();
    }
    
    /**
     * Resetea el iterador al inicio 
     * @pre n/a
     * @post el iterador se encuentra al inicio de la lista
     * @since 19/09/2012
     * @see List
     */
    public void reset()
    {
        current = head;
    }
    
    /**
     * Determina si el iterador ha terminado, o hay elementos a considerar
     * @pre n/a
     * @post devuelve true si hay mas elementos.
     * @return 
     * @since 19/09/2012
     * @see List
     */
    @Override
    public boolean hasNext()           
    {
        return current != null;
    }
    
    /**
     * regresea el siguiente valor e incrementa el iterador
     * @pre la lista posee elementos
     * @post devuelve el valor siguiente e incrementa el iterador
     * @return
     * @since 19/09/2012
     * @see List
     */    
    @Override
    public E next()
    {
        E temp = current.value();
        current = current.next();
        return temp;
    }
    /**
     * @since 19/09/2012
     * @see List
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
