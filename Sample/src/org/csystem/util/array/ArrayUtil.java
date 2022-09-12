package org.csystem.util.array;
import java.util.Random;

public class ArrayUtil {

    public static void fillRandomArray (Random r, int [] a, int min, int max)
    {
        for (int i = 0; i < a.length; ++i) {
            a[i] = r.nextInt(min, max + 1);
        }
    }

    public static int [] getRandomArray(Random r, int count, int min, int max) //[min, max]
    {
        int [] a = new int[count];

        fillRandomArray(r, a, min, max);

        return a;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; ++i) {
            if(arr[i] > max)
                max = arr[i];
        }
        return  max;
    }
    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int val : a)
            System.out.printf(fmt, val);

        System.out.println();
    }

    public static void print(int [] a)
    {
        print(1, a);
    }

    public static void print(String [] s)
    {
        for (String str : s)
            System.out.println(str);
    }

    public static void print(int [][] a)
    {
        print(1, a);
    }

    public static void print(int n,  int [][] a)
    {
        for (int [] array : a)
            print(n, array);
    }

    public static int[] getDigits (long val) {

        int [] array = new int[getDigitCount(val)];
        for ( int i = getDigitCount(val) - 1; i >= 0; --i) {
            array[i] = (int)(val % 10);
            val /= 10;
        }
        return  array;
    }

    public static int getDigitCount(long val)
    {
        int count = 1;
        while ( val / 10 != 0) {
            val /= 10;
            ++count;
        }
        return  count;
    }
    public static int[] join(int[] arr1, int[] arr2)
    {
        int [] arrJoin = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; ++i) {
            arrJoin[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr1.length + arr2.length; ++i) {
            arrJoin[i] = arr2[i - arr1.length];
        }
        return arrJoin;
    }

    public static void swap(int[] arr, int i, int k)
    {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }

    private static int[] bubleSortAscending(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++) {
            for(int k = 0; k < a.length - i -1 ; ++k)
                if(a[k] > a[k + 1])
                    swap(a, k, k + 1);
        }

        return a;
    }
    private static int[] bubleSortDescending(int[] a)
    {
        for(int i = 0; i < a.length - 1; i++) {
            for(int k = 0; k < a.length - i - 1; ++k)
                if(a[k] < a[k + 1])
                    swap(a, k, k + 1);
        }

        return a;
    }
    public static int[] bubleSort(int[] arr, boolean Descending)
    {
        if (Descending == false)
            return bubleSortAscending(arr);

        return bubleSortDescending(arr);

    }
    public static int[] bubleSort(int[] arr)
    {
        return  bubleSort(arr, false);
    }




    private static int[] selectionSortDescending(int[] arr)
    {   int max;
        int maxIndex;
        for(int i = 0; i < arr.length; ++i) {
            max = arr[i];
            maxIndex = i;
            for(int k = i + 1; k < arr.length; ++k) {
                if(arr[k] > max) {
                    max = arr[k];
                    maxIndex = k;
                }

            }
            swap(arr, i, maxIndex);
        }
        return arr;
    }

    private static int[] selectionSortAscending(int[] arr)
    {
        int min;
        int minIndex;
        for(int i = 0; i < arr.length; ++i) {
            min = arr[i];
            minIndex = i;
            for(int k = i + 1; k < arr.length; ++k) {
                if(arr[k] < min) {
                    min = arr[k];
                    minIndex = k;
                }

            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr, boolean descending)
    {
        if(descending == true)
            return selectionSortDescending(arr);
        return selectionSortAscending(arr);

    }

    public static int partition(int [] arr, int threshold)
    {
        int partitionIndex = 0;
        while (partitionIndex != arr.length && arr[partitionIndex] < threshold){
            ++partitionIndex;
        }

        if(partitionIndex == arr.length)
            return  partitionIndex;

        for(int i = partitionIndex + 1; i < arr.length; ++i) {
            if(arr[i] < threshold)
                swap(arr, partitionIndex++, i);
        }
        return partitionIndex;
    }

    public static int[] getHistogramData(int[] arr, int n) {
        int[] histogramArr = new int[n+1];
        for(int i = 0; i < arr.length; ++i){
            ++histogramArr[arr[i]];
        }
        return histogramArr;
    }
    public static int[] getHistogramData(int[] arr) {
        return getHistogramData(arr,findMax(arr) );
    }

}
