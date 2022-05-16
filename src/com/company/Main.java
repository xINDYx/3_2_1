package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> newList = new ArrayList<>();

        for(Integer item : intList){
            if(item > 0  && item % 2 == 0){
                newList.add(item);
            }
        }

        Collections.sort(newList);

        for(Integer item : newList){
            System.out.println(item);
        }
    }
}
