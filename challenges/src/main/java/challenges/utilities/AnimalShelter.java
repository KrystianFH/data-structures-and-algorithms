package challenges.utilities;

import java.util.EmptyStackException;
import java.util.Stack;

public class AnimalShelter  {

    public boolean someLibraryMethod() {
        return true;
    }

    public class Node <T> {
        T value;
        Node<T> next;

        Node (T value){
            this.value = value;
        }

    }

    public Node<Animal> top;
    public Node<Animal> tail;

    public void enQ (Animal animal){

        Node<Animal> newNode = new Node<Animal>(animal);

        if(top == null) {
            top = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }


    }

    public Animal pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        Animal tempVar = top.value;
        top = top.next;

        if (top == null) {
            tail = null;
        }
            return tempVar;
        }


    public String toString(){
        return toString(this.top);
    }

    public String toString(Node current){
        if(current == null){
            return "null";
        }
        return String.format("{%s} -> %s", current.getClass().getSimpleName(), toString(current.next));
    }

}
