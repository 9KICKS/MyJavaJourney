package chapterFive;

public class ContinueExample {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count == 5) {
                continue;
            }
            System.out.println(count);
        }
    }
}
