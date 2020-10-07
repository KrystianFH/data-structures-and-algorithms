package challenges.utilities;

public class FizzBuzzTree extends Tree {

    public String fizzBuzzTree(Node node) throws Exception {
        Tree plainTree = new Tree();
        Node node1 = new Node("8");
        Tree fBTree = new Tree();
        node1 = root;
        String current = "";
        current = root.getValue();
        if (root != null) {
            if (plainTree.node.current % 3 == 0 && plainTree.node.value % 5 == 0) {
                fBTree.node.value = "FizzBuzz";
            } else if (plainTree.node.value % 5 == 0) {
                fBTree.node.value = "Buzz";
            } else if (plainTree.node.value % 3 == 0) {
                fBTree.node.value = "Fizz";
            }
            fizzBuzzTree(node.getLeftValue());
            fizzBuzzTree(node.getRightValue());
        } else if (root == null) {
            throw new Exception("This tree is empty");
        }
        return fBTree.toString();
    }
}
