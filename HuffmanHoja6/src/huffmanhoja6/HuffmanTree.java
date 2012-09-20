package huffmanhoja6;

/**
 * @author, 2001 duane a. bailey
 * Basada en: http://www.cs.williams.edu/~bailey/JavaStructures2/examples/index.html clase Huffman.java
 * Modificado por Douglas Dávila
 */
public class HuffmanTree implements Comparable {
    BinaryTree root;    // root of tree
    int totalWeight;    // weight of tree
    int contador=-1;    // contador de caracteres

    /**
     * constructor 
     * @pre  n/a
     * @post construct a leaf with associated character   
     * @param e
     */
    public HuffmanTree(Leaf e)
    {
        root = new BinaryTree(e);
        totalWeight = e.frequency;
    }

    /**
     * constructor con árboles Huffman
     * @pre left and right non-null
     * @post merge two trees together and merge their weights
     * @param left
     * @param right
     */
    public HuffmanTree(HuffmanTree left, HuffmanTree right)
    {
        this.totalWeight = left.totalWeight + right.totalWeight;
        root = new BinaryTree(null,left.root,right.root);
    }

    /**
     * compara la variable con el parametro 
     * @pre other is non-null
     * @post return integer reflecting relation between values
     * @param other 
     */
    @Override
    public int compareTo(Object other)
    {
        HuffmanTree that = (HuffmanTree)other;
        return this.totalWeight - that.totalWeight;
    }

    /**
     * determina si el valor es igual para dos variables
     * @pre n/a
     * @post return true if this and that are same tree instance
     * @param that
     */
    @Override
    public boolean equals(Object that)
    // post: return true if this and that are same tree instance
    {
        return this == that;
    }
    
    /**
     * llama al método print enviando la ruta actual como parametro
     * @pre n/a
     * @post print out strings associated with characters in tree
     */
    public void print()
    {
        print(this.root,"");
    }

    /**
     * muestra como se representan los caracteres del árbol
     * @pre n/a
     * @post print out strings associated with chars in tree r,
     *       prefixed by representation      
     * @param r
     * @param representation
     */
    protected void print(BinaryTree r, String representation)
    {           
        if (!r.left().isEmpty())
        {   // nodo interior
            print(r.left(),representation+"0"); // Agregar 0
            print(r.right(),representation+"1"); // Agregar 1
        } else { // Leaf; imprimir codificación
            Leaf e = (Leaf)r.value();            
            System.out.println("   "+e.ch +"     -        "
                               +e.frequency+"        -      "
                               +representation);            
            System.out.println("-----------------------------------------------");
        }   
    }
    
    /**
     * llama al método decode enviando parametros 
     * @pre n/a
     * @post  print out strings associated by representation 
     * @param mensaje
     */
    public void decode(String mensaje){
        decode(this.root,mensaje);
    }
    
    /**
     * imprime los caracteres asociados con su representación de 0 y 1
     * @pre n/a
     * @post  print out message decode
     * No hay valor de retorno
     * @param r
     * @param message
     */
    protected void decode(BinaryTree r, String message){
        contador++; 
        if(contador<=message.length()){
            if(!r.left().isEmpty()){
                if(contador!=message.length()){
                    if(message.charAt(contador)=='0'){
                        decode(r.left(),message);
                    }
                    else if(message.charAt(contador)=='1'){
                        decode(r.right(),message);
                    }
                }
            } else{
                Leaf e = (Leaf)r.value();
                System.out.print(e.ch);
                contador--;
                if(contador!=message.length()&&contador>0){
                    if(message.charAt(contador)=='0'||message.charAt(contador)=='1'){
                        decode(message);
                    }
                }
            }
        }     
    }    
}