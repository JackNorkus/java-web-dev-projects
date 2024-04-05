package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        String testString = "This is a string to test!";
        char[] charactersInString = testString.toCharArray();
        for (char character : charactersInString) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> endChar : characterCounts.entrySet()) {
            System.out.println(endChar.getKey() + ": " + endChar.getValue());
        }
    }
}
