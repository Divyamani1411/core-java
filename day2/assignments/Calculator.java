package day2.assignments;
/*Create a class "Calculator" with below methods
*(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
*(b) sub(int num1, int num2), it should return subtraction of of num1-num2
*(c) mul(double num1, double num2), it should return product of num1 * num2
*(d) divide(float num1, float num2), it should return division of num1 / num2

*-- Create another class as MyCalculator and call all the methods from Calculator and print the results
*/
public class Calculator {
	public int addNumber(int num1, int num2, int num3) {
		int addition = num1 + num2 + num3;
		return addition;

	}

	public int subNumber(int num1, int num2) {
		int subtraction = num1 - num2;
		return subtraction;
	}

	public double multiNumber(double num1, double num2) {
		double multiply = num1 * num2;
		return multiply;
	}
	public float divideNumber(float num1,float num2) {
		float division=num1/num2;
		return division;
	}
	
}
