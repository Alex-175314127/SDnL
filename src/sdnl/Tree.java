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
public class Tree {

    private TreeNode root;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insert(int data) {
        TreeNode n = new TreeNode(data);
        if (root == null) {
            root = n;
        } else {
//            TreeNode cb = root;
             getRoot().insert(data);

//            while (true) {
//                if (data < cb.getData()) {
//                    if (cb.getLeft() == null) {
//                        cb.setLeft(n);
//                        break;
//                    } else {
//                        cb = cb.getLeft();
//                    }
//                } else {
//                    if (cb.getRight() == null) {
//                        cb.setRight(n);
//                        break;
//                    } else {
//                        cb = cb.getRight();
//                    }
//                }
//            }
        }
    }

    public TreeNode Search(int key) {
        TreeNode x = root;
        while (x != null) {
            if (x.getData() == key) {
                return x;
            } else if (x.getData() > key) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public void preOrderTraversal(){
        preOrderHelper(root);
    }
    
    public void preOrderHelper(TreeNode x){
        if (x != null) {
            System.out.print(" "+x.getData());
            preOrderHelper(x.getLeft());
            preOrderHelper(x.getRight());
        }
    }
    
    public void inOrderTraversal(){
    inOrderHelper(root);
    }
    
    public void inOrderHelper(TreeNode xx){
        if(xx != null){
            inOrderHelper(xx.getLeft());
            System.out.print(" "+xx.getData());
            inOrderHelper(xx.getRight());
        }
    }
    
    public void postOrderTraversal(){
        postOrderHelper(root);
    }
    
    public void postOrderHelper(TreeNode xxx){
        if (xxx != null) {
            postOrderHelper(xxx.getLeft());
            postOrderHelper(xxx.getRight());
            System.out.print(" "+xxx.getData());
        }
    }

//    public void Delete(int del){
//        boolean a = false;
//        TreeNode x = root;
//        
//        while (x != null) {
//            if (x.getData() == del) {
//                a = true;
//                break;
//            }else if(x.getLeft() != null && del < x.getData()){
//                x = x.getLeft();
//            }else if(x.getRight() != null && del > x.getData()) {
//                x = x.getRight();
//            }else{
//                a = false;
//                break;
//            }
//        }
//        if(!a){
//            System.out.println("Node tidak ada");
//        }else{
//            
//        }
//    }
    public void depth(int d){
     TreeNode x = root;
     int y= 0;
        while (x != null) {
            if (x.getData() == d) { 
                System.out.println(" "+y);
                break;
            } else if (x.getData() > d) {
                x= x.getLeft();
                y++;
            } else {
                x = x.getRight();
                y++;
            }
        }
    }
    
    public void height(int h){
         TreeNode x = root;
     int y= 1;
        while (x != null) {
            if (x.getData() == h) { 
                System.out.println(" "+y);
                break;
            } else if (x.getData() > h) {
                x= x.getLeft();
                y++;
            } else {
                x = x.getRight();
                y++;
            }
        }
    }
}
