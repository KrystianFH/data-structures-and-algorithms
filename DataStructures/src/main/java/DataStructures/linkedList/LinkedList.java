package DataStructures.linkedList;

public class LinkedList {
    public boolean someLibraryMethod() {
        return true;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data){

        Node newNode= new Node(data);

        if (head == null){

            head = newNode;
            tail = newNode;

        } else {
            head.next = newNode;
            head = newNode;
        }

    }

//    public boolean includes (int data) {
//
//        Node newNode = new Node(data);
//
//
//    }




}
