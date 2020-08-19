package part4;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//declaration
		//HashMap hm=new HashMap();
		HashMap <Integer,String> hm=new HashMap <Integer,String>();
		
		//Adiing pairs in HashMap
		hm.put(101, "Ameni");
		hm.put(102, "Imen");
		hm.put(103, "Mohamed");
		hm.put(104, "Houcem");
		
		System.out.println(hm);
		
		//Remove pairs from HashMap
		hm.remove(103); // remove by key value
		System.out.println("after removing pair"+hm);
		
		// reading pairs using for loop
		for (Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
