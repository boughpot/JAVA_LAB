package ch04;

public class StudentTest {

	public static void main(String[] args) {

		//�ڹٿ����� ��ü�� ����Ҷ� �����ڸ� ȣ���ؾ� �Ѵ�.
		Student studentLee = new Student();//studentLee�� ����, new Student()�� ������
		//��ü�� ��ɰ� �Ӽ��� ����ϱ� ���ؼ��� ����������. �� ����մϴ�.
		studentLee.studentID = 12345;
		studentLee.studentName = "Lee";
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
