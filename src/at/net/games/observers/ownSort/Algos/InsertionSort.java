package at.net.games.observers.ownSort.Algos;

import at.net.games.observers.ownSort.Algo;

import java.util.ArrayList;

public class InsertionSort implements Algo {
    public int[] sort(int[] arr){
        int[] array = arr.clone();
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public String getName() {
        return "InsertionSort";
    }
}
