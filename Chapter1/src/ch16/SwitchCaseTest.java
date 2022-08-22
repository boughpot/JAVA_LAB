package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		System.out.println("월을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 ->
				31;
			case 2->
				28;
			case 4,6,9,11->
				30;
			default->{
				System.out.println("존재하지 않는 달입니다.");
				yield -1;//yield는 반환값;
			}
		};
		
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

}
