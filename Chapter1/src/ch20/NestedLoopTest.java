package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		//구구단 2단부터 9단까지 출력
		int dan = 2; // 2단으로 초기화
		int count = 1; //count는 1로 초기화
		
//		for( ; dan <= 9; dan++) {
//			
//			for(count = 1; count <= 9; count++) {
//				System.out.println(dan + "X" + count + "=" + dan*count);
//			}
//			System.out.println();
//		}
		
		dan = 2;
		count =1;
		while(dan <= 9) {
			
			count = 1; 
			//count가 이미 2단을 할때 9를 넘어서 count를 초기화를 하지 않으면 2단까지만 찍힌다.
			while(count <= 9) { 
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
			
		}
	}

}
