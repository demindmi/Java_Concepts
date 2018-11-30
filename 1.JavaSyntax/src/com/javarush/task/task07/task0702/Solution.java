package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<8;i++){
            array[i] = br.readLine();
        }
        for(int i = 0; i<10;i++){
            System.out.println(array[9-i]);
        }
    }
}
