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
public class BinarySearchTree {
    private int count ; 
    public BinarySearchTree() {
        root = new Node();        //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(-1);
    }

    public boolean isEmpty() {
        return root.getLeftChild() == null;
    }

    public void display() {
        inorderDisplay(root.getLeftChild());
        System.out.println();
    }

    public boolean contains(int x) {
        return search(x, root.getLeftChild());
    }
    
    private boolean search(int x, Node p) {
        if (p == null) {
            return false;
        } else if (x == p.getInfo()) {
            return true;
        } else if (x < p.getInfo()) {
            return search(x, p.getLeftChild());
        } else {
            return search(x, p.getRightChild());
        }
    }


    public void add(int x) {
        if (root.getLeftChild() == null) {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else {
            insert(x, root.getLeftChild());
          
        }
        count++ ; 
    }
     private void insert(int x, Node p) {
        if (x < p.getInfo()) {
            if (p.getLeftChild() == null) {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else {
                insert(x, p.getLeftChild());
            }
        } else if (p.getRightChild() == null) {
            Node q = new Node();
            q.setNode(x, null, null);
            p.setRightChild(q);
        } else {
            insert(x, p.getRightChild());
        }
    }

    public int getMin() {
        return getMin(root);
    }

    private Node root;    //root of the bst; implemented as a dummy node.

    private int getMin(Node p) {
        if (p.getLeftChild() == null) {
            return p.getInfo();
        } else {
            return getMin(p.getLeftChild());
        }
    }
    private void inorderDisplay(Node p) {
        if (p != null) {
            inorderDisplay(p.getLeftChild());
            System.out.print(p.getInfo() + " ");
            inorderDisplay(p.getRightChild());
        }
    }
    private void preorderDisplay(Node p) {
        if (p != null) {
            System.out.print(p.getInfo() + " ");
            preorderDisplay(p.getLeftChild());
            preorderDisplay(p.getRightChild());
        }
    }

    private void postorderDisplay(Node p) {
        if (p != null) {
            postorderDisplay(p.getLeftChild());
            postorderDisplay(p.getRightChild());
            System.out.print(p.getInfo() + " ");
        }
    }

    public void display1() {
        preorderDisplay(root.getLeftChild());
        System.out.println();
    }

    public void display2() {
        postorderDisplay(root.getLeftChild());
        System.out.println();
    }
    private int getHeight(Node p){  
        if(p==null)
            return 0 ; 
        else
     return 1 + Math.max(getHeight(p.getLeftChild()), getHeight(p.getRightChild())) ; 
      
    }
    public int getHeight(){
        return getHeight(root.getLeftChild()) ; 
    }
   public int getCount(){
       if(isEmpty())
           return 0 ; 
       else
           
           return count ; 
   }
}
