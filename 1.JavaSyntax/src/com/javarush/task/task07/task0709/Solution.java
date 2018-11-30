package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//finds the shortest string (or multiple) and displays them
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>strings = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 100000;
        ArrayList<Integer> min_location = new ArrayList<>();
        int temp;
        for(int i = 0; i<5;i++){
            //System.out.print("Your string: ");
            strings.add(br.readLine());
            temp = strings.get(i).length();
            if(temp < min) {
                min = temp;
                min_location.clear();
                min_location.add(i);
            }
            else if(temp == min){
                min = temp;
                min_location.add(i);
            }
        }
        for(int i = 0; i<min_location.size(); i++){
            System.out.println(strings.get(min_location.get(i)));
        }

    }
}
