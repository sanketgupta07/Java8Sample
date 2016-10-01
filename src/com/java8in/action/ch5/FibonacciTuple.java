/**
 * 
 */
package com.java8in.action.ch5;

import java.util.stream.Stream;

/**
 * eg. (0,1)(1,1)(1,2)(2,3)(3,5)(5,8)....
 * @author Sanket Gupta
 *
 */
public class FibonacciTuple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Printing tuples");
		Stream.iterate(new int []{0,1}, t -> new int[]{t[1],t[0]+t[1]})
		.limit(10)
		.forEach(t->System.out.print("("+t[0]+","+t[1]+")"));
		
		System.out.println("Printing series");
		Stream.iterate(new int []{0,1}, t -> new int[]{t[1],t[0]+t[1]})
		.map(t->t[0])
		.limit(10)
		.forEach(System.out::println);

	}

}
