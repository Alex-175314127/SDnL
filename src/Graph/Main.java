/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author Alexander Adam
 */
public class Main {
    public static void main(String[] args) {
        Graph gp = new Graph(5);
        
        gp.addVertex('A');
        gp.addVertex('B');
        gp.addVertex('C');
        gp.addVertex('E');
        gp.addVertex('F');
        
        gp.addEdge('A', 'B', 4);
        gp.addEdge('A', 'F', 5);
        gp.addEdge('B', 'C', 5);
        gp.addEdge('B', 'E', 4);
        
        System.out.println("Matriks Information");
        System.out.println(gp.toString());
        gp.show();
    }       
}
