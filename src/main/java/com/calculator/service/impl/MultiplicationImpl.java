package com.calculator.service.impl;

import com.calculator.service.Calculate;

public class MultiplicationImpl implements Calculate{

	@Override
	public int run(int a, int b) {
		return a*b;
	}

}
