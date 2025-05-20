package Lab_7_10_2024;

public class Student_toString {
	int studentId;
	String studentName;
	int marks;
	char grade;

	public void setStudentData(int studentId, String studentName,int marks)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student_toString [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks
				+ ", grade=" + grade + "]";
	}
	public void calculateGrade()
	{
		if(this.marks>=90)
		{

			this.grade='A';
		}else if(this.marks>=80)
		{
			this.grade='B';
		}else if(this.marks>=70) {
			this.grade='C';
		}else if(this.marks>=60)
		{
			this.grade='D';
		}else
		{
			this.grade='F';
		}
	}
}
