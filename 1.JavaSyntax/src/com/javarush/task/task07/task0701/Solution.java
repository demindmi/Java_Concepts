package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new int[20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<20;i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        return array[19];
    }
}
