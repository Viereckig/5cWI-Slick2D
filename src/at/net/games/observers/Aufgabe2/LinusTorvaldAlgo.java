package at.net.games.observers.Aufgabe2;

public class LinusTorvaldAlgo implements Algo{
    private static LinusTorvaldAlgo instance = null;

    private LinusTorvaldAlgo() {
    }

    public static LinusTorvaldAlgo getInstance() {
        if (instance == null) {
            instance = new LinusTorvaldAlgo();
        }
        return instance;
    }


    @Override
    public String encrypt(String text) {
        String encrypted = text + " LinusTorvaldAlgo";
        return encrypted;
    }

    @Override
    public String decrypt(String text) {
        String decrypted = text.replace(" LinusTorvaldAlgo", "");
        return decrypted;
    }
}
