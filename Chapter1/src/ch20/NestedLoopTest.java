package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		//������ 2�ܺ��� 9�ܱ��� ���
		int dan = 2; // 2������ �ʱ�ȭ
		int count = 1; //count�� 1�� �ʱ�ȭ
		
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
			//count�� �̹� 2���� �Ҷ� 9�� �Ѿ count�� �ʱ�ȭ�� ���� ������ 2�ܱ����� ������.
			while(count <= 9) { 
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
			
		}
	}

}
