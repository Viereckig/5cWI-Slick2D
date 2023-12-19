package at.net.games.ownSort;

import at.net.games.ownSort.Algos.BubbleSort;
import at.net.games.ownSort.Algos.InsertionSort;
import at.net.games.ownSort.Algos.SelectionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Algo> algos;
    private static Scanner sc;

    private static void initAlgos() {
        algos = new ArrayList<Algo>();
        sc = new Scanner(System.in);


        algos.add(new InsertionSort());
        algos.add(new SelectionSort());
        algos.add(new BubbleSort());
    }

    private static void allAlgosAtSameTime(int[] arr){
        for (Algo algo: algos) {

            long startTime = System.currentTimeMillis();

            int[] sorted = algo.sort(arr);

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println(algo.getName() + ": " + elapsedTime + "ms");
        }
    }


    public static void main(String args[]) {
        initAlgos();

        int[] arr;

        System.out.println("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        arr = DataGenerator.generate(arraySize);

        System.out.println("Choose one of these sorting algorithms: ");
        for (int i = 0; i < algos.size(); i++) {
            System.out.println((i + 1) + ". " + algos.get(i).getName());
        }
        System.out.println((algos.size() + 1) + ". Show every Algo");

        int sortAlgorithm = sc.nextInt();

        if(sortAlgorithm == algos.size() + 1){
            allAlgosAtSameTime(arr);
            return;
        }

        System.out.println("You chose: " + algos.get(sortAlgorithm - 1).getName());



        long startTime = System.currentTimeMillis();

        arr = algos.get(sortAlgorithm - 1).sort(arr);

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println("\nTime taken for sorting: " + elapsedTime + " milliseconds");
    }
}
