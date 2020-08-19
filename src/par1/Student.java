package par1;

public class Student {
	int sid;
	String sname;
	char grade;
	//assign value to variable by using reference
	void getValue(int id, String name, char g) {
		
		sid=id;
		sname=name;
		grade=g;
	}
	
	//assign value to variable by using constructor
Student(int id, String name, char g) {
		
		sid=id;
		sname=name;
		grade=g;
	}

//by using Method

void display()
{
	System.out.println(sid+""+sname+""+grade);
}


	

}
