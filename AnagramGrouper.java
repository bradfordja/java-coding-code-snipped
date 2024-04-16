import java.util.*;

public class AnagramGrouper {
    
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            // Convert string to char array to sort
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            // Create a key from the sorted array
            String key = String.valueOf(charArray);
            
            // If key is not already in the map, add it with a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Add the original string to the list associated with the sorted key
            map.get(key).add(s);
        }
        
        // Return the list of groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + groupedAnagrams);
    }
}
