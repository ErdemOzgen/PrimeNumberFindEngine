import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class PrimeFactorTest {
	
	 private List<Integer> list(int... ints) {
		    List<Integer> list = new ArrayList<Integer>();
		    Collections.copy(list, Main.primes);
		    return list;
		  }
	
	 
	@Test
	void testOne() {
		assertEquals(list(),generate.generate(1));
	}
	@Test
	void testtwo() {
		assertEquals(list(),generate.generate(2));
	}
	@Test
	void testThree() {
		assertEquals(list(),generate.generate(3));
	}
	@Test
	void testFour() {
		assertEquals(list(),generate.generate(4));
	}
	@Test
	void testFive() {
		assertEquals(list(),generate.generate(5));
	}
	@Test
	void testSix() {
		assertEquals(list(),generate.generate(6));
	}
	@Test
	void testseven() {
		assertEquals(list(),generate.generate(7));
	}

}
