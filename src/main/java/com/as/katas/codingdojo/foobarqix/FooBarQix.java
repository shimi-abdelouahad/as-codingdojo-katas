package com.as.katas.codingdojo.foobarqix;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FooBarQix {
	
	private Map<Integer, String> patterns =Stream.of(
			new SimpleEntry<Integer, String>(3, "Foo"),
			new SimpleEntry<Integer, String>(5, "Bar"),
			new SimpleEntry<Integer, String>(7, "Qix")).collect(
					Collectors.toMap(e -> e.getKey(), (e) -> e.getValue()));

	public Object process(Integer number) {
		
		String resultat = patterns.entrySet().stream().map(e-> number%e.getKey()==0? e.getValue():"").
		collect(Collectors.joining());
		return !"".equals(resultat)?resultat: number.toString();
	}
	

}
