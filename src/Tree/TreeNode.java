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
public class TreeNode {
    private int Data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int Data) {
        this.Data = Data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
    
    public void insert(int a){
        if (a < getData()) {
            if (left == null) {
                left = new TreeNode(a);
            }else{
                getLeft().insert(a);
            }
        }else{
            if (right == null) {
                right = new TreeNode(a);
            }else{
                getRight().insert(a);
                
            }
        }
    }
    public boolean Leaf() {
        if (this.left == null && this.right == null) {
            return true;
        }
        return false;
    }
}
