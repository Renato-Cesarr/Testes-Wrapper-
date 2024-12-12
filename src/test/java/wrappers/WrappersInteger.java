package wrappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WrappersInteger {

	@Test
	void BitCount() {
		Integer numeroUm =5;
		
		assertEquals(2, Integer.bitCount(numeroUm));
		
	}

}
