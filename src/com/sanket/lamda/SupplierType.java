/**
 * 
 */
package com.sanket.lamda;

import java.util.function.Supplier;

/**
 * @author Sanket Gupta
 *
 */
public class SupplierType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Supplier<Double> random = ()-> Math.random();
		System.out.println("random value: "+random.get());
	}

}

