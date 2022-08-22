package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		//return 값이 없어서 만약 불러지면 이름이 없고, 나이가 1인 값이 나오게
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		
		System.out.println(name + ", " + age);
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
	}
}
