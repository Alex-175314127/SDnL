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
        Graph gp = new Graph(7);

        gp.addVertex('A');
        gp.addVertex('B');
        gp.addVertex('C');
        gp.addVertex('D');
        gp.addVertex('F');
        gp.addVertex('G');
        gp.addVertex('H');

        gp.addEdge('A', 'B', 5);
        gp.addEdge('A', 'F', 4);
        gp.addEdge('A', 'D', 7);
        gp.addEdge('B', 'C', 7);
        gp.addEdge('B', 'D', 6);
        gp.addEdge('C', 'G', 9);
        gp.addEdge('C', 'H', 15);
        gp.addEdge('D', 'G', 5);
        gp.addEdge('F', 'G', 9);
        gp.addEdge('G', 'H', 8);

        System.out.println("\ndfs : ");
//        gp.dfs();
        gp.bfs();
        System.out.println("Matriks Information");
        System.out.println(gp.toString());
        gp.show();
        
        gp.getPrimEdges();
    }
}
