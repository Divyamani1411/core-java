package day2.assignments;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int sum=obj.addNumber(50, 45, 56);
		System.out.println(sum);
		int sub=obj.subNumber(57, 465);
		System.out.println(sub);
		double multi=obj.multiNumber(2.64623, 1.6345665);
		System.out.println(multi);
		float divi=obj.divideNumber(1.234f, 2.24f);
		System.out.println(divi);
	}

}
