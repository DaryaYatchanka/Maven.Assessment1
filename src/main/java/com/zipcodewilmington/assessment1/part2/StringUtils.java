package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
        String[] splited = sentence.split(" ");
        return splited;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {

        String[] first = sentence.split(" ");
        return first[0];

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] first = sentence.split(" ");
        String second = first[0];


        for (int i = second.length()-1;i>=0;i--) {
            sb.append(second.charAt(i));
        }

        return (sb.toString());

    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        String[] first = sentence.split(" ");
        String second = first[0];


        for (int i = second.length()-1;i>=0;i--) {
            sb.append(second.charAt(i));
        }

        result = (sb.toString());
        String s =result.substring(0,1).toUpperCase();
        String s1 = s+ result.substring(1);

        return s1;


    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        String first = str.substring(0,index);
        String second = str.substring(index+1, str.length());


        return first+second;

    }

}
