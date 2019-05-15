/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;




/**
 *
 * @author BASISA13
 */
public class Graph {
    private int maxVertex=10;
    private Vertex[] vertexList;
    private int[][] adjencyVertex;
    private int countVertex=0;

    public Graph() {
        adjencyVertex = new int[maxVertex][countVertex];
        vertexList = new Vertex[countVertex];
    }
    
    public  void addVertex(char add){
        Vertex ver = null ;
        ver.Vertex(add);
        if (ver == null) {
          
        }
    }
    
    public void addEdge(int a,int b, int c){
        
    }
    
    public void addEdge(char d,char e, int f){
        
    }
    
    private int indexVertex(char idx){
        return 0;
        
    }
    
    public void show(){
        
    }
    
    public void dfs(){
        
    }
    
    public String toString(){
        String text = "";
        for (int i = 0; i < vertexList.length; i++) {
            for (int j = 0; j < vertexList.length; j++) {
                text = text + adjencyVertex[i][j]+" ";
            }
            text += "\n";
        }
        return text;
    }
}
