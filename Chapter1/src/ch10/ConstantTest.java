package ch10;

public class ConstantTest {
	public static void main(String[] args) {
		
		//상수는 대문자로 쓴다.
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		//MAX_NUM = 20;
		//상수는 한번 지정된 값이 변하지 않는다.
		
		System.out.println(MAX_NUM);
		//System.out.println(MIN_NUM);
		//MIN_NUM는 초기화가 되어있지 않다.
	}
}
