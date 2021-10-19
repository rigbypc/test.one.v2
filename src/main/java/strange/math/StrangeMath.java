package strange.math;

import java.lang.Math;

public class StrangeMath {
	
	public static double strangeFunction(double value) {
		if(value <= 0) {
			value *= -5.43;
		}
		
		return Math.sqrt(value);
	}
}

