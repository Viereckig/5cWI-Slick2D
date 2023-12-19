package at.net.games.test.Übung1;

public class Dog implements Animal{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    @Override
    public String getName() {
        return name;
    }
}
