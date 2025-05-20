package Lab_7_10_2024;

public class Employee_tostring_elc {

	public static void main(String[] args)
	{
		Employee_toString emp =new Employee_toString();
		emp.setEmployeeData("hema", "sundar", 96, 50000, 20);
		emp.calculateSalary();
		System.out.println(emp);
	}

}
