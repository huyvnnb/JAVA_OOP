
class Node {
    int data;
    Node left;
    Node right;


    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class BinarySearchTree {
    final int size;
    Node root;
    BinarySearchTree(){
        size = 0;
        root = null;
    }

    private Node insertRecursive(Node current, int value){
        //Wasting memory
        //Node temp = new Node(value);
        if(current == null){
            return new Node(value);
        }
        else if(current.data > value){
            current.left = insertRecursive(current.left, value);
        }
        else if (current.data < value) {
            current.right = insertRecursive(current.right, value);
        }
        else{
            return current;
        }
        return current;
    }
    public void add(int value) {
        root = insertRecursive(root, value);
    }

    private void printRecursive(Node curr){
        //Node temp = root;
        if(curr == null){
            System.out.print("-1 ");
            return;
        }
        System.out.print(curr.data + " ");
        printRecursive(curr.left);
        printRecursive(curr.right);
    }

    private int findSmallestRight(Node curr){
        if(curr.left == null){
            return curr.data;
        }
        return findSmallestRight(curr.left);
    }
    private Node removeRecursive(Node curr, int value){
        if(curr == null) return null;
        else if(value < curr.data){
            curr.left = removeRecursive(curr.left, value);
        }
        else if(value > curr.data){
            curr.right = removeRecursive(curr.right, value);
        }
        else{
            if(curr.left == null && curr.right == null){
                return null;
            }
            else if(curr.left == null){
                return curr.right;
            }
            else if(curr.right == null){
                return curr.left;
            }
            else{
                int smallest = findSmallestRight(curr.right);
                curr.data = smallest;
                curr.right = removeRecursive(curr.right, smallest);
            }
        }
        return curr;
    }
    public void print(){
        printRecursive(this.root);
        System.out.println();

    }
    public void remove(int value){

        root = removeRecursive(this.root, value);
    }
    private int heightRecursive(Node n){
        return n==null ? -1 : (1+Math.max(heightRecursive(n.left), heightRecursive(n.right)));
    }
    public int height(){
        return heightRecursive(root);
    }
}



public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        int[] arr = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int value : arr) {
            bst.add(value);
        }
        bst.print();
        bst.remove(8);
        bst.print();
        System.out.println(bst.height());
    }
}