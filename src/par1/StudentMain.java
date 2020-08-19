package par1;

public class StudentMain {

	public static void main(String[] args) {
	
		Student stu1 = new Student(101,"jhon",'A');//ysing of constructor - add parametre
		
		//BY REFERENCE
		stu1.sid=101;
				stu1.sname="jhon";
		stu1.grade='A';
		
		//BY USING METHODS
		stu1.getValue(101,"jhon",'A');
		//By USING CONSTRUCTOR
		stu1.display();
		

	}

}
