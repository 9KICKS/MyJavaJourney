package chapterFourteen;

public class StringExampleFour {
    public static void main(String[] args) {
        String firstString = new String("Semicolon");
        String secondString = new String("Semicolon");
        System.out.println(firstString == secondString);

        String thirdString = "Semicolon";
        String fourthString = "Semicolon";
        System.out.println(thirdString == fourthString);
    }
}