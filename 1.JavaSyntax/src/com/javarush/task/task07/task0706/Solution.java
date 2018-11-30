package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[15];
        int odd=0, even =0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(br.readLine());
            if(i%2==0) odd+=array[i];
            else even +=array[i];
        }
        String toDisplay = odd > even ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(toDisplay);
    }
}
