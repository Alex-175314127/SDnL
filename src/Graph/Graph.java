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
            if (vertexList[i].getLabel() == idx) {
                return i;
            }
        }
        return -1;
        
    }
    
    public void show(){
        for (int i = 0; i < adjencyVertex.length; i++) {
            for (int j = 0; j < adjencyVertex.length; j++) {
                if (adjencyVertex[i][j] != -1 && adjencyVertex[i][j] != 0) {
                    System.out.println(vertexList[i].getLabel()+" terhubungke "+vertexList[j].getLabel()+" dengan beban "+adjencyVertex[i][j]);
                }
            }
        }
    }
    
    public void dfs(){
        
    }
    
    @Override
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
