package ch08;

public class CharacterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//char ch = -66; 음수는 쓸수 없다!
		//char ch = 12345678; 2바이트에 너무 크다.
		char han = '한';
		char bit = '빛';
		char ch = '\uD55C';
		char bch = '\uBE5B';
		System.out.println(han);
		System.out.println(bit);
		System.out.println((int)ch);
		System.out.println((int)bch);
		
	}

}
