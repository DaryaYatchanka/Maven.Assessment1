package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String s =str.substring(0,1).toUpperCase();
        String s1 = s+ str.substring(1);

        return s1;
    }
    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        String reversed = "";
        for (int i = str.length()-1;i>=0;i--) {
            sb.append(str.charAt(i));
        }

        return (sb.toString());
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {

            sb.append(str.charAt(i));
        }
        str = sb.toString();
         String s = str.substring(0,1).toUpperCase();
         String s1= s + str.substring(1);


        return s1;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String removeFAndL = str.substring(1,str.length()-1);

        return removeFAndL;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        boolean upper;
        boolean lower;
        String s = "";
        String s1 = "";
        String s2 = "";
        for (int i = 0; i<str.length();i++) {

           if( upper = Character.isUpperCase(str.charAt(i))==true){
               s = str.substring(i,i+1).toLowerCase();
               s1+= s + str.substring(i+1);
               break;
           }
           else if( lower = Character.isLowerCase(str.charAt(i))==true){
               s = str.substring(i,i+1).toUpperCase();
                s2+= s + str.substring(i+1);
                break;
           }

        }
        return s1+s2;
    }
}
