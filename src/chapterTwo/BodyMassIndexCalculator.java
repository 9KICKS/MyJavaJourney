package chapterTwo;

import java.util.Scanner;

	public class BodyMassIndexCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

			System.out.print("Input weight (kg): " );
				double weight = input.nextDouble();
				
			System.out.print("Input height (m): " );
				double height = input.nextDouble();

		double bmi = weight / (height*height);
		System.out.println("Your BMI is : " +bmi);

	if (bmi < 18.5) {
		System.out.println("You are underweight");
		}

	if (bmi >= 18.5 && bmi < 25.0) {
		System.out.println("You have a normal weight" );
		}	

	if (bmi >= 25.0 && bmi < 30.0) {
		System.out.println("You are overweight");
		}

	if (bmi >= 30.0) {
		System.out.println("You are obese");
		}

 	}

}