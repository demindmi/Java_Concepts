package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5;i++){
            list.add(br.readLine()); //adding at the end of the list
        }
        String temp;
        for(int i = 0; i<13;i++){ //random number of times (13 in this case)
            temp = list.get(list.size()-1); //get last item
            list.remove(list.size()-1); //remove last item
            list.add(0, temp); //append last item in the begining
        }
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
