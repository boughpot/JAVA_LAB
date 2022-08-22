package ch04;

public class BinaryTest {

	public static void main(String[] args) {
	
		int num = 10;
		int bNum = 0B1010; //binary 2진수로 10
		int oNum = 012;//8진수로 10, 12로 그냥 쓰면 12로 읽을수도 있으니 0을 앞에 붙여야한다.
		int xNum = 0XA;//16진수로 10, A=10
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
