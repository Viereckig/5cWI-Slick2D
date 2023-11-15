package at.net.games.observers.Aufgabe1;

public class Heizregler implements TempObserver{
    private int temp;

    public Heizregler(int temp){
        this.temp = temp;
    }

    public void changeTemp(int temp){
        this.temp = temp;
    }

    @Override
    public void update(float temp) {

    }
}
