package at.net.games.observers.ownSort.Algos;

import at.net.games.observers.ownSort.Algo;

public class BubbleSort implements Algo {
    @Override
    public int[] sort(int[] arr) {
        int[] array = arr.clone();
        int n = array.length;
        Boolean hasChanged = true;
        while (hasChanged){
            hasChanged = false;
            for (int i = 0; i < n-1; ++i) {

                int number1 = array[i];
                int number2 = array[i+1];

                if(number1>number2){
                    array[i] = number2;
                    array[i+1] = number1;
                    hasChanged = true;
                }
            }
        }



        return array;
    }

    @Override
    public String getName() {
        return "BubbleSort";
    }
}
