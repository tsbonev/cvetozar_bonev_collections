package com.clouway.crm.core;
import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostCommon {


    /**
     * Counts the times all distinct words appear in a given string
     *
     * @param words the string to sreach through
     * @return a string with the result
     */
    public Map<String, Integer> wordCount(String words){

        Map<String, Integer> wordCounter = new TreeMap<>();

        for (String word: words.split(" ")
             ) {
            Integer freq = wordCounter.get(word);
            wordCounter.put(word, (freq == null) ? 1 : freq + 1);
        }

        return wordCounter;
    }

    /**
     * Finds the most common letter in a given string
     *
     * @param words the string to search through
     * @return the most common letter
     */
    public String letterCount(String words){

        words.toLowerCase();

        Set<String> wordSet = Arrays.stream(words.split("")).filter(c -> c != " ").collect(Collectors.toSet());

        String mostCommonLetter = "";

        long largestYet = 0;

        for (String letter: wordSet
                ) {
            long count = Stream.of(words.split("")).filter(c -> c.equals(letter)).count();
            if(count > largestYet){
                largestYet = count;
                mostCommonLetter = letter;
            }
        }

        return mostCommonLetter;

    }

}
