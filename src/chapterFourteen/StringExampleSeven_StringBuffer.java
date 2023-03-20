package chapterFourteen;

public class StringExampleSeven_StringBuffer {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(9);
        StringBuilder buffer3 = new StringBuilder("Hello");

        System.out.println("buffer1 = " + buffer1);
        System.out.println("buffer2 = " + buffer2);
        System.out.println("buffer3 = " + buffer3);
    }
}