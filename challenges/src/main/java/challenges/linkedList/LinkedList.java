package challenges.linkedList;

public class LinkedList {
    public boolean someLibraryMethod() {
        return true;
    }

    public Node head;
    public Node current;

    public LinkedList(){}

    public void addToFront(int newValue){ //head first insertion

        Node newNode= new Node(newValue);
        newNode.next = head;
        head = newNode;

    }


    public boolean includes (int value) {
        current = head;

        while(current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
    return false;
    }

    private static String toString(Node current){
        if(current == null){
            return null;
        }
        return String.format("{%d} -> %s", current.value, toString(current.next));
    }


    public String toString() {
        return toString(this.head);
    }

    public static void main(String [] args) throws Exception {
        LinkedList newList = new LinkedList();
        newList.addToFront(1);
        newList.addToFront(4);
        newList.addToFront(6);
        newList.addToFront(8);
        newList.addToFront(15);
        newList.addToFront(21);

        LinkedList secondList = new LinkedList();
        LinkedList firstList = new LinkedList();

        firstList.addToFront(2);
        firstList.addToFront(4);
        firstList.addToFront(6);
        firstList.addToFront(8);

        secondList.addToFront(3);
        secondList.addToFront(6);
        secondList.addToFront(9);
        secondList.addToFront(12);
        secondList.addToFront(15);


        newList.nthFromEnd(2);
        System.out.println(newList.nthFromEnd(2));

        System.out.println(firstList);
        System.out.println(secondList);
    }



//    public void insertBefore(int value, int newValue){
//        if (this.head.value == value){
//            insert(newValue);
//        } else {
//            Node current = this.head.next;
//            Node previous = this.head;
//
//            while(current.value != value){
//                current = current.next;
//                previous = previous.next;
//            }
//            Node newNode = new Node(newValue);
//            newNode.next = current;
//            previous.next = newNode;
//        }
//    }
    // kth from end
    // write a method for the ll class which takes a number, k as a parameter
    // return nodes value that is k from the end of the ll

    public int nthFromEnd (int n) throws Exception{

        Node p1 = head;
        Node p2 = head;

        if(n > 5){
            throw new Exception("out of bounds");
        }

        for (int j=0; j < n; j++){
            if (p2 == null){
                throw new Exception("Exception");
            }
            p2 = p2.next;
        }

        while (p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1.value;
    }

    public static LinkedList ziplists(LinkedList one , LinkedList two){
        LinkedList mergedList = new LinkedList();
        if (one == null){
            return two;
        } else if (two == null){
            return one;
        }
        Node current1 = one.head;
        Node current2 = two.head;
        Node tempVar = current1;
        Node tempVar2 = current2;

        while (current1 != null) {
            current1 = current2;
            current2 = current1.next;
            current1.next = current2.next;
        }
        return mergedList;
//        LinkedList mergedList = new LinkedList();
    }





}


