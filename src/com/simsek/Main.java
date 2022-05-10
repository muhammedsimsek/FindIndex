package com.simsek;

import java.util.Arrays;
import java.util.List;

public class Main {

    static int findLowIndex(List<Integer> arr, int key, int start, int end) {
        int mid = (end + start) / 2;

        if (key == arr.get(mid)) {
            return mid;
        } else if (arr.get(mid) > key) {
            return findLowIndex(arr, key, start, mid);
        } else if (arr.get(mid) < key) {
            return findLowIndex(arr, key, mid, end);
        }
        return -1;
    }

    static int findLowIndex(List<Integer> arr, int key ) {
        int ret = findLowIndex(arr,key,0, arr.size()-1);
        return  ret;
    }

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(1, 3, 4, 5, 6,7,9,10);
        int key = 9;
        int low = findLowIndex(array, key);
        System.out.println("Low Index of " + key + ": " + low);
    }
}
