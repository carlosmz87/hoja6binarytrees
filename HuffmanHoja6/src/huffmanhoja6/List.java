package huffmanhoja6;

import java.util.Iterator;
/**
 * Interfaz generica de estructura de datos Listas
 * @param <E> clase generica
 * @author Douglas Davila
 * @since 12/08/2012
 * @version 1.1
 */
public interface List<E> {

    /**
     * Se determina la cantidad de objetos dentro de la lista
     * @return la cantidad de objetos dentro de la lista
     * @pre n/a
     * @post se retorna la cantidad de objetos dentro de la lista
     */
    public int size();
    
    /**
     * Se determina si la lista esta vacia
     * @return verdadero si y solo si la lista esta vacia
     * @pre n/a
     * @post se retorna verdadero si y solo si la lista esta vacia
     * @since 12/08/2012
     */
    public boolean isEmpty();
    
    
    /**
     * Ingresa un objeto al inicio de la lista
     * @param item objeto a ingresar
     * @pre n/a
     * @post el objeto es agregado
     * @since 12/08/2012
     */
    public void addFirst(E item);

    /**
     * Se obtiene la referencia del primer objeto en la lista
     * @return la referencia del primer objeto en la lista
     * @pre que la lista no este vacia
     * @post se retorna la referencia del primer objeto en la lista
     * @since 12/08/2012
     */
    public E getFirst();

    /**
     * Saca el primer objeto en la lista
     * @return el primer objeto en la lista
     * @pre que la lista no este vacia
     * @post el primer objeto en la lista es removido de la misma
     * @since 12/08/2012
     */
    public E removeFirst();
    
    /**
     * Remueve el último objeto en la lista
     * @pre que la lista no este vacía
     * @post el último elemento se remueve
     * @return
     * @since 19/09/2012
     */
    public E removeLast();
    
    /**
     * Elimina un objeto con valor vulue
     * @pre que value no se nulo
     * @post objeto elimiado con valor value , si existe
     * @param value
     * @return
     * @since 19/09/2012
     */
    public E remove(E value);
   
    /**
     * iterador de List
     * @pre n/a
     * @post devuelve un iterador para desplasarce en una lista
     * @return
     * @since 19/09/2012
     */
    public Iterator<E> iterator();
}
