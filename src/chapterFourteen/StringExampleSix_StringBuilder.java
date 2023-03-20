package chapterFourteen;

public class StringExampleSix_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Folahan");
        StringBuilder value = stringBuilder;
        stringBuilder.append("Joshua");
        System.out.println(stringBuilder);
        System.out.println(value);
    }
}