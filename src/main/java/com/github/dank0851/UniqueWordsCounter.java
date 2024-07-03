package com.github.dank0851;
import java.util.*;
/*
* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
*  Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
*  Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций)
 */

public class UniqueWordsCounter {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "kiwi", "banana", "strawberry",
                "watermelon", "orange", "grape", "peach", "apple", "pear", "kiwi",
                "pineapple", "banana", "orange", "apple", "cherry"};

        Map<String, Integer> wordCountMap = new HashMap<>();
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
                uniqueWords.add(word);
            }
        }


        System.out.println("Unique words:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("\nWord count:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord + ": " + wordCountMap.get(uniqueWord));
        }
    }
}
