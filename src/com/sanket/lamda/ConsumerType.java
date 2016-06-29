/**
 * Functional Interface
 * Consumer: Consumer
 * The java.util.function.Consumer<T> interface defines an abstract method named accept that
 * takes an object of generic type T and returns no result (void).
 */
package com.sanket.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Sanket Gupta
 *
 */
public class ConsumerType {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("Print array list");
		
		forEach(list, (Integer i)-> System.out.print(i+" "));
		
		System.out.println("\nPrint square of each element");		
		
		forEach(list, (Integer i) -> System.out.print(i*i+" "));
		
		
	}

	public static <T> void forEach(List<T> list,Consumer<T> c){
		for (T t : list)
			c.accept(t);		
	}
	
}

/**
 * Consumer
 * Functions interface, as it have one abstract method.
 */
/*@FunctionalInterface
interface Consumer <T> {
	void accept(T t);
}*/
