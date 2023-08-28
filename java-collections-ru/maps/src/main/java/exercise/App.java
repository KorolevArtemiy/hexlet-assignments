package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String text) {
        Map<String, Integer> word = new HashMap<>();
        if (text != "") {
            String[] words = text.split(" ");
            for (int i = 0; i < words.length; i++) {
                int qua = 0;
                if (!(word.containsKey(words[i]))) {
                    for (int j = i; j < words.length; j++) {
                        if (words[i].equals(words[j])) {
                            qua++;
                        }
                    }
                    word.put(words[i], qua);
                }
            }
        }
        return word;
    }

    public static String toString(Map<String, Integer> map) {
        String mapToString = map.toString();
        if (mapToString == "{}") {

            return mapToString;
        }
        mapToString = mapToString.trim();
        mapToString = mapToString.replace("{", "{\n  ");
        mapToString = mapToString.replace("}", "\n}");
        mapToString = mapToString.replace(",", "\n ");
        mapToString = mapToString.replace("=", ": ");
        return mapToString;
    }
}
//END
