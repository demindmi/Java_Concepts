package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        while(true){
            if(input>0) {
                if (input % 2 == 0)
                    even++;
                else
                    odd++;
                input = input / 10;
            }
            else
                break;
        }
        System.out.print("Even: " + even);
        System.out.println(" Odd: " + odd);
    }
}
