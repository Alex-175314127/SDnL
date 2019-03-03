/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdnl;

import java.awt.Image;
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ImageIcon icon = new ImageIcon("b.png");
        ImageIcon icon2 = new ImageIcon("1.png");
        Image image = icon.getImage();
        Image image2 = icon2.getImage();
        Image newimg = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        Image newimg2 = image2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon= new ImageIcon(newimg);
        icon2=new ImageIcon(newimg2);
       Exception e = new Exception("Data not Found");
        Tree t = new Tree();
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
        int key = 21;
        TreeNode found = t.Search(key);
        if (found != null) {
            JOptionPane.showMessageDialog(null, "Data "+key+" Found in Tree","Message",JOptionPane.PLAIN_MESSAGE,icon2);
            System.out.println(" Found "+key+" in BST"); 
        }else{
          JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.PLAIN_MESSAGE, icon);
            throw  e;
           
        }
////try {
////          Tree t = new Tree();
////        t.insert(42);
////        t.insert(21);
////        t.insert(38);
////        int vaule = 22;
////        TreeNode found = t.Search(vaule);
////        if (found != null) {
////            JOptionPane.showMessageDialog(null," Found "+vaule+" in BST");
////            System.out.println(" Found "+vaule+" in BST"); 
////        }else{
////            throw new Exception("data not Found");
////        }   
////        } catch (Exception e) {
////            e.getMessage();
////        }
////           
          
        
      
//        System.out.println("cari : "+t.Search(21));
//System.out.println(" cari :"+t.toString(t.Search(21)));
        
    }
    
}
