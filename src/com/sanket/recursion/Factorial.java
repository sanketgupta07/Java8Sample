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
	 * Steps:
	 * 1. The base case returns a value without making any subsequent recursive calls. 
	 *    It does this for one or more special input values for which the function can be evaluated without recursion.
	 *    For factorial(), the base case is n = 1.
	 * 2. The reduction step is the central part of a recursive function. 
	 * 	  It relates the value of the function at one (or more) input values to the value of the function at one (or more) other input values. 
	 * 	  Furthermore, the sequence of input values values must converge to the base case. For factorial(), 
	 *    the value of n decreases by 1 for each call, so the sequence of input values converges to the base case.
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
