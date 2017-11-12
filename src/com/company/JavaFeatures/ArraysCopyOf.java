package com.company.JavaFeatures;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        int index = 2;
        int[] nums=  {0, 1, 2, 3, 4};
        int[] firstHalf = Arrays.copyOfRange(nums, 0, index);
        int[] secondHalf = Arrays.copyOfRange(nums, index+1, nums.length);
        int x =3;
    }
}
