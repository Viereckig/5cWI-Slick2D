package at.net.games.ownSort.Algos;

import at.net.games.ownSort.Algo;

public class SelectionSort implements Algo {

    @Override
    public int[] sort(int[] arr) {
        int[] array = arr.clone();
        int n = array.length;

        for (int i = 0; i < array.length; i++){
            int startingPoint = array.length-n;
            int minValueIndex = startingPoint;
            int min = array[startingPoint];
            for (int j = startingPoint; j < n; j++){
                if(array[j] < min){
                    min = array[j];
                    minValueIndex = j;
                }
            }
            int swapValue = array[startingPoint];
            array[startingPoint] = min;
            array[minValueIndex] = swapValue;
            n--;
        }


        return array;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
