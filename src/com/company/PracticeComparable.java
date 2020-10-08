package com.company;

public class PracticeComparable implements Comparable<PracticeComparable>{

    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(PracticeComparable o) {

        return this.year - o.year;
    }



    public PracticeComparable(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }


    public String getName() {
        return name;
    }

    public int getYear(){

        return year;
    }


    public double getRating() {
        return rating;
    }

    public void displayComparable(){

        System.out.println(this.getName() +" "+this.getRating()+" " +this.getYear());
    }
}
