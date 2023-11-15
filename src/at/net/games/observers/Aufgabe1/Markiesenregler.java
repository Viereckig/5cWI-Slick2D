package at.net.games.observers.Aufgabe1;

public class Markiesenregler implements TempObserver{
    private Boolean open;

    public Markiesenregler(Boolean open){
        this.open = open;
    }

    public void open(){
        if (!open){
            this.open = true;
        }else {
            System.out.println("Ist bereits offen");
        }
    }

    public void close(){
        if (open){
            this.open = false;
        }else {
            System.out.println("Ist bereits geschlossen");
        }
    }

    @Override
    public void update(float temp) {
        if (temp > 25){
            close();
        }else if (temp < 20){
            open();
        }
    }
}
