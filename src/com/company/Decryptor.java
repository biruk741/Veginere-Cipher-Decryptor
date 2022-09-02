package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Decryptor {
    public static Map<String, List<Integer>> getTrigraphs(String text) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < text.length() - 3; i++) {
            String cur = text.substring(i, i + 3);
            if (map.containsKey(cur)) {
                List<Integer> list = map.get(cur);
                list.add(i);
                map.put(cur, list);
                continue;
            }
            List<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(cur, list);
        }
        return map;
    }

    public static Map<Character, List<Integer>> getCryptograms(String text, int length) {
        Map<Character, List<Integer>> frequencies = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char cur = text.charAt(i);
            int indexToGoTo = i % length;

            List<Integer> list;
            if (frequencies.containsKey(cur)) {
                list = frequencies.get(cur);
                list.set(indexToGoTo, list.get(indexToGoTo) + 1);
            } else {
                list = new ArrayList<Integer>(Collections.nCopies(length, 0));
                list.set(indexToGoTo, 1);
            }
            frequencies.put(cur, list);
        }
        return frequencies;
    }

    public static void getTopCharacters(String text, int length) {
        Map<Character, List<Integer>> frequencies = getCryptograms(text, length);

        for (int i = 0; i < length; i++) {
            int finalI = i;
            List<Map.Entry<Character, List<Integer>>> topN = frequencies.entrySet().stream()
                    .sorted((l1, l2) -> -1 * Integer.compare(l1.getValue().get(finalI), l2.getValue().get(finalI)))
                    .limit(10).collect(Collectors.toList());
            System.out.println("\nTop 10 choices for letter number " + (i+1) + " are:");

            for (Map.Entry<Character, List<Integer>> entry: topN){
                char cur = entry.getKey();
                int subtracted = (cur - 97);
                char decrypted = (char) ((improvedMod(subtracted - length , 26)) + 97);
                System.out.print(decrypted + ": " + entry.getValue().get(i) + " times, ");
            }
        }

    }
    private static int improvedMod(int a, int b) {
        int c = a % b;
        return (c < 0) ? c + b : c;
    }

}
