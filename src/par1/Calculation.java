package par1;

public class Calculation {
	
	//int values
	int x=10;
	int y=20;
	//case 1
	
	void sum() {
	System.out.println((x+y));
	}
	/*
//case 2
	int sum() {
		
		return(x+y);
	}
	
	
	//case3
	void sum(int a, int b) {
		System.out.println((a+b));
	}*/
	/*
	//case4
		int sum(int a, int b) {
			return (a+b);
		}*/
	
	
	public static void main(String[] args) {

			Calculation cal = new Calculation();
		//case1
		cal.sum();
		

	}

}
