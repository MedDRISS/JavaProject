package accesModifiers;


class A 
{
	/*private int data=20;
	private void m1() {}*/
	
	 int data=20;
	 void m1() {
		 System.out.println(data);
	 }
	
}

public class Simple {

	public static void main(String[] args) {
		
		A aobj=new A();
		aobj.data=20; // compile error time because private 
		aobj .m1(); // compile error time because private 

		aobj.data=20; 
		aobj .m1();
	}

}
