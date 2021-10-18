package com.di.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	
	private List myList;
	private Set mySet;
	private Map myMap;
	public Student(List myList, Set mySet, Map myMap) {
		super();
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
	}
	@Override
	public String toString() {
		return "Student [myList=" + myList + ", mySet=" + mySet + ", myMap=" + myMap + "]";
	}
	
	
}
