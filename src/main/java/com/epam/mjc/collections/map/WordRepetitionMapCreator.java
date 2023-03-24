package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        List<String> wordsList = Stream.of(sentence.toLowerCase().split("[ .,]"))
                .filter(s -> s.length() > 0)
                .collect(Collectors.toList());
        Map<String, Integer> result = new HashMap<>();
        for (String s : wordsList) {
            if (!result.containsKey(s)) {
                int count = (int) wordsList.stream()
                        .filter(word -> word.equals(s))
                        .count();
                result.put(s, count);
            }
        }
        return result;
    }
}
