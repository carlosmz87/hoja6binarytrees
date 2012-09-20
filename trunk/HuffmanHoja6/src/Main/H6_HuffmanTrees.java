package Main;

import Heap.VectorHeap;
import Huffman.HuffmanTree;
import Huffman.Leaf;
import List.List;
import List.SinglyLinkedList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * basado en: http://www.cs.williams.edu/JavaStructures/Book_files/JavaStructures.pdf
 *            Capitulo 12.8 Example: Huffman Compression; páginas 305 a 307
 * @author Douglas Dávila
 * @since 19/09/2012
 */
public class H6_HuffmanTrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        List freq = new SinglyLinkedList();
        
        System.out.println();
        System.out.println("Ingrese una cadena con un mínimo de dos caracteres. "
                         + "\nLuego, presione <Enter> para  ver "
                         + "el código Huffman de cada caracter. ");
        
        //Mensaje a codificar
        String cadena = s.nextLine();
        
        int controlador=0;
        // read data from input
        while (controlador<cadena.length())
        {
            // get first char in controlador position
           char c = cadena.charAt(controlador); 
            // Verificar que no sea cambio de linea
           if (c == '\n') {
                continue;
            }
            // look up character in frequency list
            Leaf query = new Leaf(c);
            Leaf item = (Leaf)freq.remove(query);
            if (item == null)
            {   // not found, add new leaf
                freq.addFirst(query);
            } else { // found, increment leaf
                item.frequency++;
                freq.addFirst(item);              
            }
            controlador++;
        }
             
       // insert each character into a Huffman tree
        Iterator li = freq.iterator();
        VectorHeap trees = new VectorHeap();
        while (li.hasNext())
        {
            trees.add(new HuffmanTree((Leaf)li.next()));
        }
        
         // merge trees in pairs until one remains
        while (trees.size() > 1)
        {
             // grab two smallest values
            HuffmanTree smallest = (HuffmanTree)trees.remove();
            HuffmanTree small = (HuffmanTree)trees.remove();           
           
            // add bigger tree containing both
            trees.add(new HuffmanTree(smallest,small));
            
        }
        if(trees.size()!=0){
            HuffmanTree encoder = (HuffmanTree)trees.remove();
            // se muestra la codificación de los caracteres
            System.out.println("\nCARACTER      FRECUENCIA     CODIGO HUFFMAN");
            encoder.print();
            System.out.println("\n En base a la codificacion anterior puede escribir una cadena de caracteres"
                             + "\n Ingrese una secuencia de codigos huffman: ");
            // lectura de los codigos huffman para decodificar
            cadena=s.nextLine();
            controlador=0;
            System.out.println();
            System.out.println("Mensaje decodificado: ");
            while(controlador<cadena.length()){
                // se muestra la decodificacion de los codigos de Huffman
                encoder.decode(cadena);
                controlador++;
            }            
            
            System.out.println("\n\nFin del programa.");
            System.out.println();            
            System.out.println("----Hoja de Trabajo 6 - Arbol de Huffman----");
            System.out.println("   Douglas Gonzalo Dávila Milián - 11042    ");
            
        }    
    }
}