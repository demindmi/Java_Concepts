package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int input = 0;
        double sum = 0;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(input != -1){
                System.out.print("Enter a number: ");
                input = Integer.parseInt(br.readLine());
            if(input == -1)
                break;
                sum += input;
                count++;


        }
        System.out.println(sum / count);
    }
}

