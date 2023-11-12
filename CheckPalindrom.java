//Check the given number is palindrom number or not.

package com.uttam;

public class CheckPalindrom {

	public static void main(String[] args) {
		
		int number=515, remainder,temp=0;
		
		while(number>0) {
			remainder=number%10;
			number=number/10;
			temp=temp*10+remainder;
		}
		
	     System.out.println(temp);
	}
}
