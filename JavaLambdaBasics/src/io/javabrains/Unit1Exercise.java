package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		//Sort list by last name
		Collections.sort(persons, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//Create a method that prints all element of the list
		AllElement printAll = pList -> {
			for (Person p: pList) {
				System.out.println(p);
			}
		};
		printAll.printAll(persons);
		
		//Print all person whose last name begins with 'C'
		System.out.println("--------------------------------------------------------");
		AllPersonWithC apwc = pList -> {
			for (Person p: pList) {
				if (p.getLastName().startsWith("C")) {
					System.out.println(p);
				}
			}
		};
		apwc.printAllPersonWhoseLastNameBeginsWithC(persons);
	}

}
@FunctionalInterface
interface AllElement {
	void printAll(List<Person> list);
}
@FunctionalInterface
interface AllPersonWithC {
	void printAllPersonWhoseLastNameBeginsWithC(List<Person> list);
}
