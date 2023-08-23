package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {

        String[] symbolsAr = symbols.toLowerCase().split("");
        List<String> symbolsList = Arrays.asList(symbolsAr);
        ArrayList<String> symbolsArList = new ArrayList<>(symbolsList);

        String[] wordAr = word.toLowerCase().split("");
        List<String> wordList = Arrays.asList(wordAr);
        ArrayList<String> wordArList = new ArrayList<>(wordList);

        for (String w: wordArList) {
            if (!(symbolsArList.contains(w))) {
                return false;
            }
            symbolsArList.remove(w);
        }
    return true;
    }
}
//END
