package com.clouway.crm.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        //region MostCommon

        MostCommon mostCommon = new MostCommon();

        String words1 = "aa cc aa ff gg hh ff";
        String words2 = "Ники Илиев Вълчев Вевов";

        System.out.println(mostCommon.letterCount(words2));

        //endregion

    }
}
