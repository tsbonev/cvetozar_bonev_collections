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
    public char letterCount(String words){

        words = words.toLowerCase().replaceAll("\\s+", "");

        Map<Character, Integer> letterCounter = new TreeMap<>();

        for (char letter : words.toCharArray()
             ) {
            Integer freq = letterCounter.get(letter);
            letterCounter.put(letter, (freq == null) ? 1 : freq + 1);
        }

        return ((TreeMap<Character, Integer>) letterCounter).firstKey().charValue();

    }

}
