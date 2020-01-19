package com.as.katas.codingdojo.foobarqix;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FooBarQixTest {
	FooBarQix fooBarQix;

	@Before
	public void setUp() {
		fooBarQix = new FooBarQix();
	}

	@Test
	public void should_return_Foo_when_is_divisibale_by_3() {
		assertEquals("Sould be equal to Foo", "Foo", fooBarQix.process(9));
	}

	@Test
	public void should_return_Bar_when_is_divisibale_by_5() {
		assertEquals("Sould be equal to Bar", "Bar", fooBarQix.process(10));

	}

	@Test
	public void should_return_Qix_when_is_divisibale_by_7() {
		assertEquals("Sould be equal to Qix", "Qix", fooBarQix.process(14));
	}

	@Test
	public void should_return_FooBar_when_is_divisibale_by_3and5() {
		assertEquals("Sould be equal to FooBar", "FooBar", fooBarQix.process(60));
	}

	@Test
	public void should_return_FooQix_when_is_divisibale_by_3and7() {
		assertEquals("Sould be equal to FooQix", "FooQix", fooBarQix.process(21));
	}

	@Test
	public void should_return_BarQix_when_is_divisibale_by_5and7() {
		assertEquals("Sould be equal to BarQix", "BarQix", fooBarQix.process(140));
	}

	@Test
	public void should_return_FooBarQix_when_is_divisibale_by_3and5and7() {
		assertEquals("Sould be equal to FooBarQix", "FooBarQix", fooBarQix.process(210));
	}

	@Test
	public void should_return_value_when_not_divisible_3and5and7() {
		assertEquals("Sould be equal to 2", "2", fooBarQix.process(2));
		assertEquals("Sould be equal to 4", "4", fooBarQix.process(4));
		assertEquals("Sould be equal to 11", "11", fooBarQix.process(11));
	}

	@Test
	public void should_return_Foo_when_is_contain_3() {
		assertEquals("Sould be equal to Foo", "Foo", fooBarQix.process(13));
	}

	@Test
	public void should_return_Bar_when_is_contain_5() {
		assertEquals("Sould be equal to Bar", "Bar", fooBarQix.process(52));
	}

	@Test
	public void should_return_Qix_when_is_contain_7() {
		assertEquals("Sould be equal to Qix", "Qix", fooBarQix.process(71));
	}

}
