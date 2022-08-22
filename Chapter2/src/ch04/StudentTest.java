package ch04;

public class StudentTest {

	public static void main(String[] args) {

		//자바에서는 객체를 사용할때 생성자를 호출해야 한다.
		Student studentLee = new Student();//studentLee는 변수, new Student()가 생성자
		//객체의 기능과 속성을 사용하기 위해서는 참조연산자. 을 사용합니다.
		studentLee.studentID = 12345;
		studentLee.studentName = "Lee";
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
