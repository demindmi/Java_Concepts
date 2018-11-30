package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        while(true) {
            number = Integer.parseInt(reader.readLine());
            if(number > 0)
                break;
        }
        int[] numbers = new int[number];
        for(int i = 0; i < number; i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(numbers);
        System.out.println(numbers[number-1]);
    }
}
