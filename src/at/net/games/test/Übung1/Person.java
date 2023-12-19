package at.net.games.test.Übung1;

import at.net.games.observers.Aufgabe2.BillGatesAlgo;

public class Person {
    private static Person instance = null;
    private String firstName;
    private String lastName;

    public static Person getInstance(String firstName, String lastName) {
        if (instance == null) {
            instance = new Person();
            instance.firstName = firstName;
            instance.lastName = lastName;
        }
        return instance;
    }

    public void printName() {
        System.out.println(firstName + " " + lastName);
    }
}
