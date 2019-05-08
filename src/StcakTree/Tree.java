/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StcakTree;

/**
 *
 * @author basisa19
 */
public class Tree {
    private TreeNode root;
    public Tree(){
        root = null;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    public void insertNode(char insertValue){
        if (root == null) {
            root = new TreeNode(insertValue);
        }else{
            root.insert(insertValue);
        }
    }
    
    public void preorderTraversal(){
        preorderHelper(root);
    }
    
    public void inorderTraversal(){
        inorderHelper(root);
    }
    
    public void postorderTraversal(){
        postorderHelper(root);
    }
    private void preorderHelper(TreeNode node){
        if (node == null) {
            return;
        }
        System.out.println(node.data+" ");
        preorderHelper(node.leftNode);
        preorderHelper(node.rightNode);
    }
    
    private void inorderHelper(TreeNode node){
        if (node == null) {
            return;
        }
        inorderHelper(node.leftNode);
        System.out.println(node.data+" ");
        inorderHelper(node.rightNode);
    }
    
    private void postorderHelper(TreeNode node){
        if (node == null) {
            return;
        }
        postorderHelper(node.leftNode);
        postorderHelper(node.rightNode);
        System.out.println(node.data+" ");
    }
}
