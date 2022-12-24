package selfStudy;

public class PassByValueExample {
    public static void main(String[] args) {
        int number = 10;
        square(number);
        System.out.println("Number after squaring:: " + number);
    }

    public static void square(int firstNumber) {
        firstNumber = firstNumber * firstNumber;
        System.out.println("Square of first number:: " +firstNumber);
    }
}
