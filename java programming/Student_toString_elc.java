package Lab_7_10_2024;

public class Student_toString_elc {

	public static void main(String[] args)
	{
		Student_toString std=new Student_toString();
		std.setStudentData(96, "Sundar",94);
		std.calculateGrade();
		System.out.println(std.toString());
	}

}
