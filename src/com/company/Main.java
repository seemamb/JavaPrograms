package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static final String HELLO_PROJECT = "Hello Project";

    public static void main(String[] args) {
	// write your code here

        System.out.println(HELLO_PROJECT);

        PracticeString practiceString = new PracticeString();
        //practiceString.swap();
        /*int comp= practiceString.compareStrings("life", "wife");

        System.out.println("Comparing seema and raja: " + comp);*/

        practiceString.useOfRegex();


       /* //Practice Comparable interface

        List<PracticeComparable> list = new ArrayList<PracticeComparable>();

        list.add(new PracticeComparable("First Movie",2.2, 2080));
        list.add(new PracticeComparable("Second Movie",4.3, 2005));
        list.add(new PracticeComparable("Third Movie",4.2, 2010));

        System.out.println("Before sorting");
        for(PracticeComparable p: list)
            System.out.println(p.getName() +" "+p.getRating()+" " +p.getYear());
*/
        //Sorting by comparable
        //Collections.sort(list);
/*

        RatingCompare rating = new RatingCompare();
        Collections.sort(list, rating);
        System.out.println("After sorting by Rating Comparator");
        for(PracticeComparable p: list)
            System.out.println(p.getName() +" "+p.getRating()+" " +p.getYear());

        NameCompare name = new NameCompare();
        Collections.sort(list, name);
        System.out.println("After sorting by Name Comparator");
        for(PracticeComparable p: list)
            System.out.println(p.getName() +" "+p.getRating()+" " +p.getYear());
*/

       /* //HashMap
        PracticeHashMap hm = new PracticeHashMap();
        hm.createMap();
        hm.displayMap();
        hm.searchHashMap();
        hm.retrieveKeyValue();*/
      /*
      //ArrayList
       PracticeList list = new PracticeList();

       list.createList();
       list.addToList(3,40);
       list.removeFromList(0);
       list.displayList();
       list.convertToArray();*/

    }
}
