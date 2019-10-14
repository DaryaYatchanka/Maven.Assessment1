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
        String s = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());

        return s;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += (str.charAt(i));
        }

        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String result = "";
        result = reverse(str);

        return camelCase(result);

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String removeFAndL = str.substring(1, str.length() - 1);

        return removeFAndL;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i)) == true) {
                s += str.substring(i, i + 1).toLowerCase();
            } else {
                s += str.substring(i, i + 1).toUpperCase();
            }
        }
        return s;
    }
}
