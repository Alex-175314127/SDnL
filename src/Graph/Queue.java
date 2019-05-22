/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.LinkedList;

/**
 *
 * @author basisa19
 */
public class Queue {
    LinkedList Queue;
    
    public Queue(){
        Queue = new LinkedList();
    }
    public void enqueue(int a){
        Queue.addLast(a);
    }
    public int dequeue(){
        return (int) Queue.removeFirst();
    }
    public boolean isEmpty(){
        return Queue.isEmpty();
    }
}
