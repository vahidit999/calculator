package com.calculator.service.impl;

import com.calculator.service.Calculate;

public class Context {
	Calculate calculate ;
	public Context(Calculate calculate) {
		this.calculate = calculate;
	}
	
	public int execute(int a , int b) {
		return calculate.run(a, b);
	}
}
