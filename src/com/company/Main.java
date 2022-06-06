package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("[Задание 1]");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer i : nums) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n" + "[Задание 2]");

        List<Integer> numsList = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsSet = new HashSet<>(numsList);
        for (Integer i : numsSet) {
            if (i % 2 == 0) {
                Collections.sort(numsList);
                System.out.print(i + " ");
            }
        }

        System.out.println("\n" + "[Задание 3]");

        String words = "Безумие - это точное повторение одного и того же действия раз за разом, в надежде на изменение. Это и есть безумие.";
        String[] wordsSplit = words.toLowerCase().split("[\\s,.-]+");
        Set<String> uniqueWords = new LinkedHashSet<>();
        Set<String> duplicateWords = new HashSet<>();
        for (String word : wordsSplit) {
            if (!uniqueWords.add(word)) {
                duplicateWords.add(word);
            }
        }
        uniqueWords.removeAll(duplicateWords);
        System.out.println(uniqueWords);

        System.out.println("[Задание 4]");

        String text = "Безумие - это точное повторение одного и того же действия раз за разом, в надежде на изменение. Это и есть безумие.";
        List<String> stringList = Arrays.asList(text.toLowerCase().split("[\s,.-]+"));
        Set<String> uniqueWord = new LinkedHashSet<>(stringList);
        for (String word : uniqueWord) {
            System.out.println(word + " " + Collections.frequency(stringList,word));
        }
    }
}
