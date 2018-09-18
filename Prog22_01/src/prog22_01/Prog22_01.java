/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog22_01;

/**
 *
 * @author rishabh
 */
public class Prog22_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree() ; 
        b1.add(25);
        b1.add(10);
        b1.add(37) ; 
        b1.add(6) ; 
        b1.add(15);
        b1.add(9) ;
        b1.add(11) ;
        b1.add(17);
        b1.add(29) ; 
        b1.add(27) ; 
        b1.add(42);
        System.out.println("Inorder:") ; 
        b1.display();
          System.out.println("Preorder:") ; 
        b1.display1();
          System.out.println("Postorder:") ; 
        b1.display2() ; 
        System.out.println(b1.contains(25));
        System.out.println(b1.getMin()) ; 
        System.out.println(b1.isEmpty());
        System.out.println("The height is: " + b1.getHeight());
        System.out.println("The count is: " + b1.getCount());
    }
    
}
