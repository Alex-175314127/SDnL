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
public class Main {
    public static void main(String[] args) {
        String s1 = "(A+B)";
//        String s1= "(A+B)*((B-C)+D)";
//        String s1 = "(A+B*C)^((P+Q)*R)";
char notasi[] = new char[s1.length()];
s1.getChars(0, s1.length(), notasi, 0);

Tree tree = new Tree();
Infix infix = new Infix(notasi);

tree.setRoot(infix.buatPohon());

        System.out.println("\n\nInfix");
        tree.inorderTraversal();
        System.out.println("");
    }
}
