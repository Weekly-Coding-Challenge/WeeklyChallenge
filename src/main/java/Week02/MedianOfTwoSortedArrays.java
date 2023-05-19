package Activities;

import java.util.Arrays;
//
//
//1) Median of Two Sorted Arrays
//        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//        The overall run time complexity should be O(log (m+n)).
//
//        Example1:
//        Input:nums1 = [1,3], nums2 = [2]
//        Output:2.00000
//        Explanation: merged array = [1,2,3] and median is 2.
//
//        Example2:
//        Input:nums1 = [1,2], nums2 = [3,4]
//        Output:2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//
//        Constraints:
//
//
//        nums1.length == m
//
//        nums2.length == n
//
//        0 <= m <= 1000
//
//        0 <= n <= 1000
//
//        1 <= m + n <= 2000
//
//        -106 <= nums1[i], nums2[i] <= 106

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2};
        int[] arr2 = {3,4};


        // calling the method
        System.out.print("Median = " + medianOfSortedArr(arr1, arr2));

    }

    public static double medianOfSortedArr(int[] arr1, int[] arr2){
        //get the total length of both arrays
        int mergedArrayLength = arr1.length + arr2.length;
        //create a new array total length of the two arrays
        int[] mergedArray = new int[mergedArrayLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[i]){
                mergedArray[k++] = arr1[i++];
            }
            else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < arr1.length){
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length){
            mergedArray[k++] = arr2[j++];
        }
        if (mergedArrayLength % 2 == 0){
            int mid = mergedArrayLength/2;
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        }
        else {
            int mid = mergedArrayLength/2;
            return mergedArray[mid];
        }

    }
}
