package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        int[] array_s1= new int[10];
        int[] array_s2= new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i++){
            array[i]= Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 10; i++){
            array_s1[i] = array[i];
        }
        for(int i = 0; i < 10; i++){
            array_s2[i] = array[i+10];
        }
        for(int i = 0; i < 10; i++){
            System.out.println(array_s2[i]);
        }
    }
}
