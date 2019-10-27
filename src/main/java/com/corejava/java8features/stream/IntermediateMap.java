/**
 * 
 */
package com.corejava.java8features.stream;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 * @author Bhabadyuti Bal
 *
 */
public class IntermediateMap {
	
	public void execute() {
		
	}
	
	public void call() {
		new Thread(this::execute).start();
		//OR 
		new Thread(() -> {
			System.out.println(new DateTimeAtCompleted(new Date()));
		}).start();
	}
	
	public static void example1() {
		/*System.out.println("string lengths...");
		List<Integer> wordsLen = Arrays.stream(new String[] {"Poland", "Germany", "France"})
				.map(String::length)
				.collect(Collectors.toList());
		wordsLen.forEach(System.out::println);
		
		System.out.println("list of string ==> map of string and length");
		
		
		Map<String, Integer> map = Arrays.stream(new String[] {"Poland", "Germany", "France"})
						//.sorted(Comparator.comparing(Function.identity()).reversed())
						.collect(Collectors.toMap(Function.identity(), e -> e.length()));*/
		
		
		final String output = Arrays.asList("Hello", "World", "Welcome", "Home", null)
							.stream()
							.filter(Objects::nonNull)
							.map(String::toUpperCase)
							.filter(x -> !x.contains("E"))
							.collect(Collectors.joining(","));
		
		
		try(PrintWriter pw = new PrintWriter(System.err)){
			pw.write(output);
		}
		System.err.println();
		//System.out.println(map);
		
		
	}
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		example1();
	}

}
