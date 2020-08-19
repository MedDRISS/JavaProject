package part3;

public class FinaleVariableDemo {
	//without finale we can change this value
 final	int speed=40; // final variable, we cannot change this value

	public static void main(String[] args) {
		
		FinaleVariableDemo fm=new FinaleVariableDemo();
		
		// we can change varible 40 to 100
		fm.speed=100; // compile time error because of final
		System.out.println(fm.speed);
	}

}
