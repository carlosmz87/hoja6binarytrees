package huffmanhoja6;

import java.util.Iterator;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Douglas Dávila
 */
public class SinglyLinkedListTest {
    
    public SinglyLinkedListTest() {
    }
    
    /**
     * Test of size method, of class SinglyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SinglyLinkedList instance = new SinglyLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of addFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object item = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addFirst(item);
    }

    /**
     * Test of getFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addFirst(3);
        instance.addFirst(2);
        instance.addFirst(1);
        Object expResult = 1;
        Object result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addFirst(1);
        Object expResult = 1;
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
   }

    /**
     * Test of clear method, of class SinglyLinkedList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.clear();
     }

    /**
     * Test of removeLast method, of class SinglyLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        SinglyLinkedList instance = new SinglyLinkedList();
        instance.addFirst(4);
        Object expResult = 4;
        Object result = instance.removeLast();
        assertEquals(expResult, result);
     }

    /**
     * Test of remove method, of class SinglyLinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object value = null;
        SinglyLinkedList instance = new SinglyLinkedList();
        Object expResult = null;
        Object result = instance.remove(value);
        assertEquals(expResult, result);
      }

    /**
     * Test of iterator method, of class SinglyLinkedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        SinglyLinkedList instance = new SinglyLinkedList();
        Iterator expResult = null;
        Iterator result = null;
        assertEquals(expResult, result);
     }
}
