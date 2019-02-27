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
            TreeNode cb = root;

            while (true) {
                if (data < cb.getData()) {
//                    cb = cb.getLeft();
                    if (cb.getLeft() == null) {
                        cb.setLeft(n);
                        break;
                    } else {
                        cb = cb.getLeft();
                    }
                } else {
//                    cb = cb.getRight();
                    if (cb.getRight() == null) {
                        cb.setRight(n);
                        break;
                    } else {
                        cb = cb.getRight();
                    }
                }
            }
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
//        while (x != null) {
//            if (x.getData() == key) {
//                return x;
//            } else if (x.getData() > key) {
//                x = x.getLeft();
//            } else {
//                x = x.getRight();
//            }
//        }
        return null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

//    public String toString() {
//
//    }
}
