package ch06;

public class VariableTest {

	public static void main(String[] args) {

		byte bnum = -128;
		
		System.out.println(bnum);
		
		int num = 1234567890;
		//int num = 12345678900;
		//10자리의 수까지는 괜찮지만 10자리수이상이 되었을때는 문제가 있다.
		System.out.println(num);

		long  lNum = 12345678900L;
		System.out.println(lNum);
	}

}
