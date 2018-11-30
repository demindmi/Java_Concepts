package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//finds the longest string (or multiple) and displays them
public class Solution {
    private static ArrayList<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        ArrayList<Integer> max_location = new ArrayList<>();
        int temp;
        for(int i = 0; i<5;i++){
            System.out.print("Your string: ");
            strings.add(br.readLine());
            temp = strings.get(i).length();
            if(temp > max) {
                max = temp;
                max_location.clear();
                max_location.add(i);
            }
            else if(temp == max){
                max = temp;
                max_location.add(i);
            }
        }
        for(int i = 0; i<max_location.size(); i++){
            System.out.println(strings.get(max_location.get(i)));
        }

    }
}
