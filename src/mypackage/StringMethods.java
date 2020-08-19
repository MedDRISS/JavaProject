package mypackage;

public class StringMethods {

	public static void main(String[] args) {
	String s="welcome";
	String s1="to java";
	//length of string
	System.out.println(s.length());
	//joinning of string
	System.out.println(s.concat(s1));
	s="  welcome   ";
	
	System.out.println("Before trimming string " +s);
	//Remove space
	System.out.println("After trimming string " +s.trim());
	
	// contains() return true
	System.out.println(s.contains("wel"));
	//comparing string equals()
	s="Welcome";
	System.out.println(s.equals("Welcome"));
	System.out.println(s.equals("Wel   come"));
	System.out.println(s.equals("welcome"));
	
	//replacing cahr
	s="Welcome to java";
	System.out.println(s.replace('o', 'i'));
	System.out.println(s.replace("java", "selinuim"));
	
	//extracting substring for the main string
	s="Welcome";
	System.out.println(s.substring(0,4));
	//converting case
	s="WELCOME";
	System.out.println(s.toLowerCase());
	
	s="welcome";
	System.out.println(s.toUpperCase());
	
	
	
	}

}
