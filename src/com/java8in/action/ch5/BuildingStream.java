/**
 * 
 */
package com.java8in.action.ch5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Sanket Gupta
 *
 */
public class BuildingStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("########Stream from values########");
		Stream<String> stream = Stream.of("Hi!","this","is","stream");
		stream.map(String::toUpperCase).forEach(System.out::println);

		System.out.println("########Stream from Arrays########");
		int[] numbers = {2,3,5,7,9,11,74,45};
		int sum = Arrays.stream(numbers).sum();
		System.out.println(sum);

		String [] strings = {"sanket", "gupta"};
		Arrays.stream(strings).forEach(System.out::println);

		System.out.println("########Stream from file########");

		try (Stream<String> lines=Files.lines(Paths.get("F:\\java8\\Java8Example\\src\\com\\java8in\\action\\ch5\\test.txt"), Charset.defaultCharset())) {
			lines.flatMap(line -> Arrays.stream(line.split(" ")/*this will return an array of word*/))
			.distinct().forEach(System.out::println);

		} catch (IOException e) {
			System.out.println("IO exception");
		}
		
		//Stream iterate and generate
	
		Stream.iterate(2, n-> n+2).limit(10).forEach(System.out::println);
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
		

	}



}
