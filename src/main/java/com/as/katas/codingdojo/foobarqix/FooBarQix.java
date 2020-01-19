package com.as.katas.codingdojo.foobarqix;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FooBarQix {

	private Map<Integer, String> patterns = Stream
			.of(new SimpleEntry<Integer, String>(3, "Foo"), new SimpleEntry<Integer, String>(5, "Bar"),
					new SimpleEntry<Integer, String>(7, "Qix"))
			.collect(Collectors.toMap(e -> e.getKey(), (e) -> e.getValue()));

	public void showFooBarQix(Integer number) {
		IntStream.rangeClosed(1, number).boxed().map(this::process).forEach(System.out::println);
	}

	public String process(Integer number) {

		String resultat = patterns.entrySet().stream().map(e -> number % e.getKey() == 0 ? e.getValue() : "")
				.collect(Collectors.joining());
		resultat += number.toString().chars().mapToObj(c -> Integer.parseInt((char) c + "")).map(patterns::get)
				.filter(Objects::nonNull).collect(Collectors.joining());
		return resultat.isEmpty() ? number.toString() : resultat;

	}

}
