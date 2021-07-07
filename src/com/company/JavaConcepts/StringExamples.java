package com.company.JavaConcepts;

public class StringExamples {

    public static void stringExamples(){
        String s = "abcdaabbssaaaefghi";
        String s1 = "Abcd";
//        System.out.println(s);
//
//        int size = s.length();
//        System.out.println(size);
//
//        System.out.println(s.substring(3, 7));
//        System.out.println(s+s1);
//
//        s = s+s1;
//        System.out.println(s);
//
//        System.out.println(s.toUpperCase());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s.replace('a', 'z'));

//        if(s.compareTo(s1)<0){
//            System.out.println(s + " is lexicographically smaller than " + s1);
//        } else {
//            System.out.println(s + " is not lexicographically smaller than " + s1);
//        }


        String s2 = "    abc def   ";
//        System.out.println(s2);
//        System.out.println(s2.trim());

        String s3 = "abc-def-ghi jkl";
        String[] words = s3.split("-");
//        for(int i=0; i< words.length; i++){
//            System.out.println(words[i]);
//        }

//        System.out.println(s3.substring(0,0));

        if(s3.substring(0,0).isEmpty()){
            System.out.println("Empty String");
        }

        System.out.println(s3.indexOf(""));

    }
}
