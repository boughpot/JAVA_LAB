package ch06;
//클래스는 하나의 객체를 생성한것과 같다.
public class Student {
	
	//객체의 속성을 나타내는 것을 멤버변수(필드)라고 부릅니다. 
	//멤버변수는 파란색으로 표시됨
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}
	public Student(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
	
	
}
