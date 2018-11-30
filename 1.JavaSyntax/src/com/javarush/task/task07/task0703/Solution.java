package com.javarush.task.task07.task0703;

import javax.security.sasl.SaslServer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] strings = new String[10];
        int[] num = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < strings.length; i++){
            strings[i] = br.readLine();
            num[i]=strings[i].length();
            System.out.println(num[i]);
        }
    }
}
