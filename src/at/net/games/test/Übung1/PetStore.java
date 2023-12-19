package at.net.games.test.Übung1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PetStore {
    private static ArrayList<Animal> animals;
    private static Person owner;

    public static void main(String[] args) {
        animals = new ArrayList<Animal>();
        owner = Person.getInstance("Max", "Mustermann");

        animals.add(new Dog("Bello"));
        animals.add(new Cat("Minka"));

        printAllAnimalNames();
        owner.printName();
    }

    public static void printAllAnimalNames() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }



}
