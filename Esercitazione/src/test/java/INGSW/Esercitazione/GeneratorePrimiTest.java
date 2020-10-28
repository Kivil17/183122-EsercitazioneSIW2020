package INGSW.Esercitazione;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratorePrimiTest { 
	
	private static GeneratorePrimi tester;
	 
	@BeforeClass
    public static void preTest() {
		tester = new GeneratorePrimi(); 
	}
	
	@Test
	public void GeneratorePrimiTestato() {
		assertEquals(new ArrayList<Integer>(), tester.main(null));
		assertEquals(Arrays.asList(2,3,5,7),  tester.main(null));
	}
	
	@Test
	public void isWorks() {
		assertFalse(tester.genera(9));
		assertFalse(tester.genera(1));
		assertTrue(tester.genera(2));
	}

	
}
