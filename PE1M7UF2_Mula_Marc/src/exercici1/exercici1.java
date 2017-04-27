package exercici1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (value=Parameterized.class)
public class exercici1 {
	
	private Double expected, actual, delta;
	private Primordial unprimordial;
	
	public exercici1(Double expected, Double actual, Double delta) {
		this.expected = expected;
		this.actual = actual;
		this.delta = delta;
	}
    
    @Parameters
	public static Collection<Double[]> ex1(){
		return Arrays.asList(new Double[][]{
    			{2.0, 2.0, 0.03},
    			{6.0, 3.0, 0.03},
    			{6.0, 4.0, 0.03},
    			{30.0, 5.0, 0.03},
    			{210.0, 7.0, 0.03},
    			{2310.0, 11.0, 0.03},
    			{30030.0, 13.0, 0.03},
    			{510510.0, 17.0, 0.03},
    			{9699690.0, 19.0, 0.03},
    			{223092870.0, 23.0, 0.03},
    	});
	}
	
	@Before
	public void crearObj(){
		unprimordial = new Primordial();
	}
	
	@Test
	public void test() {
		double calculado = unprimordial.get_primordial(actual);
		Assert.assertEquals(expected, calculado, delta);
	}

}