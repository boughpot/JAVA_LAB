package ch04;

public class Student {
	int studentID;
	String address;
	String studentName;
	
	//��ü�� ����� ��Ÿ���� ���� �޼����� �θ��ϴ�.
	public void showStudentInfo() {
		System.out.println(studentID + "�й��� �̸��� " + studentName + "�̰�, " + "�ּҴ� " + address + "�Դϴ�.");	
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	
}
