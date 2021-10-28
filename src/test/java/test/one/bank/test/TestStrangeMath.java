package test.one.bank.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

import strange.math.StrangeMath;

class TestStrangeMath {

	@Test
	void basicCharctierization() {
		//pos: actual = 11.096
		assertEquals(11.096, StrangeMath.strangeFunction(123.123), 0.001);
		
		//zero, negative
		assertEquals(0.0, StrangeMath.strangeFunction(0), 0.001);
		
		//negative: actual = 25.856
		assertEquals(25.856, StrangeMath.strangeFunction(-123.123), 0.001);
	}
	
	@Test
	public void basicFuzzTesting() {
	
		//get the full range of allowable inputs
		Double max = Double.MAX_VALUE;
		Double min = Double.MAX_VALUE/-5.44;
		
		//do a few tests in that range
		for (int i = 0; i < 10; i ++) {
			Double random = ThreadLocalRandom.current().nextDouble(min, max);
			
			if (random < 0 ) {
				assertEquals(Math.sqrt(random*-5.43), StrangeMath.strangeFunction(random));
			}
			else {
				assertEquals(Math.sqrt(random), StrangeMath.strangeFunction(random));
			}
		}
	}

}
