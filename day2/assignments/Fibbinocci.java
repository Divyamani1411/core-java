package day2.assignments;
/*Print Fibbinocci series for first 11 numbers

0 1 1 2 3 5 8 13 21 35 56 

Goal: To understand the arthimetic operation and loop

a) Create a class by name: Fibbinocci
b) Create a main method using shortcut
c) Write a logic to print fibbinocci from 0 to 56
*/
/*Hints: 

*/
public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum);

		System.out.println(secNum);
		for(int i=1;i<=11;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			if(sum>11) {
				break;
			}
			System.out.println(sum);
		}
		
		
		//0 1 1 2 3 5 8 
		
		
	}

}
