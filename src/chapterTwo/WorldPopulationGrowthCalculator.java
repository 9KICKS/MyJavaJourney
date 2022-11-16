package chapterTwo;

public class WorldPopulationGrowthCalculator {

	public static void main(String[] args)  {

	System.out.println("Current World Population: 7980000000.00");

	System.out.println("Annual World Population Growth Rate: 83000000.00 or 1.1%");

	double estimate = 7980000000.00*(1 + 83000000.00);

	System.out.println("After 1 year: " +estimate * 1 );
	System.out.println("After 2 years: " +estimate * 2 );
	System.out.println("After 3 years: " +estimate * 3 );
	System.out.println("After 4 years: " +estimate * 4 );
	System.out.println("After 5 years: " +estimate * 5 );


	}

} 