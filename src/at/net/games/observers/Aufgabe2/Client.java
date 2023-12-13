package at.net.games.observers.Aufgabe2;

public class Client {
    public static void main(String[] args) {
        AlgoFactory algoFactory = new AlgoFactory();
        String text = "Hallo Welt";
        String encrypted = algoFactory.encrypt(text);
        System.out.println("Encrypted Text: " + encrypted);
        String decrypted = algoFactory.decrypt(encrypted);
        System.out.println("Decrypted Text: " + decrypted);
    }
}
