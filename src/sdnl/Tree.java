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
             getRoot().insert(data);
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

    public TreeNode Delete(int key){
           TreeNode x = Search(key);    
        TreeNode parent = getCurrnet(key); 
        
        if (x == null) { 
            return null;     
        } else if (x == root) { 
            if (x.Leaft()) { 
                root = null;       
            }
            if (root.getRight() == null) { 
                root = x.getLeft();   
            } else if (root.getLeft() == null) { 
                root = x.getRight();   
            }
        } else if (x.getData() < parent.getData()) {      
            if (x.Leaft()) { 
                parent.setLeft(null); 
            } else if (x.getRight() == null) { 
                parent.setLeft(x.getLeft()); 
            } else { 
                parent.setLeft(x.getRight()); 
            }
        } else if (x.getData() > parent.getData()) {           
            if (x.Leaft()) { 
                parent.setRight(null); 
            } else if (x.getLeft() == null) { 
                parent.setRight(x.getLeft()); 
            } else { 
                parent.setRight(x.getRight()); 
            }
        }
        return x; 
    }
    
     public TreeNode getCurrnet(int key) {
        TreeNode bantu = root;
        TreeNode parent = null;
        while (bantu != null) {
            if (bantu.getData() == key) {
                return parent;
            } else if (bantu.getData() > key) {
                parent = bantu;
                bantu = bantu.getLeft();
            } else {
                parent = bantu;
                bantu = bantu.getRight();
            }
        }
        return null;
    }
    
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
    
    public void leaf(TreeNode loot){
        
        if (loot == null) {
            return;
        }
         if(loot.getLeft() == null && loot.getRight() == null){
            System.out.println("leaf : "+loot.getData());
            return;
        } 
         leaf(loot.getLeft());
         leaf(loot.getRight());
    }
    
    public void descendant(TreeNode x,int des){
   
        while (x != null) {
            if (x.getData() == des ) {
                descendant(x.getLeft(), des);
                descendant(x.getRight(), des);
                System.out.println(" "+x.getData());
                break;
            } else if (x.getData() > des) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
    }
    
    }
