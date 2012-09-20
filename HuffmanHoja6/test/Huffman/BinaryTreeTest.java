
package Huffman;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Douglas Dávila
 */
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
        
    /**
     * Test of left method, of class BinaryTree.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        BinaryTree instance = new BinaryTree();
        BinaryTree left = new BinaryTree(4,instance, new BinaryTree());
        BinaryTree expResult = instance;
        BinaryTree result = left.left();
        assertEquals(expResult, result);
     }

    /**
     * Test of right method, of class BinaryTree.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        BinaryTree instance = new BinaryTree();
        BinaryTree right = new BinaryTree(4,new BinaryTree(),instance);        
        BinaryTree expResult = instance;
        BinaryTree result = right.right();
        assertEquals(expResult, result);
    }

    /**
     * Test of parent method, of class BinaryTree.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.parent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLeft method, of class BinaryTree.
     */
    @Test
    public void testSetLeft() {
        System.out.println("setLeft");
        BinaryTree instance = new BinaryTree();
        BinaryTree left = new BinaryTree();
        instance.setLeft(left);
   }

    /**
     * Test of setRight method, of class BinaryTree.
     */
    @Test
    public void testSetRight() {
        System.out.println("setRight");
        BinaryTree instance = new BinaryTree();
        BinaryTree right = new BinaryTree();
        instance.setRight(right);
    }

    /**
     * Test of setParent method, of class BinaryTree.
     */
    @Test
    public void testSetParent() {
        System.out.println("setParent");
        BinaryTree instance = new BinaryTree();
        BinaryTree parent = new BinaryTree();
        instance.setParent(parent);
    }

    /**
     * Test of value method, of class BinaryTree.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        BinaryTree instance = new BinaryTree();
        instance.setValue("test");
        Object expResult = "test";
        Object result = instance.value();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class BinaryTree.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object value = "test";
        BinaryTree instance = new BinaryTree();
        instance.setValue(value);
    }

    /**
     * Test of isEmpty method, of class BinaryTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinaryTree instance = new BinaryTree();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
}
