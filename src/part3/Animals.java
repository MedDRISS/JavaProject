package part3;


public class Animals {
	String color="white";
	
	void eating ()
	{
		System.out.println("eating..........");
	}
	
	Animals()
	{
		System.out.println("Animals is creating");
	}
}
	class Dog extends Animals
	{
		// we can call also this overriding different body
		String color="black";
	
	//1
	/*void DiplayColors()
	{
		System.out.println(color);//black
		System.out.println(super.color);// when add super we print black and white 
	   }*/
		//2
		/*void eating()
		{
			System.out.println("eating bread ..........");
			super.eating(); // we execut the method in animal class 
		}*/
		
		Dog()
		{
			super(); // add supper - invoke parent class constructor
			System.out.println("dog is created");
		}
		
		
	
	}
	
	
		
	

