package part3;


// bass class
class Bank
{
	double rateOfInerest() {
		
		return 0;
	}
	
}


class SBI extends Bank
{
	//same methode
double rateOfInerest() 
    {
		
		return 10.5;//change body
	}

}

class ICICI extends Bank
{
	//same methode
	double rateOfInerest() 
	    {
			
			return 9.5;//change body
		}
}

class AXIS extends Bank
{
	//same methode
	double rateOfInerest() 
	    {
			
			return 8.5;//change body
		}
}



public class MethodsOverridingDemo {

	public static void main(String[] args) {

		
		SBI sbi=new SBI();
		System.out.println(sbi.rateOfInerest());
		
		ICICI icici =new ICICI();
		System.out.println(icici.rateOfInerest());
		
		AXIS axis =new AXIS();
		System.out.println(axis.rateOfInerest());
		

	}

}
