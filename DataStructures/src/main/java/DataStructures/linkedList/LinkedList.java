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

    public void insert(int newData){ //head first insertion

        Node newNode= new Node(newData);

        if (this.head == null){

            this.head = newNode;
            this.tail = this.head;

        } else {
            newNode.next = this.head;
            this.head = newNode;
        }

    }

//    public boolean includes (int data) {
//
//        Node newNode = new Node(data);
//
//
//    }

    public void insertBefore(int value, int newValue){
        if (this.head.value == value){
            insert(newValue);
        } else {
            Node current = this.head.next;
            Node previous = this.head;

            while(current.value != value){
                current = current.next;
                previous = previous.next;
            }
            Node newNode = new Node(newValue);
            newNode.next = current;
            previous.next = newNode;
        }
    }



}
