
package huffmanhoja6;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Douglas Dávila
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        instance.add(4);
        instance.add(5);
        instance.add(6);
        Object expResult = 4;
        Object result = instance.remove();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Comparable value = 1;
        VectorHeap instance = new VectorHeap();
        instance.add(value);
        Object expResult = value;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of percolateUp method, of class VectorHeap.
     */
    @Test
    public void testPercolateUp() {
        System.out.println("percolateUp");
        int leaf = 2;
        VectorHeap instance = new VectorHeap();
        instance.add(7);
        instance.add(8);
        instance.add(9);
        instance.percolateUp(leaf);
    }

    /**
     * Test of pushDownRoot method, of class VectorHeap.
     */
    @Test
    public void testPushDownRoot() {
        System.out.println("pushDownRoot");
        int root = 0;
        VectorHeap instance = new VectorHeap();
        instance.add(1);
        instance.add(2);
        instance.add(3);
        instance.pushDownRoot(root);
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        instance.add(100);
        instance.add(10);
        instance.add(1);
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);     
    }
}
