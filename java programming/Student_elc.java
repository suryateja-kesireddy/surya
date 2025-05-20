package LAB_03_10_24;

public class Student_elc {

	public static void main(String[] args)
	{
	 Student std=new Student();
	 std.name="hemasundar";
	 std.rollnum=596;
	 std.age=22;
	 std.student_Details();
	 String det=std.student_Information();
	 System.out.println(det); 
	 System.out.println();
	 System.out.println();
	 
	 Student hema=new Student();
	 hema.name="hema";
	 hema.rollnum=582;
	 hema.age=21;
	 hema.student_Details();
	 String dets=hema.student_Information();
	 System.out.println(dets);
	 
	}

}
