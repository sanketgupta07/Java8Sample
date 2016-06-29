/**
 * 
 */
package com.sanket.lamda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sanket Gupta
 *
 */
public class LamdaTest  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple("red", 75));
		list.add(new Apple("green", 200));
		list.add(new Apple("dark-red", 100));
		list.add(new Apple("yellow", 50));
		
		
//		Comparator<Apple> comparator = (Apple a, Apple b)-> a.getWeight().compareTo(b.getWeight());
		List<Apple> filterApples = filterApp(list, (Apple apple) -> "red".equals(apple.getColor()));
//		list.sort((Apple a, Apple b)-> a.getWeight().compareTo(b.getWeight()));
		
		for (Apple apple2 : filterApples) {
			System.out.println(apple2);
		}
	}
	
	public static List<Apple> filterApp(List<Apple>list ,FilterApple f){
		List<Apple> filterList = new ArrayList<Apple>();
		for (Apple apple : list) {
			if(f.filter(apple))
				filterList.add(apple);				
		}		
		return filterList;		
	}

}

@FunctionalInterface
interface FilterApple {	Boolean filter(Apple apple);}

class Apple{
	String color;
	Integer weight;
	
	public Apple(String color, Integer weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}
	
}
