package par1;

public class Empl {

	int eid;
	String ename;
	double sal;
	int deptno;
	String job;

	void display()
	{
		System.out.println(eid);

		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.eid=100;
		emp1.ename="Mohamed";
				emp1.sal=80.00;	
				emp1.deptno=10;
				emp1.job="test automation";
				emp1.display();
	}

}
