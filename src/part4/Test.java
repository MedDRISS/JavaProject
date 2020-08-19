package part4;

public interface A

{
	int a=10; // by default variables in interfaces are static and final
	void m1(); // by default methodes in interfaces are abstract 
}

public class Test implements A {

	// here we can implement by methode
	 void m1() 
	 { // modifier in class by default is default
		System.out.println(a);  }
	
	public static void main(String[] args) {
		
		A a=new Test(); // creat memory for the interface because interface dont have memory by default 
		a.m1();

	}

}
