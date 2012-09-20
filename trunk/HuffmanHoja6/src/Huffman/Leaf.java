package Huffman;

/**
 * @author, 2001 duane a. bailey
 * Basada en: http://www.cs.williams.edu/~bailey/JavaStructures2/examples/index.html clase Huffman.java
 * Modificado por Douglas Dávila
 */
public class Leaf {
    public int frequency; // frequency of char
    char ch;    // the character
    
    /**
     * constructor
     * @pre n/a
     * @post construct character entry with frequency 1
     * @param c
     */
    public Leaf(char c)
    {
        ch = c;
        frequency = 1;
    }
    /**
     * verificar si el valor de dos variables son iguales
     * @pre n/a
     * @post  return true if leaves represent same character
     * @param other 
     */
    @Override
    public boolean equals(Object other)
    {
        Leaf that = (Leaf)other;
        return this.ch == that.ch;
    }
    
}