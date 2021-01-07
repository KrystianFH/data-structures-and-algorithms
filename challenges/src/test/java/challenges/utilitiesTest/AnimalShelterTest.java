package challenges.utilitiesTest;


import challenges.utilities.AnimalShelter;
import challenges.utilities.Cat;
import challenges.utilities.Dog;
import org.junit.Test;
import static org.junit.Assert.*;


public class AnimalShelterTest {
    @Test public void newAnimalShelterTest(){
        AnimalShelter animalShelter = new AnimalShelter();

        assertNotNull("new shelter should exist", animalShelter);
        assertNull("shelter should be empty", animalShelter.front);
        assertNull("shelter should be empty", animalShelter.back);
    }

    @Test public void enQTest(){
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.enqueue(new Dog("Ashton"));
        assertEquals("Ashton should be set to the front", "{Ashton dog} -> NULL", animalShelter.toString());

        animalShelter.enqueue(new Cat("Avery"));
        assertEquals("Avery should be set to the back", "{Ashton dog} -> {Avery cat} -> NULL", animalShelter.toString());

        animalShelter.enqueue(new Dog("Augustus"));
        assertEquals("Augustus should now be set to the back", "{Ashton dog} -> {Avery cat} -> {Augustus dog} -> NULL", animalShelter.toString());
    }

    @Test public void deQTest(){
        AnimalShelter animalShelter = new AnimalShelter();
        assertNull("cannot dequeue from empty shelter", animalShelter.deQueue("dog"));

        Dog ashton = new Dog("Ashton");
        animalShelter.enqueue(ashton);
        assertNull("cannot dequeue cat from shelter with only dogs", animalShelter.deQueue("cat"));
        assertEquals("should return Ashton", ashton, animalShelter.deQueue("dog"));
        assertEquals("shelter should not have any pets", "NULL", animalShelter.toString());

        animalShelter.enqueue(ashton);
        Cat avery = new Cat("Avery");
        Dog augustus = new Dog("Augustus");
        animalShelter.enqueue(avery);
        animalShelter.enqueue(augustus);

        assertEquals("shelter should have three pets", "{Ashton dog} -> {Avery cat} -> {Augustus dog} -> NULL", animalShelter.toString());
        assertEquals("should return Avery", avery, animalShelter.deQueue("cat"));
        assertEquals("shelter should not have any cats", "{Ashton dog} -> {Augustus dog} -> NULL", animalShelter.toString());

        AnimalShelter animalShelter2 = new AnimalShelter();
        animalShelter2.enqueue(ashton);
        animalShelter2.enqueue(avery);
        animalShelter2.enqueue(augustus);

        assertNull("can only return a cat or a dog", animalShelter.deQueue("panda"));
        assertEquals("should return first dog", ashton, animalShelter2.deQueue("dog"));
        assertEquals("new front should be Avery", "{Avery cat} -> {Augustus dog} -> NULL", animalShelter2.toString());
    }
}
