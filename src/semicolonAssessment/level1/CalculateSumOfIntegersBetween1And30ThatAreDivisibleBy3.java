package semicolonAssessment.level1;

public class CalculateSumOfIntegersBetween1And30ThatAreDivisibleBy3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of integers between 1 and 30 that are divisible by 3 = " + sum);
    }
}