package ch04;

public class Student {
	int studentID;
	String address;
	String studentName;
	
	//객체의 기능을 나타내는 것을 메서드라고 부릅니다.
	public void showStudentInfo() {
		System.out.println(studentID + "학번의 이름은 " + studentName + "이고, " + "주소는 " + address + "입니다.");	
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	
}
