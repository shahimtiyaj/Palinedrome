package com.bytelab.palinedrom;

import java.util.Scanner;

public class Palinedrome {
	
	private static Scanner input;
	private static int sum=0;
	private static int r;
	private static int temp;
	private static int n;


	public static void main(String[] args) {
		
		input=new Scanner(System.in);
		System.out.print("Please Enter a Number: ");
		n=input.nextInt();
		temp=n;
		
	while (n>0) {
	
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}
	
	if (temp==sum) {
		System.out.println("Palindrome Number");
		
	}
	else {
		System.out.println("Not Palindrome Number");

	}
		

	}

}
