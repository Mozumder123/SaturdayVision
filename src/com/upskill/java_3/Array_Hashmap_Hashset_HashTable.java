package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array store multiple data using index
		int age = 30; // Variable
		int[] ageVision = new int[] { 21, 26, 28, 30, 35 }; // Array

		// Array index [0] [1] [2] [3] [4] [5]
		System.out.println("Student Age: " + ageVision[2]);
		System.out.println("Total student: " + ageVision.length);

		String[] nameVision = new String[] { "Sami", "Jabed", "Fahim", "Naim" };
		System.out.println("Student Name: " + nameVision[2]);
		System.out.println("Total student: " + nameVision.length);
		// Hashmap store multiple data using key-value pair, Implementation of
		// Map Interfaces
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Sami", 21);
		Student.put("Jabed", 26);
		Student.put("Fahim", 23);
		Student.put("Naim", 22);

		System.out.println("Hashmap Student Age : " + Student.get("Jabed"));
	
HashMap<String, String> Capital = new HashMap<String, String>();
Capital.put("India", "New Delhi");
Capital.put("Bangladesh", "Dhaka");
Capital.put("Ukraine", "Kyiv");
Capital.put("England", "London");

System.out.println("Capital City: " +Capital.get("Bangladesh"));
//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)

Hashtable<String, String> Region = new Hashtable<String, String>();
		
Region.put("Bangladesh", "Asia");
Region.put("England", "Europe");
		
System.out.println("Region : " + Region.get("BD"));

HashSet<String> car = new HashSet<String>();
car.add("Tesla");
car.add("BMW");
car.add("Toyota");
car.add("Audi");
car.add("Ford");
System.out.println("Car: " + car);
	}
}
