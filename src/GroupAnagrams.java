import org.jetbrains.annotations.NotNull;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        // sortedStr, index
        int counter = 0;
        for (String s: strs) {

            char[] charArray = s.toCharArray();

            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

            if (map.containsKey(sortedStr))
                result.get(map.get(sortedStr)).add(s);
            else {

                List<String> list1 = new ArrayList<>();
                list1.add(s);
                result.add(list1);

                map.put(sortedStr, counter);
                counter++;

            }
        }

        return result;
    }
}
