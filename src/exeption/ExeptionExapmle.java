package exeption;

public class ExeptionExapmle {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program in progress");
		
		int a=100;
		try {
		System.out.println(a/0);
		} catch(ArithmeticException e) {
			System.out.println("catch block");
		}
		
		String b=null;
		
		try {
			System.out.println(b.length());
			} catch(Exception e) // if we don't know the type of exception we can make Exception becz Exception is a super class of all Exception
		{
				System.out.println("catch block");
			}
		
		String x="123";
		int i=Integer.parseInt(x);// trow number exption
		
		int arr[]= new int [5];
		arr[10]=50;
			
		
		
		System.out.println("Program is completed");
		System.out.println("Program is existed");

	}

}
