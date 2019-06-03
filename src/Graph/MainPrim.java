/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;


/**
 *
 * @author basisc22
 */
public class MainPrim {

    public static void main(String[] args) {

        Graph grph = new Graph(5);
        grph.addVertex('A');
        grph.addVertex('B');
        grph.addVertex('C');
        grph.addVertex('D');
        grph.addVertex('E');

        grph.addEdge('A', 'C', 10);
        grph.addEdge('C', 'B', 20);
        grph.addEdge('C', 'E', 40);
        grph.addEdge('B', 'D', 30);
        grph.addEdge('B', 'E', 70); 
        
        System.out.println("prim algoritm");
//        System.out.println(grph.getPrimEdges());
     
        ArrayList prim = grph.getPrimEdges();
        int weight=0;
        for (int i = 0; i < prim.size(); i++) {
            System.out.println(prim.get(i));
        }
        System.out.println("total weight :"+weight);
        
        
        
    }
}
