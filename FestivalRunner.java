package com.xworkz.functionalInterface.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FestivalRunner {

	public static void main(String[] args) {
		Collection<String> festival = new LinkedList<String>();
		festival.add("Holi");
		festival.add("Deepavali");
		festival.add("Dussehra");
		festival.add("Ugadi");
		festival.add("Pongal");
		festival.add("Christmas");
		festival.add("Onam");
		festival.add("Ganesha Chaturthi");
		festival.add("Eid");
		festival.add("Mahashivaratri");
		festival.add("Navaratri");
		festival.add("Durga Pooja");
		festival.add("Sankranthi");
		festival.add("Ramzan");
		festival.add("Moharam");

		festival.stream().filter(fest -> fest.length() > 6).forEach(fest -> System.out.println(fest));
		System.out.println("--------------------");
		festival.stream().filter(fest -> fest.length() < 6).collect(Collectors.toList())
				.forEach(fest -> System.out.println(fest));
		System.out.println("--------------------");
		festival.stream().filter(fest -> fest.contains("O") || fest.contains("o")).collect(Collectors.toList())
				.forEach(fest -> System.out.println(fest));
		System.out.println("--------------------");
		List<String> fest1=festival.stream().filter(fest -> !fest.contains("g")).collect(Collectors.toList());
				fest1.forEach(fest -> System.out.println(fest));
		System.out.println("--------------------");
		festival.stream().filter(fest -> fest.endsWith("S") || fest.endsWith("s")).collect(Collectors.toList())
				.forEach(fest -> System.out.println(fest));
		System.out.println("--------------------");
		festival.stream().filter(fest -> fest.contains("Z") || fest.contains("R")).collect(Collectors.toList())
				.forEach(fest -> System.out.println(fest));
		System.out.println("--------------------");
		festival.stream().filter(fest -> fest.contains("Ram")).collect(Collectors.toList())
				.forEach(fest -> System.out.println(fest));

	}

}
