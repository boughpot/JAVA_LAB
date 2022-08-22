package ch14;

public class Test {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
	
		Taxi taxi = new Taxi("잘 간다 운수");
		
		studentE.takeTaxi(taxi);//학생이 이름이 있는 택시를 탄다.

		studentE.showStudentInfo();
		taxi.showTaxiInfo();
	}
}
