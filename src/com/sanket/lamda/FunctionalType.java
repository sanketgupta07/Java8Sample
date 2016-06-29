/**
 * The java.util.function.Function<T, R> interface defines an abstract method named apply that
 * takes an object of generic type T as input and returns an object of generic type R
 */
package com.sanket.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Sanket Gupta
 *
 */
public class FunctionalType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Welcome","to","lamda","world","of","java8");
		List<Integer> lengths = map(/*Arrays.asList("Welcome","to","lamda","world","of","java8")*/
				strings, (String s)-> s.length());
		System.out.println("Length of each string list element.");
		
		for (Integer integer : lengths) {
			System.out.println( integer);
		}
	}
	
	private static <T,R> List<R> map(List<T> list, Function<T, R> f ){
		List<R> result = new ArrayList<R>();		
		for (T t : list) {			
				result.add(f.apply(t));
		}		
		return result;
	}

}
