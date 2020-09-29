package challenges.utilities;

import java.util.Stack;

public class App {

    public static void main(String[] args){


        Animal gus = new Dog();
        Animal ashton = new Dog();
        Animal avery = new Cat();

        AnimalShelter shelter = new AnimalShelter();



        shelter.enQ(gus);
        shelter.enQ(ashton);
        shelter.enQ(avery);
        System.out.println(shelter.getClass());

    }
}
