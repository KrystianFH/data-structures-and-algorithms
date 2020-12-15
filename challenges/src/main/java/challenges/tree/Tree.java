package DataStructures.tree;

//import com.sun.source.tree.BinaryTree;
//import com.sun.source.tree.EmptyStatementTree;
//import com.sun.source.tree.ExpressionTree;
//import com.sun.source.tree.TreeVisitor;

public class Tree {

    Node root;

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
    public void add(int value){ //
        root = addRecursive(root, value);
    }


    // manually create tree
    private Tree createBinaryTree(){
       Tree binaryTree = new Tree();
        Node current = new Node(95);

       binaryTree.add(87);
       binaryTree.add(54);
       binaryTree.add(45);
       binaryTree.add(32);
       binaryTree.add(11);
       binaryTree.add(6);


       return binaryTree;
    }

    @Override
    public String toString() {
        return "Tree{" + "root=" + root + '}';
    }

    public Tree() {
//        this.root = root;
    }


    public void preOrder (Node node){
        if(node != null){
            System.out.println("" + node.value);
            preOrder(node.left);
            preOrder(node.right);
        } else {
            throw new NullPointerException("This tree is empty");
        }
    }

    public void inOrder (Node node){
        if (node != null){
            inOrder(node.left);
            System.out.println("" + node.value);
            inOrder(node.right);
        } else {
            throw new NullPointerException("This tree is empty");
        }
    }

    public void postOrder (Node node){
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println("" + node.value);
        } else {
            throw new NullPointerException("This tree is empty");
        }
    }


}
