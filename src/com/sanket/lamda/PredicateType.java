/**
 * Functional Interface
 * Predicate: will take one generic type input and return boolean output.
 */
package com.sanket.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Sanket Gupta
 *
 */
public class PredicateType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
			list.add(i);
		Predicate <Integer> evenIntegers = (Integer i)-> i%2==0;
//		PredicateType <Integer> oddIntegers = (Integer i)-> i%2!=0;
		//even
		System.out.println("EVEN");
		for (Integer integer : filter(list, evenIntegers)) {
			System.out.print(integer+" ");
		}
		//odd
		System.out.println("\nODD");
		for (Integer integer : filter(list, /*oddIntegers*/ (Integer i)-> i%2!=0)) {
			System.out.print(integer+" ");
		}


	}

	/**
	 * Use of predicate in filter method.
	 * @param list
	 * @param p
	 * @return
	 */
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<T>();
		for (T t : list) {
			if(p.test(t))// test method's definition will be provided via lamda expression.
				result.add(t);
		}
		return result;

	}
}

/**
 * Predicate
 * Functions interface, as it have one abstract method.
 */
/*@FunctionalInterface
interface Predicate <T> {
	boolean test(T t);
}*/
