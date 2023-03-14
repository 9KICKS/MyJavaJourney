package chapterFourteen;

public class StringExampleTwo {
    public static void main(String[] args) {
        char[] chars = {65, 66, 67, 68, 69, 70};

        String string = new String(chars, 1, 3);
        System.out.println(string);
    }
}