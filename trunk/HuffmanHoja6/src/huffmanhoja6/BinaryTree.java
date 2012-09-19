package huffmanhoja6;

/**
 * basado en: http://www.cs.williams.edu/~bailey/JavaStructures/doc/structure5/index.html
 *            BinaryTree.java
 * @version $Id: BinaryTree.java,v 4.0 2000/12/27 20:57:33 bailey Exp bailey $
 * @author, 2001 duane a. bailey
 * Modificada por Douglas Dávila
 * @param <E> 
 */
public class BinaryTree <E> {
    
    protected E val; // The value associated with this node
    protected BinaryTree<E> parent; //The parent of this node
    protected BinaryTree<E> left,right; // The left child of this node, or an "empty" node
    
    /**
     * A one-time constructor, for constructing empty trees.
     * @pre n/a
     * @post Constructor that generates an empty node
     */
    public BinaryTree(){
        val = null;
        parent = null; left = right = this;
    }
    
    /**
     * Constructs a tree node with no children. 
     * Value of the node and subtrees are provided by the user
     * @pre n/a
     * @post Returns a tree referencing value and two empty subtrees
     * @param value
     */
    public BinaryTree(E value){
        val = value;
        right = left = new BinaryTree<E>();
        setLeft(left);
        setRight(right);
    }
    
    /**
     * Constructs a tree node with two children. 
     * Value of the node and subtrees are provided by the user.
     * @pre  n/a
     * @post  Returns a tree referencing value and two subtrees   
     * @param value
     * @param left 
     * @param right
     */
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right){
        val = value;
        if (left == null) { left = new BinaryTree<E>(); }
        setLeft(left);
        if (right == null) { right = new BinaryTree<E>(); }
        setRight(right);
    }
    
    /**
     * Get left subtree of current node
     * @pre n/a
     * @post Returns reference to (possibly empty) left subtree
     * @return
     */
    public BinaryTree<E> left(){
        return left;
    }
    
    /**
     * Get right subtree of current node
     * @pre n/a
     * @post Returns reference to (possibly empty) right subtree
     * @return
     */
    public BinaryTree<E> right(){
        return right;
    }
    
    /**
     * Get reference to parent of this node
     * @pre n/a
     * @post Returns reference to parent node, or null
     * @return Reference to parent of this node
     */
    public BinaryTree<E> parent(){
        return parent;
    }
    
    /**
     * Update the left subtree of this node. 
     * Parent of the left subtree is updated consistently. 
     * Existing subtree is detached
     * @pre n/a
     * @post Sets left subtree to newLeft re-parents newLeft if not null
     * @param newLeft
     */
    public void setLeft(BinaryTree<E> newLeft){
        if (isEmpty()) return;
        if (left != null && left.parent() == this) left.setParent(null);
        left = newLeft;
        left.setParent(this);
    }
    
    /**
     * Update the right subtree of this node. 
     * Parent of the right subtree is updated consistently.
     * Existing subtree is detached
     * @pre n/a
     * @post Sets left subtree to newRight re-parents newRight if not null
     * @param newRight
     */
    public void setRight(BinaryTree<E> newRight){
        if (isEmpty()) return;
        if (right != null && right.parent() == this) right.setParent(null);
        right = newRight;
        right.setParent(this);
    }
    
    /**
     * Update the parent of this node
     * @pre n/a
     * @post Re-parents this node to parent reference, or null
     * @param newParent
     */
    protected void setParent(BinaryTree<E> newParent){
        if (!isEmpty()) {
            parent = newParent;
        }
    }
    
    /**
     * Returns value associated with this node
     * @pre n/a
     * @post Returns value associated with this node
     * @return
     */
    public E value(){
        return val;
    }
    
    /**
     * Set's value associated with this node
     * @pre n/a
     * @post Sets the value associated with this node
     * @param value
     */
    public void setValue(E value){
        val = value;
    }
    
    /**
     * Returns true if tree is empty.
     * @pre n/a
     * @post Returns true iff the tree rooted at node is empty
     * @return True iff tree is empty
     */
    public boolean isEmpty() {
        return val==null&&parent==null&&right==this&&left==this;
    }
}