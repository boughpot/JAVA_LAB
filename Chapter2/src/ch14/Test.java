package ch14;

public class Test {

	public static void main(String[] args) {
		
		Student studentE = new Student("Edward", 20000);
	
		Taxi taxi = new Taxi("�� ���� ���");
		
		studentE.takeTaxi(taxi);//�л��� �̸��� �ִ� �ýø� ź��.

		studentE.showStudentInfo();
		taxi.showTaxiInfo();
	}
}
