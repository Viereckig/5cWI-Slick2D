package at.net.games.observers.ownSort;

public class DataGenerator {
    public static int[] generate(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * size);
        }
        return arr;
    }
}
