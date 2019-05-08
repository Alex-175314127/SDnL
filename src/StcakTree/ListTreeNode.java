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
public class ListTreeNode {
    TreeNode data;
    ListTreeNode nextNode;

ListTreeNode(TreeNode treeNode){
    this(treeNode,null);
    }

 ListTreeNode(TreeNode data, ListTreeNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public TreeNode getData() {
        return data;
    }

    public ListTreeNode getNextNode() {
        return nextNode;
    }
 
}
