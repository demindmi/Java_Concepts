package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> List = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5;i++){
           List.add(br.readLine());
        }
        //testing delete function
        List.remove(2);
        //print in opposite order
        for(int i = List.size()-1; i>=0;i--){
            System.out.println(List.get(i));
        }
    }
}


