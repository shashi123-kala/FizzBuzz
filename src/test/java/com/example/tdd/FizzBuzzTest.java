package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private  FizzBuzz fizzBuz;
	@Before
	public void setup() {
		 fizzBuz = new FizzBuzz();
	}
	
	@Test
	public void testNumber() {
		int number = 1;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("1",numberReturned );
		
	}

}
