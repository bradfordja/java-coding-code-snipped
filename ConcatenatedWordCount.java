import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcatenatedWordCount {
    public static Map<String, Integer> getConcatenateWordCount(List<String> steam1, List<String> steam2) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        //Count words frin the first stream
        for (String word: steam1) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Count words from the second stream
        for (String word: steam2) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }

    public static void main(String[] args) {
        List<String> steam1 = new ArrayList<>();
        steam1.add("cat");
        steam1.add("rat");
        steam1.add("dog");

        List<String> steam2 = new ArrayList<>();
        steam2.add("cat");
        steam2.add("dog");
        steam2.add("cow");
        steam2.add("dock");

        Map<String, Integer> wordCountMap = getConcatenateWordCount(steam1, steam2);

        // Print the concatenated word count
        for (Map.Entry<String, Integer> entry: wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
