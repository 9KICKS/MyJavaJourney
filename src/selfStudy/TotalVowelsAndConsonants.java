package selfStudy;

import java.util.Scanner;

public class TotalVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vowelsCounter = 0;
        int consonantsCounter = 0;
        System.out.println("Enter a sentence:");
        String userSentence = input.nextLine();
        userSentence = userSentence.toLowerCase();
        for(int i = 0; i < userSentence.length(); i++) {
            if(userSentence.charAt(i) == 'a' || userSentence.charAt(i) == 'e' || userSentence.charAt(i) == 'i' || userSentence.charAt(i) == 'o' || userSentence.charAt(i) == 'u') {
                vowelsCounter++;
            }
            else if(userSentence.charAt(i) >= 'a' && userSentence.charAt(i)<='z') {
                consonantsCounter++;
            }
        }
        System.out.println("Number of vowels in your sentence: " + vowelsCounter);
        System.out.println("Number of consonants in your sentence: " + consonantsCounter);
    }
}