package com.tns.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {
	
	void allOperations() {
		
		Integer[] values=new Integer[] {1,2,3,4,5,6,7} ;
		//creating a stream using stream method
		Stream<st> <Integer>st=Arrays.stream(values);
		// limit
		System.out.println("the first 2 no's in the array are");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		// skip
		System.out.println("the first 2 no's in the array are");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		
		// map
		System.out.println("the square of the no's are");
		st.map(num->num*num).forEach(System.out::println);
		//filter
		System.out.println("no's greater than 5");
		st.filter(num->num*num>5).forEach(System.out::println);
		Stream <Integer>st1=Arrays.stream(values);

		
		
	}

}
