package challenges.utilities;

import java.util.ArrayList;


public class Tree {
    //    Step 1. set up the tree, and root
//    Thanks to Paul O'Brien for the help sorting this out
    public Node root;

    public Tree() { //instantiates empty tree
        this.root = null;
    }

    public void makeRoot(Node newRoot) throws Exception {
        if (this.root == null) {
            root = newRoot;
        } else {
            throw new Exception("Already rooted.");
        }
    }

    //    Step 2. Methods to add left nodes in tree
    public void addLeftNode(Node node, String value) throws Exception {
        Node newNode = new Node(value);
        if (node.getLeftValue() == null) {
            node.setLeftValue(newNode);
        } else {
            throw new Exception("seat's taken.");
        }
    }

    public void addLeftNode(Node node, Node newLeftNode) throws Exception {
        if (node.getLeftValue() == null) {
            node.setLeftValue(newLeftNode);
        } else {
            throw new Exception("seat's taken!");
        }
    }

    //    Step 3. Methods to add right nodes in tree
    public void addRightNode(Node node, String value) throws Exception {
        Node newNode = new Node(value);
        if (node != null) {
            node.setRightValue(newNode);
        } else {
            throw new Exception("Right seat's taken");
        }
    }

    public void addRightNode(Node node, Node newRightNode) throws Exception {
        if (node.getRightValue() == null) {
            node.setRightValue(newRightNode);
        } else {
            throw new Exception("Right seat's taken");
        }
    }

    //How will we traverse the tree? preOrder, inOrder, postOrder methods!
    // preOrder walk (traversal)

    public static ArrayList<String> preOrder(Tree tree) {
        ArrayList<String> results = new ArrayList<>();
        preOrderWalk(tree.root, results);
        return results;
    }

    private static void preOrderWalk(Node node, ArrayList<String> arrayList) {
        arrayList.add(node.getValue());
        if (node.getLeftValue() != null) preOrderWalk(node.getLeftValue(), arrayList);
        if (node.getRightValue() != null) preOrderWalk(node.getRightValue(), arrayList);
    }

    //inOrder walk

    public static ArrayList<String> inOrder(Tree tree) {
        ArrayList<String> results = new ArrayList<>();
        inOrderWalk(tree.root, results);
        return results;
    }

    private static void inOrderWalk(Node node, ArrayList<String> arrayList){
        if (node.getLeftValue() != null) inOrderWalk(node.getLeftValue(), arrayList);
        arrayList.add(node.getValue());
        if (node.getRightValue() != null) inOrderWalk(node.getRightValue(), arrayList);
    }

    //postOrder walk

    public static ArrayList<String> postOrder (Tree tree){
        ArrayList<String> results = new ArrayList<>();
        postOrderWalk(tree.root, results);
        return results;
    }

    private static void postOrderWalk(Node node, ArrayList<String> arrayList){
        if (node.getLeftValue() != null) postOrderWalk(node.getLeftValue(), arrayList);
        if (node.getRightValue() != null) postOrderWalk(node.getRightValue(), arrayList);
    }

}
