package com.murmylo.volodymyr.strings;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> charIndexSumMap = getCharacterIndexesSum(s);
        Map<Character, Integer> charIndexSumMap2 = getCharacterIndexesSum(t);
        List<Integer> values = charIndexSumMap.values().stream().toList();
        List<Integer> values2 = charIndexSumMap2.values().stream().toList();
        return values.equals(values2);
    }

    private static LinkedHashMap<Character, Integer> getCharacterIndexesSum(String s) {
        return IntStream.range(0, s.length())
                .boxed()
                .collect(Collectors.groupingBy(s::charAt, LinkedHashMap::new, Collectors.summingInt(i -> i + 1)));
    }
}
