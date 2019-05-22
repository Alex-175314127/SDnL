/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;






import java.util.Stack;






/**
 *
 * @author BASISA13
 */
public class Graph {
    private int maxVertex=10;
    private Vertex[] vertexList;
    private int[][] adjencyVertex;
    private int countVertex=0;

    public Graph(int maxtex) {
        this.maxVertex = maxtex;
        vertexList = new Vertex[maxtex];
        adjencyVertex = new int [maxtex][maxtex];
    }
    
    public  void addVertex(char add){
        if (countVertex < maxVertex) {
          vertexList[countVertex] = new Vertex(add);
          countVertex ++;
        }
    }
    
    public void addEdge(int a,int b, int c){
        
    }
    
    public void addEdge(char d,char e, int f){
        int indexd = indexVertex(d);
        int indexe = indexVertex(e);
        
        if (indexd != -1 && indexe != -1 && indexd != indexe) {
            adjencyVertex[indexd][indexe]= f;
            adjencyVertex[indexe][indexd] = f;
        }
    }
    
    private int indexVertex(char idx){
        for (int i = 0; i < vertexList.length; i++) {
            if (vertexList[i].label == idx) {
                return i;
            }
        }
        return -1;
        
    }
    
    public void show(){
        for (int i = 0; i < adjencyVertex.length; i++) {
            for (int j = 0; j < adjencyVertex.length; j++) {
                if (adjencyVertex[i][j] != -1 && adjencyVertex[i][j] != 0) {
                    System.out.println(vertexList[i].label+" terhubungke "+vertexList[j].label+" dengan beban "+adjencyVertex[i][j]);
                }
            }
        }
    }
    
    public void dfs(){
        int bantu;
        Stack st =new Stack();
        st.push(0);
        while (!st.isEmpty()) {
            bantu = (int) st.pop();
            if (vertexList[bantu].flagVisited == false) {
                System.out.println(vertexList[bantu].label+" ");
                vertexList[bantu].flagVisited = true;
            }
            for (int i = countVertex -1; i >= 0; i--) {
                if (adjencyVertex[bantu][i]>= 1 && vertexList[i].flagVisited == false) {
                    st.push(i);
                }
            }
        }
    }
    
    @Override
    public String toString() {
    String text = " ";
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                text = text + adjencyVertex[i][j];
                
            }
            text += "\n";
        }
        return text;
}
    public void bfs() {
        int x;
        Queue q = new Queue();
        q.enqueue(0);
        while (!q.isEmpty()) {          
                x = (int) q.dequeue();
                if (vertexList[x].flagVisited == false) {
                    System.out.println(vertexList[x].label+" ");
                    vertexList[x].flagVisited = true;
                }
                for (int i = countVertex -1; i >= 0; i--) {
                    if (adjencyVertex[x][i] >= 1 && vertexList[i].flagVisited == false) {
                        q.enqueue(i);
                    }
                }           
            }
        }
    }

    