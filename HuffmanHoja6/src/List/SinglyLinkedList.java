package List;

import java.util.Iterator;
/**
 * Implementacion de stack con Lista con enlace simple
 * @param <E>  clase generica
 * @author Douglas Dávila
 * @since 12/08/2012
 * @version 1.0
 * @see List
 */
public class SinglyLinkedList<E> extends AbstractList<E>{
   /**Cantidad de objetos en la lista*/ 
   protected int count;
   /**El primer elemento de la lista*/
   protected Node<E> head;

   /**
    * Constructor
    * @pre: N/A
    * @post: genera una lista nueva y vacia
    * @since 12/08/2012
    */
   public SinglyLinkedList(){
      head = null;
      count = 0;
   }
   
   /**
    * Determina la cantidad de objetos de la lista
    * @return cantidad de objetos de la lista
    * @pre N/A
    * @post retorna la cantidad de objetos de la lista
    * @since 12/08/2012
    * @see List
    */
    @Override
   public int size(){
    return count;
  }
  
  /**
    * Agrega un objeto al inico de la lista
    * @param item El objeto a agregar a la lista
    * @pre N/A
    * @post El objeto es agregado al inicio de la lista
    * @since 12/08/2012
    * @see List
    */
    @Override
    public void addFirst(E item){
     head = new Node<>(item, head);
     count++;
    }

    /**
     * Se obtiene la referencia del primer objeto en la lista
     * @return la referencia del primer objeto en la lista
     * @pre que la lista no este vacia
     * @post retorna la referencia del primero objeto en la lista
     * @since 12/08/2012
     * @see List
     */
    @Override
    public E getFirst() {
       return head.value(); 
    }

    /**
     * Se remueve el primer objeto en la lista
     * @return El primer objeto en la lista
     * @pre que la lista no este vacia
     * @post se remueve el primer objeto en la lista
     * @since 12/08/2012
     * @see List
     */
    @Override
    public E removeFirst() {
        Node<E> temp = head;
	head = head.next(); // move head down list
	count--;
	return temp.value();
    }

    /**
     * borra todos los elementos de la lista
     * @pre n/a
     * @post la lista queda vacia
     * @since 19/09/2012
     * @see List
     */      
    public void clear(){
        count=0;
        head=null;
    }
    
    /**
     * Remueve de la lista el el último elemento
     * @return
     * @pre que la lista no este vacia
     * @post se retira el ultimo elemento de la lista
     * @since 19/09/2012
     * @see List
     */
    @Override
    public E removeLast()
    {
        Node<E> finger = head;
        Node<E> previous = null;        
        while (finger.next() != null) // find end of list
        {
            previous = finger;
            finger = finger.next();
        }
        // finger is null, or points to end of list
        if (previous == null)
        {
             // has exactly one element
	    head = null;
        }
	else
	{
	    // pointer to last element is reset
	    previous.setNext(null);
        }
        count--;
        return finger.value();
    }
    
    /**
     * remueve un valor de la lista. 
     * @pre value no sea nulo
     * @post se remueve primer elemento con valor value, si existe
     * @param value
     * @return el actual valor removido
     * @since 19/09/2012
     * @see List
     */
    @Override
    public E remove(E value)
    {
        Node<E> finger = head;
        Node<E> previous = null;
        while (finger != null && !finger.value().equals(value))
        {
            previous = finger;
            finger = finger.next();
        }
        // finger points to target value
	if (finger != null) {
	    // we found element to remove
	    if (previous == null) // it is first
	    {
		head = finger.next();
	    } else {              // it's not first
		previous.setNext(finger.next());
	    }
	    count--;
	    return finger.value();
	}
	// didn't find it, return null
	return null;
    }
    
    /**
     * devuelve una lista de desplazamiento iterador de la cabeza a la cola.
     * @pre n/a
     * @post devuelve un iterador permitiendo recorrido de la lista
     * @return
     * @since 19/09/2012
     * @see List
     */
    @Override
    public Iterator<E> iterator(){
        Iterator<E> iterator = new SinglyLinkedListIterator<>(head);
        return iterator;            
    }
}