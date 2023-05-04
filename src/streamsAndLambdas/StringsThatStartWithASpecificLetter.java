package streamsAndLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class  StringsThatStartWithASpecificLetter {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "banana", "pear", "grape"));
        ArrayList<String> result = arrayList.stream()
                .filter(word -> word.startsWith("p"))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Strings that start with 'p' = " + result);
    }
}
