package part2;



	class A 
	{
		int a;
		 void display()
		 {
			 System.out.println(a);
		 }
	}
	
	
	class B extends A // B is child class, A is parent class
	{
		int b;
		void print () { System.out.println(a);}
	}
	
	
	class C extends B // Multilevel
	{
		int c;
		void show () { System.out.println(a);}
	}
	
	public class InheritanceExample {
		
		public static void main(String[] args) {
			
			//Single
			A aobj=new A();
			aobj.a=100;
			aobj.display();
			
			B bobj=new B();
			bobj.a=10; //A
			bobj.b=20; //B
			
			bobj.display();//A
			bobj.print();//B
			
			
			
			//Multilevel
			C cobj=new C();
			cobj.a=10;
			cobj.b=20;
			cobj.c=30;
			
			cobj.display();
			cobj.print();
			cobj.show();
			
			
			
			
		
			
			
			
		}
		}
	
	
	
	
	


