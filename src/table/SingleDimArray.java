package table;

public class SingleDimArray {

	public static void main(String[] args) {
		int a[]= new int[5]; //declared array with size5 starting index is 0 to 4
		
		a[0]=100;
		a[1]=100;
		a[2]=100;
		a[3]=100;
		a[4]=100;
		
		//int a[]= {100,200,300,400,500}; // declare array without specifying size
		System.out.println("length of aray is : " +a.length);
		
		for (int i=0; i<=a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		// read value using enhaced for loop 
		
		for (int i:a) {
			
			System.out.println(i); //result 100,200,300
		}
		

	}

}
