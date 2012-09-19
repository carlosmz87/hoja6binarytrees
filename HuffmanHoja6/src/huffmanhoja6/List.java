package huffmanhoja6;

/**
 * Interfaz generica de estructura de datos Listas
 * @param <E> clase generica
 * @author Douglas Davila
 * @since 12/08/2012
 * @version 1.0
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
}
