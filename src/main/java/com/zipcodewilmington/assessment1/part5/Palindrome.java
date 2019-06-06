package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int countSubs = input.length();
        for(int i = 0; i<input.length(); i++){
            for (int j = i+2; j<=input.length(); j++){
                String cut = input.substring(i, j);
                if(reverse(cut).equals(cut)){
                    countSubs++;
                }
            }

        }

        return countSubs;
    }
}