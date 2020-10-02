package DataStructures.tree;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;

public class Tree {

    Node root;

    // manually create tree
    private BinaryTree createBinaryTree(){
        BinaryTree binaryTree = new BinaryTree(){
            @Override
            public ExpressionTree getLeftOperand() {
                return null;
            }

            @Override
            public ExpressionTree getRightOperand() {
                return null;
            }

            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }

        };
        return binaryTree;
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
