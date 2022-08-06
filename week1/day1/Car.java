package week1.day1;

public class Car {
	//Primitive data types
	public byte carWheels=4;
	private short carmirror=20;
	int price=10000500;
	long maxValue=34567884322l;
	float version=12.2f;
	double modelNumber=12.657685;
	boolean isGoodCar=false;
	char modelName='A';
	
	public static void main(String[] args) {

		//using oprators
		//arithmetic operator
		int a=10;
		int b=9;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		//relational operator
		int c=40;
		int d=41;
		System.out.println(c<d);
		System.out.println(c>d);
		System.out.println(c<=d);
		System.out.println(c>=d);
		System.out.println(c==d);
		System.out.println(c!=d);
		//logical operator
		int e=30;
		int f=30;
		System.out.println(c==d && e==f);
		System.out.println(c==d || e==f);
		boolean isGoodCar=false;
		System.out.println(!isGoodCar);
		//unary
		e++;
		System.out.println(e);
		e--;
		System.out.println(e);
		++e;
		System.out.println(e);
		
		int p=10;
		System.out.println("PPPPPPPP===================");
		
		System.out.println(p++);
		System.out.println(p);


		int s=10;

		System.out.println("SSSSSSSSSS===================");
		System.out.println(++s);//output is 11
		System.out.println(s);//output is 11
		
		//conditional statements
		
		int z=1;
		System.out.println(z>10);
		if (z==5) {
			System.out.println("one");
		}
		else {
			System.out.println("no one");	//no one			
		}
		
		
		
		
		
	}
	
	

}
