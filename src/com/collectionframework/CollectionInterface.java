package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection <String> fruitcollection = new ArrayList<>();
		fruitcollection.add("Apple");
		fruitcollection.add("Banana");
		fruitcollection.add("Mango");
		fruitcollection.add("Watermelon");
		fruitcollection.add("Litchy");
		fruitcollection.add("Jackfruit");
		
		
		
		System.out.println("Printing Collections: " + fruitcollection);
		
		//to check the class name
		System.out.println("Printing Collection Class Name: " + fruitcollection.getClass().getName());
		
		
		//removing fruit element from collection
		
		System.out.println("Removing element from collection " + fruitcollection.remove("Litchy"));
		System.out.println("Removing element from collection " + fruitcollection.remove("Strawberry"));
		
		
		if(fruitcollection.remove("Litchy")) {
			System.out.println("One element removed");
		} else {
			System.out.println("Element not found");
		}
		
		if(fruitcollection.contains("Apple")) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element not present");
		}
		
		//To print element one by one
		for(String i: fruitcollection) {
			//System.out.println(i.getClass().getName()); 
			System.out.println(i);
		}
		
		//fruit collection size
		System.out.println(fruitcollection.size()+ "\n");
		
		
		//empty or not
		System.out.println(fruitcollection.isEmpty()+ "\n");
		
		
		//print particular element
		Object[] arr = fruitcollection.toArray();
		//System.out.println(arr.getClass().getName());
		System.out.println(arr[3].getClass().getName());
		
		for(Object a: arr)
		{
			System.out.println(a);
		}
		
		//looping array using length 
		for(int j=0; j<arr.length;j++) {
			System.out.println("Array list"+ arr[j]);
		}
		
		//clearing collection
		fruitcollection.clear();
		System.out.println("Collection after cleaning" + fruitcollection);
		
		//empty or not
		System.out.println(fruitcollection.isEmpty()+ "\n");
	}

}
