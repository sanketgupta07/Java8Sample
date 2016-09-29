/**
 * 
 */
package com.java8in.action.ch5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Example for IntStream
 * @author Sanket Gupta
 *
 */
public class PythagoreanTriplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	/*	Stream<int[]> pythagoreanTriplet = IntStream.rangeClosed(1, 100).boxed()// inclusive range of IntStream
				.flatMap(a -> // flatMap is used to get the individual Integer object a
				IntStream.rangeClosed(a, 100).filter(b -> Math.sqrt(a*a + b*b) % 1==0)// getting the correct value of b for which there is a perfect int c (a*a + b*b =c*c)
				.mapToObj(b -> new int[] {a,b,(int) Math.sqrt(a*a + b*b)})// creating a stream of int[]
//				.boxed().map(b -> new int[] {a,b,(int) Math.sqrt(a*a + b*b)})//boxed() will also generate Stream <Integer>
						);*/
		
		Stream<int[]> pythagoreanTriplet = IntStream.rangeClosed(1, 100).boxed()// inclusive range of IntStream
				.flatMap(a -> // flatMap is used to get the individual Integer object a
				IntStream.rangeClosed(a, 100)
				.mapToObj(b -> new int[] {a,b,(int) Math.sqrt(a*a + b*b)})// creating a stream of int[]
//				.boxed().map(b -> new int[] {a,b,(int) Math.sqrt(a*a + b*b)})//boxed() will also generate Stream <Integer>
				.filter(c-> c[2] % 1==0)// getting the correct value of b for which there is a perfect int c (a*a + b*b =c*c)
						);
		
		pythagoreanTriplet.limit(10).forEach(t -> System.out.println(t[0]+", "+t[1]+", "+t[2]));		

	}

}
