package com.company;


import java.util.ArrayList;
import java.util.List;

public class PracticeList{

    List<Integer> list = new ArrayList<Integer>(8);

    public void createList(){
        list.add(0,10);
        list.add(1,20);
        list.add(2,30);
    }

    public void addToList(int index, Integer item){
        list.add(index,item);
    }
    public int removeFromList(int index){
         return list.remove(index);
    }

    public void deleteList(){
         list.clear();
    }

    public void displayList(){

        System.out.println("List : "+"\n"+list);
    }

    public void convertToArray(){
        Integer[] arr = new Integer[list.size()];

        arr = list.toArray(arr);
        for(Integer v:arr)
        System.out.println(v+" ");
    }

}
