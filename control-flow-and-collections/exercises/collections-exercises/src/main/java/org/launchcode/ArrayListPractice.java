package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ints.add(i);
        }
        System.out.println(sumEven(ints));
        ArrayList<String> words = new ArrayList<>();
        words.add("these");
        words.add("are");
        words.add("some");
        words.add("words");
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        System.out.println(numCharLetters(words, numChars));
    }

    private static ArrayList<String> numCharLetters(ArrayList<String> arrList, int numOfLetters) {
        ArrayList<String> numCharLetterWords = new ArrayList();
        for (String word : arrList) {
            if (word.length() == numOfLetters) {
                numCharLetterWords.add(word);
            }
        }
        return numCharLetterWords;
    }

    private static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
