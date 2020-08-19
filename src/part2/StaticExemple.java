package part2;

public class StaticExemple {
	
	static int a=10; // satic variable
	int b=20; // non static
	
	static void m1()
	{
		System.out.println("this is m1- static methode");
		// no access to variable b
		//creat object
		StaticExemple se= new  StaticExemple();
		System.out.println(se.b);
	}
	
	void m2() {
		System.out.println("this is m2- non static methode");
		
	}
	
	void m3() {
		System.out.println("this is m3- non static methode");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		// static methode can acess only static stuff directly without creating object
		System.out.println(a);
		System.out.println(StaticExemple.a); // by class name
		
		m1();
		StaticExemple.m1();
		
		/*
		System.out.println(b); // incorrect because b is not static variable
		
		m2(); //incorrect because m2 is not static methode 
		*/
		
		//Static method can also acces non static stuff but throught object
		
		StaticExemple se= new  StaticExemple();
		System.out.println(se.b); // non static through object 
		se.m2(); 
		
		// call by object 
		se.m3();
		
		
		
		
	}

}
