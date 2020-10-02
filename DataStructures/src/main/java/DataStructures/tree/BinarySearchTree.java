package DataStructures.tree;

public class BinarySearchTree extends Tree {
    // recursive method to do insertion
    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = addRecursive(current.left, value);
        } else if(value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    // public method that starts recursion from root node
    public void add(int value){
        root = addRecursive(root, value);
    }

    // recursive method to search for a value
    private boolean containsRecursive(Node current, int value){
        if(current == null){
            return false;
        }
        if (value == current.value){
            return true;
        }
        return value < current.value
                ? containsRecursive(current.left, value)
                : containsRecursive(current.right, value);
    }

    // public methods that starts recursion from root
    public boolean contains(int value){
        return containsRecursive(root, value);
    }

}
