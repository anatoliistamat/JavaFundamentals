package MidExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] wordsArray = scan.nextLine().split(" ");
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        String commandString = scan.nextLine();
        while (!("Stop").equals(commandString)) {
            String[] commandArray = commandString.split("\\s+");
            String command = commandArray[0];
            switch (command) {
                case "Delete": {
                    int index = Integer.parseInt(commandArray[1]);
                    delete(words, index);
                    break;
                }
                case "Swap": {
                    String word1 = commandArray[1];
                    String word2 = commandArray[2];
                    swap(words, word1, word2);
                    break;
                }
                case "Put": {
                    String word = commandArray[1];
                    int index = Integer.parseInt(commandArray[2]);
                    put(words, word, index);
                    break;
                }
                case "Sort": {
                    sort(words);
                    break;
                }
                case "Replace": {
                    String word1 = commandArray[1];
                    String word2 = commandArray[2];
                    replace(words, word1, word2);
                    break;
                }
            }
            commandString = scan.nextLine();
        }

        System.out.println(String.join(" ", words));
    }

    private static boolean isValidIndex(List<String> words, int index) {
        return 0 <= index && index < words.size();
    }

    private static void replace(List<String> words, String word1, String word2) {
        int index = words.indexOf(word2);
        if (isValidIndex(words, index)) {
            words.set(index, word1);
        }
    }

    private static void sort(List<String> words) {
        Collections.sort(words);
        Collections.reverse(words);
    }

    private static void put(List<String> words, String word, int index) {
        if (isValidIndex(words, index - 1) || index - 1 == words.size()) {
            words.add(index - 1, word);
        }
    }

    private static void swap(List<String> words, String word1, String word2) {
        int word1Index = words.indexOf(word1);
        int word2Index = words.indexOf(word2);
        if (isValidIndex(words, word1Index) && isValidIndex(words, word2Index)) {
            Collections.swap(words, word1Index, word2Index);
        }
    }

    private static void delete(List<String> words, int index) {
        if (isValidIndex(words, index + 1)) {
            words.remove(index + 1);
        }

    }
}