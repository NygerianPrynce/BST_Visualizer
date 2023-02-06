public class BST {
    Node root;
  
    public BST() {
        root = null;
    }
    
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    public Node getCurrentNode(){
        return root;
    }

    public Node insertRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            // value already exists
            return current;
        }
        return current;
    }
    
    public void printInOrder() {
        printInOrderRecursive(root);
    }
    
    public void printInOrderRecursive(Node current) {
        if (current != null) {
            printInOrderRecursive(current.left);
            System.out.print(current.data + " ");
            printInOrderRecursive(current.right);
        }
    }

    
}
