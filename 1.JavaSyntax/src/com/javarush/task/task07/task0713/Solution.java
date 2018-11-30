package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> Main = new ArrayList<>();
        ArrayList<Integer> Dev3 = new ArrayList<>();
        ArrayList<Integer> Dev2 = new ArrayList<>();
        ArrayList<Integer> Others = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<20;i++){
            int num = Integer.parseInt(br.readLine());
            Main.add(num);
        }
        for(int i = 0; i<Main.size(); i++){
            if(Main.get(i)%3 != 0 && Main.get(i)%2 != 0){
                Others.add(Main.get(i));
            }
            else{
                if(Main.get(i)%3 == 0){
                    Dev3.add(Main.get(i));
                }
                if(Main.get(i)%2 == 0){
                    Dev2.add(Main.get(i));
                }
            }
        }
        // printList(Main);
        printList(Dev3);
        printList(Dev2);
        printList(Others);
    }

    public static void printList(List<Integer> list) {
        for(Integer x: list) System.out.println(x);
    }
}
