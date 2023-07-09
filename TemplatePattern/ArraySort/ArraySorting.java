package DesignPattern.TemplatePattern.ArraySort;

import java.util.Comparator;

public class ArraySorting {
    
    public static <T extends Comparable<T>> void sort(T[] array, Comparator<? super T> comparator) {
        
        if(array == null || array.length < 2)
            return;
        
        insertionSort(array,0,array.length-1,comparator);
    }

    private static <T> void insertionSort(T[] array, int left, int right, Comparator<? super T> comparator) {
        for (int i = left + 1; i <= right; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= left && comparator.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
