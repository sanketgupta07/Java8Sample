/**
 * 
 */
package com.java8in.action.ch5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sanket Gupta
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brain = new Trader("Brain", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brain, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
	
	
//	1. Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("Answer 1:");
	transactions.stream().filter( t->t.getYear()==2011).sorted((t1,t2)->Integer.compare(t1.getValue(), t2.getValue())).forEach(t3-> System.out.println(t3));
	transactions.stream().filter( t->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(t3-> System.out.println(t3));//.collect(Collectors.toList());

	//	2. What are all the unique cities where the traders work?
	System.out.println("Answer 2:");
	transactions.stream().map(t->t.getTrader().getCity()).distinct().forEach(c->System.out.println(c));

	//	3. Find all traders from Cambridge and sort them by name.
	System.out.println("Answer 3:");
	transactions.stream().filter(t->t.getTrader().getCity()=="Cambridge").map(t->t.getTrader()).sorted(Comparator.comparing(Trader::getName)).distinct().forEach(trader->System.out.println(trader));//.collect(Collectors.toList());

	//	4. Return a string of all traders's names sorted alphabetically.
	System.out.println("Answer 4:");
//	String names=transactions.stream().map(tx->tx.getTrader().getName()).distinct().sorted().reduce("",(n1,n2)->n1+n2);
	String names=transactions.stream().map(tx->tx.getTrader().getName()).distinct().sorted().collect(Collectors.joining());
	System.out.println(names);
//	transactions.stream().map(tx->tx.getTrader().getName()).sorted().collect(joining());

	//	5. Are any traders based in Milan?
	System.out.println("Answer 5:");
	Boolean isMialBased=transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
	System.out.println(isMialBased);

	//	6. Print all transactions' values from the traders living in Cambridge.
	System.out.println("Answer 6:");
	transactions.stream().filter(t->t.getTrader().getCity()=="Cambridge").map(Transaction::getValue).distinct().forEach(tradeValue->System.out.println(tradeValue));

	//	7. What's the highest value of all the transactions?
	System.out.println("Answer 7:");
	System.out.println(transactions.stream().map(tx->tx.getValue()).max(Comparator.comparing(Integer::intValue)));
	//	8. Find the transaction with the smallest value. 
	System.out.println("Answer 8:");
	System.out.println(transactions.stream().min(Comparator.comparing(Transaction::getValue)));
	}

}
