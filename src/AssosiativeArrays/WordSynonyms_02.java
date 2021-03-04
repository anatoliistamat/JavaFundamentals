package AssosiativeArrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfPairs = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 0; i < countOfPairs; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!synonymDictionary.containsKey(word)) {
                List<String> synonymsForCurrentWord = new ArrayList<>();
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            } else {
                List<String> synonymForCurrentWord = synonymDictionary.get(word);
                synonymForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymForCurrentWord);
            }
        }

        for (Map.Entry<String, List<String>> entry : synonymDictionary.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}