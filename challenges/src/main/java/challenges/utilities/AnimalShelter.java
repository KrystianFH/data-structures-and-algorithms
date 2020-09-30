package challenges.utilities;

import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class AnimalShelter  {

    public boolean someLibraryMethod() {
        return true;
    }

    // code review 9/30
//    LinkedList<Animal> animals = new LinkedList<>();
//    LinkedList<Dog> dogs = new LinkedList<>();
//    LinkedList<Cat> cats = new LinkedList<>();
//    HashSet<Animal> adoptedAnimals = new HashSet<>();
//
//    public void enQueue(Cat cat){
//        animals.add(cat);
//        cats.add(cat);
//    }
//
//    public void enQueue(Dog dog){
//        animals.add(dog);
//        dogs.add(dog);
//    }
//
//    public Animal deQueue(){
//        return animals.removeFirst();
//    }
//
//    public Animal deQueue(Class<?> cl) throws ClassNotFoundException {
//        if(cl == Cat.class){
//            Cat adoptee = cats.removeFirst();
//            adoptedAnimals.add(adoptee);
//            return adoptee;
//        } else if (cl == Dog.class){
//            Dog adoptee = dogs.removeFirst();
//            adoptedAnimals.add(adoptee);
//            return adoptee;
//        } else {
//            throw new ClassNotFoundException("We only have Cats and Dogs");
////            return null;
//        }
//    }





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
