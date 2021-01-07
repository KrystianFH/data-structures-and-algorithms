package challenges.utilities;

public class AnimalShelter  {

    public Node front;
    public Node back;

    public void enqueue(Animal animal){
        if(front == null){
            front = new Node(animal);
        } else if (front.next == null){
            back = new Node(animal);
            front.next = back;
        } else {
            back.next = new Node(animal);
            back = back.next;
        }
    }

    public Animal deQueue(String pref){
        if (!pref.equals("dog") && !pref.equals("cat")) return null;
        if (front == null) return null;
        if (front.value.type.equals(pref)){
            Node temp = front;
            front = front.next;
            return temp.value;
        }
        return recursiveSearch(front.next, front, pref);
    }

    private Animal recursiveSearch(Node node, Node previousNode, String pref){
        if (node == null) return null;
        if (node.value.type.equals(pref)){
            previousNode.next = node.next;
            return node.value;
        }
        return recursiveSearch(node.next, node, pref);
    }

    @Override
    public String toString(){
        return toString(front);
    }

    private String toString(Node node){
        if(node == null) return "NULL";
        return String.format("{%s} -> %s", node.value.toString(), toString(node.next));
    }

    private static class Node {
        Animal value;
        Node next = null;

        public Node(Animal value){
            this.value = value;
        }
    }
}
