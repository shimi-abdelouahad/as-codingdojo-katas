package com.as.katas.codingdojo.fuzbuz;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FuzBuz {

	Map<Integer, String> patterns = Stream
			.of(new SimpleEntry<Integer, String>(3, "Fuz"), new SimpleEntry<Integer, String>(5, "Buz"))
			.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

	public void showFuzBuz(int number) {
		IntStream.rangeClosed(1, number).boxed().map(this::compute).forEach(System.out::println);
	}

	public String compute(Integer number) {
		String resultatDivisor = patterns.entrySet().stream().map(e -> number % e.getKey() == 0 ? e.getValue() : "")
				.collect(Collectors.joining());
		resultatDivisor += number.toString().chars().mapToObj(c -> Integer.parseInt((char) c + "")).map(patterns::get)
				.filter(Objects::nonNull).collect(Collectors.joining());

		return resultatDivisor.isEmpty() ? number.toString() : resultatDivisor;
	}

}
