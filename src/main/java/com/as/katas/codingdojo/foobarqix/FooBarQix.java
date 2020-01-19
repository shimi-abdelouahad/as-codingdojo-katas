package com.as.katas.codingdojo.foobarqix;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FooBarQix {

	private Map<Integer, String> patterns = Stream
			.of(new SimpleEntry<Integer, String>(3, "Foo"), new SimpleEntry<Integer, String>(5, "Bar"),
					new SimpleEntry<Integer, String>(7, "Qix"))
			.collect(Collectors.toMap(e -> e.getKey(), (e) -> e.getValue()));

	public Object process(Integer number) {

		String resultatDivisor = patterns.entrySet().stream().map(e -> number % e.getKey() == 0 ? e.getValue() : "")
				.collect(Collectors.joining());
		String resultatcontains = number.toString().chars().mapToObj(c -> Integer.parseInt((char) c + ""))
				.map(patterns::get).filter(Objects::nonNull).collect(Collectors.joining());
		return !resultatDivisor.isEmpty() ? resultatDivisor
				: (!resultatcontains.isEmpty() ? resultatcontains : number.toString());
	}

}
