/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackTree;

/**
 *
 * @author basisa19
 */
class StackTree {
    private ListTree stackListTree;

    public StackTree() {
        stackListTree = new ListTree();
    }
    
    public void push(TreeNode add){
        stackListTree.insertAtFront(add);
    }
    
    public TreeNode pop(){
        return stackListTree.removeFromFront();
    }
    
    public boolean isEmpty(){
        return stackListTree.isEmpty();
    }
    public void print (){
        stackListTree.print();
    }

   
}
