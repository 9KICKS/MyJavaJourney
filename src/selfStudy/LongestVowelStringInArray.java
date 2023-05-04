package selfStudy;

import java.util.Arrays;

public class LongestVowelStringInArray {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "sneakers", "young", "aeiou", "coconut", "green", "pineapple", "cat", "banana"};
        String longestVowel = Arrays.stream(words)
                .filter(elements -> elements.matches("[aeiouAEIOU]+"))
                .max((firstElement, secondElement) -> Integer.compare(firstElement.length(), secondElement.length()))
                .orElse("");
        System.out.println("Longest vowel string in the array = " + longestVowel);
    }
}
