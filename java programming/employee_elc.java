package Lab_09_10_24;

public class employee_elc {

	public static void main(String[] args) 
	{
		Constructer_getter_cetter emp=new Constructer_getter_cetter("Lanke","Hema",596,50000,22);
		emp.calculateSalary();
		System.out.println(emp);
		System.out.println("=====================================");
		Constructer_getter_cetter emp1=new Constructer_getter_cetter("Lanke","Sundar",596,40000,-1);
		emp1.calculateSalary();
		System.out.println(emp1);
		

	}

}
