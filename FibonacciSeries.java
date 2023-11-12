//Printing Fibonacci series

package com.uttam;



public class FibonacciSeries {

	public static void main(String[] args) {
		int x=0,y=1,z=0;
		for(int i=1; i<=10;i++) {//Here loop is running 10 times 
			z=x+y;
			System.out.print(z+" ");
			x=y;
			y=z;
		}
		
	}

}
