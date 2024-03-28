package day19_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int [] arr = new int[4]; //

        System.out.println(arr[2]);

        arr[1] = 5;

        System.out.println(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");

        }


    }
}
