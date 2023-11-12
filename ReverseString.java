//Reverse a String without using inbuilt method/function

package com.uttam;

public class ReverseString {

	public static void main(String[] args) {
		String originalString="Uttam Kumar Das";
		String reverseString="";
		char[] charArray=originalString.toCharArray();
		for(int i=originalString.length()-1;i>0;i--) {
			reverseString+=charArray[i];
		}
		System.out.println("This is a original String :"+originalString);
		System.out.println("reverseString is :"+reverseString);
	}

	
	
}
