package level2.lesson3.part2;

import java.util.Arrays;
import java.util.Random;

public class CombineArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
        }
        System.out.println("Arr1: " + Arrays.toString(arr1));
        System.out.println("Arr2: " + Arrays.toString(arr2));

        System.out.println("Combined arr: " + Arrays.toString(combine(arr1, arr2)));
    }

    static int[] combine(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++, index++) {
            resultArr[index] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, index++) {
            resultArr[index] = arr2[i];
        }
        return resultArr;
    }
}
