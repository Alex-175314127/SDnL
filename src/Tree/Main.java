/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author basisa19
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree t = new Tree();
        Scanner s = new Scanner(System.in);
        t.insert(42);
        t.insert(21);
        t.insert(38);
        t.insert(27);
        t.insert(71);
        t.insert(82);
        t.insert(55);
        t.insert(63);
        t.insert(6);
        t.insert(2);
        t.insert(40);
        t.insert(12);
       

        System.out.print(" preOrder : ");
        t.preOrderTraversal();
        System.out.print("\n inOreder : ");
        t.inOrderTraversal();
        System.out.print("\n postOrder : ");
        t.postOrderTraversal();

        System.out.print("\n depth : ");
        t.depth(40);
        System.out.print(" height : ");
        t.height(40);
        System.out.println("");
        System.out.print("cari data : ");

        int key = s.nextInt();
        TreeNode found;
        found = t.Search(key);
        if (found != null) {
            System.out.println("Data " + key + " Found in BST");
        } else {
            System.out.println("Data " + key + " not Found");
        }

        System.out.print("Hapus data : ");
        int key2 = s.nextInt();
        if (t.Delete2(key2) != null) {
            t.Delete2(key2);
            System.out.println("Data setelah nilai " + key + " dihapus:");
            System.out.print("preOrder  : ");
            t.preOrderTraversal();
            System.out.println();
            System.out.print("inOrder   : ");
            t.inOrderTraversal();
            System.out.println();
            System.out.print("postOrder : ");
            t.postOrderTraversal();
            System.out.println();
        } else {
            System.out.println("Data Tidak ketemu!");
        }

//        ImageIcon icon = new ImageIcon("b.png");
//        ImageIcon icon2 = new ImageIcon("1.png");
//        Image image = icon.getImage();
//        Image image2 = icon2.getImage();
//        Image newimg = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
//        Image newimg2 = image2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
//        icon= new ImageIcon(newimg);
//        icon2=new ImageIcon(newimg2);
//        Exception e = new Exception("Data not Found");
//        Tree t = new Tree();
//        t.insert(42);
//        t.insert(21);
//        t.insert(38);
//        t.insert(27);
//        t.insert(71);
//        t.insert(82);
//        t.insert(55);
//        t.insert(63);
//        t.insert(6);
//        t.insert(2);
//        t.insert(40);
//        t.insert(12);
//        int key = 21;
//        TreeNode found = t.Search(key);
//        if (found != null) {
//            JOptionPane.showMessageDialog(null, "Data "+key+" Found in Tree","Message",JOptionPane.PLAIN_MESSAGE,icon2);
//            System.out.println(" Found "+key+" in BST"); 
//        }else{
//          JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.PLAIN_MESSAGE, icon);
//            throw  e;
    }

}
