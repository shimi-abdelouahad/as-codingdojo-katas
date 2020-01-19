package com.as.katas.codingdojo.fuzbuz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FuzBuzTest {

	FuzBuz fuzBuz;

	@Before
	public void setUp() {
		fuzBuz = new FuzBuz();
	}

	@Test
	public void shoud_return_same_number_when_not_divisor_and_not_contains() {
		assertEquals("sould return 1", "1", fuzBuz.compute(1));
		assertEquals("sould return 2", "2", fuzBuz.compute(2));
		assertEquals("sould return 4", "4", fuzBuz.compute(4));
		assertEquals("sould return 11", "11", fuzBuz.compute(11));
	}

	@Test
	public void should_return_Fuz_when_divisor_3() {
		assertEquals("should return Fuz", "Fuz", fuzBuz.compute(6));
	}

	@Test
	public void should_return_Buz_when_divisor_5() {
		assertEquals("should return Buz", "Buz", fuzBuz.compute(10));
	}

	@Test
	public void should_return_FuzBuz_when_divisor_3and5andconains5() {
		assertEquals("should return FuzBuzBuz", "FuzBuzBuz", fuzBuz.compute(15));
	}

	@Test
	public void should_return_FuzFUZ_when_divisor_andcontains_3() {
		assertEquals("should return FuzFuz", "FuzFuz", fuzBuz.compute(3));
	}

	@Test
	public void should_return_FuzBuz_when_divisor_3and5andconains3() {
		assertEquals("should return FuzBuzFuz", "FuzBuzFuz", fuzBuz.compute(30));
	}
}
