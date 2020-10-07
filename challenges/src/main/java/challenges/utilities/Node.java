package challenges.utilities;

public class Node {

    private String value;
    private Node left;
    private Node right;

    public Node(String value){
        this.value = value;
        left = null;
        right = null;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public Node getLeftValue(){return left;}

    public void setLeftValue(Node left){
        this.left = left;
    }

    public Node getRightValue(){return right;}

    public void setRightValue(Node right){
        this.right = right;
    }

    @Override
    public String toString(){
        return "Value is: " + value;
    }

}
