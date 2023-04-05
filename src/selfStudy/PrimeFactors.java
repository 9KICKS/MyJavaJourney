package selfStudy;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = 0;
        int[] primeFactors = generatePrimeFactors(number);
        System.out.print("Result = [");
        for (int i = 0; i < primeFactors.length; i++) {
            if (primeFactors[i] != 0) {
                System.out.print(primeFactors[i]);
                if (i < primeFactors.length - 1 && primeFactors[i+1] != 0) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");
    }

    public static int[] generatePrimeFactors(int number) {
        int[] primeFactors = new int[100];
        int factor = 2;
        int index = 0;
        while (number > 1) {
            if (number % factor == 0) {
                primeFactors[index] = factor;
                index++;
                number = number / factor;
            } else {
                factor++;
            }
        }
        int[] result = new int[index];
        System.arraycopy(primeFactors, 0, result, 0, index);
        return result;
    }
}