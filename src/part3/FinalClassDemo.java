package part3;

final class Bike1  // add final - so we cannot extends into child class
{
	int speed=40;
	void run()  
	 {
		System.out.println("Speed");
		}
}

class Honda extends Bike1 //compile time error
{
	 
}

public class FinalClassDemo {

	public static void main(String[] args) {
		

	}

}
