package par1;

public class ConstructorDemo {

	int x;
	int y;
	ConstructorDemo() // DEFAULT CONSTRUCTOR WITHOUT ANY PARAMETRES
	{
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a , int b ) // CONSTRUCTOR PARAMETRIZED WITH PARAMETRES
	{
		x=a;
		y=b;
	}
	
	void display () {
		
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		//ConstructorDemo cm = new ConstructorDemo();  //invoke default constructur
		
		ConstructorDemo cm= new ConstructorDemo(100,	200); //invoke PARAMETRE constructur
		cm.display();
		
		// if calling two constructor
		
		ConstructorDemo cm1= new ConstructorDemo();
		ConstructorDemo cm2= new ConstructorDemo(100,	200);
		cm1.display();
		cm2.display();
	}

}
