package Heap;

import java.util.Vector;
/**
 * @version $Id: VectorHeap.java,v 4.0 2000/12/27 20:57:33 bailey Exp bailey $
 * @author, 2001 duane a. bailey
 * modificada por: Douglas Dávila
 * @param <E> 
 */
public class VectorHeap <E extends Comparable> {
    /**
     * The data, kept in heap order.
     */
    protected Vector<E> data; 
    
    /**
     * Construct a new priority queue from an unordered vector
     * @pre n/a
     * @post constructs a new priority queue from an unordered vector   
     */
    public VectorHeap()
    {
        data = new Vector<E>();
    }
    
    /**
     * Construct a new priority queue from an unordered vector
     * @pre n/a
     * @post constructs a new priority queue from an unordered vector
     * @param v
     */
    public VectorHeap(Vector<E> v)
    {
        int i;
        data = new Vector<E>(v.size()); // se conoce el tamaño
        for (i = 0; i < v.size(); i++)
        { // agregar elementos al heap
            add(v.get(i));
        }
    }
    
    /**
     * Returns parent index
     * @param i a node index
     * @return parent of node at i
     * @pre 0 <= i < size
     * @post returns parent of node at location i
     */
    protected static int parent(int i)
    {
        return (i-1)/2;
    }
    
    /**
     * Returns left child index.
     * @param i a node index
     * @return left child of node at i
     * @pre 0 <= i < size
     * @post returns index of left child of node at location i
     */
    protected static int left(int i)
    {
        return 2*i+1;
    }
    
    /**
     * Returns right child index.
     * @param i a node index
     * @return right child of node at i
     * @pre 0 <= i < size
     * @post returns index of right child of node at location i
     */
    protected static int right(int i)
    {
        return 2*(i+1);
    }
    
     /**
     * Fetch lowest valued (highest priority) item from queue.
     * @pre !isEmpty()
     * @post returns the minimum value in priority queue
     * @return The smallest value from queue.
     */
    public E getFirst()
    {
        return data.get(0);
    }
        
    /**
     * Returns the minimum value from the queue.
     * @pre !isEmpty()
     * @post returns and removes minimum value from queue
     * @return The minimum value in the queue.
     */
    public E remove()
    {
        E minVal = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if (data.size() > 1) {
            pushDownRoot(0);
        }
        return minVal;
    }
        
    /**
     * Add a value to the priority queue.
     * @pre value is non-null comparable
     * @post value is added to priority queue
     * @param value The value to be added.
     */
    public void add(E value)
    {
        data.add(value);
        percolateUp(data.size()-1);
    }
    /**
     * Moves node upward to appropriate position within heap.
     * @param leaf Index of the node in the heap.
     * @pre 0 <= leaf < size
     * @post moves node at index leaf up to appropriate position
     */
    protected void percolateUp(int leaf)
    {
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0))
        {
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }
    
    /**
    * Moves node downward, into appropriate position within subheap.
     * @param root Index of the root of the subheap.
     * @pre 0 <= root < size
     * @post moves node at index root down 
     *   to appropriate position in subtree
     */
    protected void pushDownRoot(int root)
    {
        int heapSize = data.size();
        E value = data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize)
            {
                if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo(data.get(childpos)) < 0))
                {
                    childpos++;
                }
                // Assert: childpos indexes smaller of two children
                if ((data.get(childpos)).compareTo(value) < 0)
                {
                    data.set(root,data.get(childpos));
		    root = childpos; // keep moving down
		} else { // found right location
		    data.set(root,value);
		    return;
		}
	    } else { // at a leaf! insert and halt
                data.set(root,value);
                return;
            }
        }
    }
   
    /**
     * Determine the size of the queue.
     * @post returns number of elements within queue
     * @return The number of elements within the queue.
     */
    public int size(){
        return data.size();
    }
}