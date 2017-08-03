/**
 * 
 */
package com.sanket.recursion;

/**
 * @author Sanket Gupta
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 10; //Integer.parseInt(args[0]);
		int output = factorial(i);
		System.out.println(i+"! = "+output);

	}

	/**
	 * 
	 * @param i
	 * @return
	 */
	public static int factorial(int i) {
		if(i>1)//break condition
			return i * factorial(i -1);//recursion
		else
			return 1;
	}

}
