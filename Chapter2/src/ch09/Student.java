package ch09;

public class Student {

	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	public void setKoreaSubject(String subjectName, int score) {
		korea.subjectName = subjectName;
		korea.score = score;
	}
	public void setMathSubject(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}
	public void showScoreInfo() {
		int total = math.score + korea.score;
		System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
	}
}
