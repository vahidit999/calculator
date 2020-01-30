package com.calculator.service.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.calculator.service.Calculator;

@Service
public class CalculatorImpl implements Calculator{

	@Override
	public int calculateStatement(String calString) {
		//find numbers in string
		String numbers = calString.replaceAll("\\D+", "O");
		String[] numArr = numbers.split("O");
		// accepted char for Math operation
		String accepted = "-+*/";
		// LinkedList is needed for remove from iterator
		Iterator<String> numIterable = new LinkedList<String>( Arrays.asList(numArr)).iterator();
		int result = Integer.parseInt(numIterable.next().toString());
		numIterable.remove();
		for(int i = 0 ; i < calString.length() ; i++) {
			char c = calString.charAt(i);
			if(accepted.indexOf(c) > 0 ) {
				if (numIterable.hasNext()) {
					result = operation( result , Integer.parseInt(numIterable.next() + "") , c + "" );;
					numIterable.remove();
				}
			}
		}
		return result;
	}
	
	private int operation( int a , int b  , String o) {
		Context context = new Context(new SumImpl());
			if (o.equalsIgnoreCase("+")) {
				return context.execute( a , b );
			}
			if (o.equalsIgnoreCase("*")) {
				context = new Context(new MultiplicationImpl());
				return context.execute(a , b);
			}
			if (o.equalsIgnoreCase("/")) {
				context = new Context(new DivisionImpl());
				return context.execute( a , b);
			}
			return 0;
	}
}
