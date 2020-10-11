package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeString {

    public void swap(){
        String first = "Hello";
        String second = "World";

        System.out.println("Before swap: First = "+first+" Second = "+second);
        first = first + second;

        second = first.substring(0, first.length() - second.length());
        first = first.substring(second.length());

        System.out.println("After swap: First = "+first+" Second = "+second);
    }

    public int compareStrings(String s1, String s2){

        int s1length = s1.length();
        int s2length = s2.length();

        if( s1length != s2length)
            return s1length - s2length;

        int min_len = Math.min(s1length, s2length);

        for(int i = 0; i< min_len; i++){

            int c1 = (int)s1.charAt(i);
            int c2 = (int)s2.charAt(i);

            if( c1 != c2)
                return c1 - c2;
        }



        return 0;
    }

    public void useOfRegex(){

        String textToSearch = "Text67 testing branch";
        String regex = "[a-zA-Z0-9]+";
        Pattern p = Pattern.compile(regex);



        if(!textToSearch.isEmpty()){
            Matcher m = p.matcher(textToSearch);
            if(m.matches()){
                System.out.println("Match is present");
            }
            else
                System.out.print("Match is not present");
        }

    }

    public void useOfIntern(){

        // S1 refers to Object in the Heap Area
        String s1 = new String("GFG"); // Line-1

        // S2 refers to Object in SCP Area
        String s2 = s1.intern(); // Line-2

        // Comparing memory locations
        // s1 is in Heap
        // s2 is in SCP
        System.out.println(s1 == s2);

        // Comparing only values
        System.out.println(s1.equals(s2));

        // S3 refers to Object in the SCP Area
        String s3 = "GFG"; // Line-3

        System.out.println(s2 == s3);
    }
}
