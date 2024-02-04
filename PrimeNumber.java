//WAP to check the Number is Prime or Not

package com.uttam;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=11,temp=0;
		for(int i=2; i<=number-1; i++) {
			if(number%i==0) {
				temp=temp+1;
			}
		}
		if(temp<1) {
			System.out.println("The number " +number +"is a prime number");
		}else {
			System.out.println(number+" is not a prime number");
		}

	}

}
