package day2.assignments;
/*Assignment 4: Print if the given number is prime

Goal: To understand the problem solving, looping and conditional statement

a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not

Hint: Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
If nothing divides, then print non-prime

*/
public class IsPrime {
	public static void main(String[] args) {
		int n=9;
		int j=2;
		int count=0;
		for(int i=2;i<=n;i++) {
			count=0;
			for(j=2;j<i;j++) {
				if(i%j==0) {
					count=count+1;
					break;
				
				}
			}
			if(count==0) {
				System.out.println(i+"is prime number");
			}else {
				System.out.println(i+"is not prime number");
			}
		}
	}
	
	

}
