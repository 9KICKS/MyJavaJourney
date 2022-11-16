package chapterFour;

public class Kata {


    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int maxOf(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
        //return firstNumber > secondNumber ? firstNumber: secondNumber;
        //if (firstNumber > secondNumber) return firstNumber;
        //return secondNumber;
    }

    public int squareOf(int number) {
        return number * number;
    }

}
