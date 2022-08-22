package ch06;

public class Person {

	int height;
	int weight;
	String gender;
	String PersonName;
	int age;
	
	public void showPersonInfo() {
		System.out.println("키가 " + height + "이고 몸무게가 " + weight + "킬로인 " + gender +"이 있습니다. 이름은 " + PersonName + "이고 나이는 " + age + "세입니다.");
	}
	
//	public String getPersonName() {
//		return PersonName;
//	}
//	
//	public void setPersonName(String name) {
//		PersonName = name;
//	}
}
