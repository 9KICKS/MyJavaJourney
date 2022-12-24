package chapterFive;

public class SummingIntegersWithForStatement {
    public static void main(String[] args) {
        int sum = 0;
        for (int counter = 2; counter <= 20; counter += 2) {
            sum += counter;
        }
        System.out.printf("The sum is %d", sum);
    }
}
