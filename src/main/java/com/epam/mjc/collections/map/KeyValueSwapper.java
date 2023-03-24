package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Integer key : sourceMap.keySet()) {
            String value = sourceMap.get(key);
            if (!result.containsKey(value)) {
                result.put(value, key);
            }
        }
        return result;
    }
}
