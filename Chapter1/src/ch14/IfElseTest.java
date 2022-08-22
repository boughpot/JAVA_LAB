package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이의 나이를 써주세요.");
		int age = scanner.nextInt();
		
		if(age >= 8) {
			System.out.println("학교를 다닙니다.");
		}
		else {
			System.out.println("학교를 다니지 않습니다.");
			System.out.println("노는게 제일 좋아!");
		}
	}

}
