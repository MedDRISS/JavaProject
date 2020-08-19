package part4;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//how to declare array list 
		//ArrayList list=new ArrayList(); // we can store any type of element
		
		//ArrayList <Integer> list=new ArrayList<Integer>(); // we can store integer element
		ArrayList <String> list=new ArrayList<String>(); // we can store string element
		
		
		//adding values to array list
		list.add("Ameni");//0
		list.add("Imen");//1
		list.add("Mohamed");//2
		list.add("Houcem");//3
		
		//list.add(100); //number
		
		//print all 
		System.out.println(list);
		
		//size of array list
		System.out.println(list.size());
		System.out.println("before removing");
		
		//remove an element
		list.remove(2);
		System.out.println(list.size());
		System.out.println(list);
		
		//insert new element
		list.add(1, "Julien");
		System.out.println(list.size());
		System.out.println("after inserting element"+list);
		
		//read values from array list using for loop
		for (String s:list)
		{
			System.out.println(s);	
		}
		
		
		/*for (Object s:list) // object can store any type of value
		{
			System.out.println(s);	
		}*/
		
		//
		
		
	}

}
