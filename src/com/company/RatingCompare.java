package com.company;

import java.util.Comparator;

public class RatingCompare implements Comparator<PracticeComparable> {
    @Override
    public int compare(PracticeComparable o1, PracticeComparable o2) {
        if(o1.getRating() > o2.getRating())
            return 1;
        else if(o1.getRating() < o2.getRating())
            return -1;
        else return 0;
    }
}
