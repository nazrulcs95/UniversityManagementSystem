package com.management.university.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StringListConverter implements AttributeConverter<List<Long>, String> {

	private ArrayList<String> vals = new ArrayList<>();
	ArrayList<Long> longs = new ArrayList<>();

	@Override
	public String convertToDatabaseColumn(List<Long> list) {
		String listString = list.toString();
		// Java 8
		return String.join(",", listString);
		// Guava
		// return Joiner.on(',').join(list);
	}

	@Override
	public List<Long> convertToEntityAttribute(String str) {
		vals = (ArrayList<String>) Arrays.asList(str.split(","));
		for (String ks : vals) {
			longs.add(Long.parseLong(ks));
		}
		
		return longs;
		
		//-------or--------//
		
		/*
		 * return Arrays.stream(str.split(",")) .map(Long::parseLong)
		 * .collect(Collectors.toList());
		 */
	}

}
