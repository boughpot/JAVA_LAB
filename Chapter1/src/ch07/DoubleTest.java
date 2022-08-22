package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		//double dnum = 3.14;
		//실수형의 double는 기본 자료형이라서, 접미사d는 생략이 가능하다.
		float fnum = 3.14F;
		//3.14만 쓰면 오류, float타입 변수에 double 타입 리터럴 저장불가함. 
		//접미사f를 꼭 같이 써야한다.
		//System.out.println(dnum);
		//System.out.println(fnum);
		double dnum = 1;
		System.out.println(dnum);
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}

}
