package com.wml.test.java8;

import org.junit.Test;

import java.util.Arrays;

public class ArrayForeach {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6 ,7, 44, 11};
        Arrays.stream(arr).forEach(System.out::println);
    }

}
