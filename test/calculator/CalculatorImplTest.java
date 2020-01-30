package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.calculator.service.impl.CalculatorImpl;

class CalculatorImplTest {

	@Test
	void test() {
		CalculatorImpl c = new CalculatorImpl();
		assertEquals(c.calculateStatement("30+20+10*2"), 120);
		assertEquals(c.calculateStatement("22*2+10"), 54);
		assertEquals(c.calculateStatement("22/2*3"), 33);
	}

}
