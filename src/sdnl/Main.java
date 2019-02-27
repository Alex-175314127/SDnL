/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdnl;

/**
 *
 * @author basisa19
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tree t = new Tree();
        t.insert(42);
        t.insert(21);
        t.insert(38);
        
        System.out.println("cari : "+t.Search(21));
        
    }
    
}
