package org.bank;
//Method overridding
public class MyBank {

	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
		bank.savings();
		bank.fixed();
		BankInfo bankInfo=new BankInfo();
		bankInfo.deposit();
		

	}

}
