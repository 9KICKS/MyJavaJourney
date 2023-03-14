package chapterFourteen;

public class StringExampleThree {
    public static void main(String[] args) {
        String folahan = "9KICKS";
        System.out.println(folahan.charAt(5));
        char[] chars = new char[5];
        folahan.getChars(1, 6, chars, 0);
        System.out.println(chars);
        System.out.println(folahan.length());
    }
}
