package com.company;

import java.util.Comparator;

public class NameCompare implements Comparator<PracticeComparable> {
    @Override
    public int compare(PracticeComparable o1, PracticeComparable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
