/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

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
     public TreeNode Delete(int key){
           TreeNode x = Search(key);    
        TreeNode parent = getCurrnet(key); 
        
        if (x == null) { 
            return null;     
        } else if (x == root) { 
            if (x.Leaf()) { 
                root = null;       
            }
            if (root.getRight() == null) { 
                root = x.getLeft();   
            } else if (root.getLeft() == null) { 
                root = x.getRight();   
            }
        } else if (x.getData() < parent.getData()) {      
            if (x.Leaf()) { 
                parent.setLeft(null); 
            } else if (x.getRight() == null) { 
                parent.setLeft(x.getLeft()); 
            } else { 
                parent.setLeft(x.getRight()); 
            }
        } else if (x.getData() > parent.getData()) {           
            if (x.Leaf()) { 
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
    
     public TreeNode getPredesessor(TreeNode f){
         TreeNode u = f.getLeft();
         while (f.getRight() != null) {
             f = f.getRight();
         }
         return f;
     }
     
     public TreeNode Delete2(int x){
         TreeNode xx = Search(x);
         TreeNode xxx = getCurrnet(x);
         if (xx == null) {
             return null;
         }else if(xx.getData() == root.getData()){
             if (xx.Leaf()) {
                 root = null;
             }
             if (root.getRight() ==null) {
                 root= xx.getLeft();
             }else if (root.getRight() == null) {
                 root = xx.getRight();
             }else{
                 TreeNode pds = getPredesessor(xx);
                 TreeNode point = getCurrnet(pds.getData());
                 xx.setData(pds.getData());
                 if (point != xx) {
                     if (pds.getLeft() != null) {
                         point.setRight(pds.getLeft());
                     }else{
                         point.setRight(null);
                     }
                 }else{
                     xx.setLeft(pds.getLeft());
                 }
             }
         }else if (xx.getData() < xxx.getData()) {
             if (xx.Leaf()) {
                 xxx.setLeft(null);
             }else if(xx.getRight() == null){
                 xxx.setLeft(xx.getLeft());
             }else if(xx.getLeft() == null){
                 xxx.setLeft(xx.getRight());
             }else{
                 TreeNode pds2 = getPredesessor(xx);
                 TreeNode point2 = getCurrnet(pds2.getData());
                 xx.setData(pds2.getData());
                 if (point2 != xx) {
                     if (pds2.getLeft() != null) {
                         point2.setRight(pds2.getLeft());
                     }else{
                         point2.setRight(null);
                     }
                 }else{
                     xx.setLeft(pds2.getLeft());
                 }
             }
         }else if (xx.getData() > xxx.getData()) {
             if (xx.Leaf()) {
                 xxx.setRight(null);
             }else if (xx.getRight() == null) {
                 xxx.setRight(xx.getLeft());
             }else if (xx.getLeft() == null) {
                 xxx.setRight(xx.getRight());
             }else {
                 TreeNode pds3 = getPredesessor(xx);
                 TreeNode point3 = getCurrnet(pds3.getData());
                 xx.setData(pds3.getData());
                 if (point3 != xx) {
                     if (pds3.getLeft() != null) {
                         point3.setRight(pds3.getLeft());
                     }else{
                         point3.setRight(null);
                     }
                 }else{
                     xx.setLeft(pds3.getLeft());
                 }
             }
         }return xx;
     } 
    }
