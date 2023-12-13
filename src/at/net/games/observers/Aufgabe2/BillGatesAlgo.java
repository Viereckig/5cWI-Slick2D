package at.net.games.observers.Aufgabe2;

public class BillGatesAlgo implements Algo{
    private static BillGatesAlgo instance = null;

    private BillGatesAlgo() {
    }

    public static BillGatesAlgo getInstance() {
        if (instance == null) {
            instance = new BillGatesAlgo();
        }
        return instance;
    }


    @Override
    public String encrypt(String text) {
        String encrypted = text + " BillGatesAlgo";
        return encrypted;
    }

    @Override
    public String decrypt(String text) {
        String decrypted = text.replace(" BillGatesAlgo", "");

        return decrypted;
    }
}
