package at.net.games.observers.Aufgabe2;

public class SteveJobsAlgo implements Algo{
    private static SteveJobsAlgo instance = null;


    private SteveJobsAlgo() {
    }

    public static SteveJobsAlgo getInstance() {
        if (instance == null) {
            instance = new SteveJobsAlgo();
        }
        return instance;
    }

    @Override
    public String encrypt(String text) {
        String encrypted = text + " SteveJobsAlgo";
        return encrypted;
    }

    @Override
    public String decrypt(String text) {
        String decrypted = text.replace(" SteveJobsAlgo", "");
        return decrypted;
    }
}
