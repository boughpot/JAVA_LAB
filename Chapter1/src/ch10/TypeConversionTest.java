package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		/*
		 * byte bNum = 125; 
		 * int iNum = bNum; 
		 * 
		 * System.out.println(iNum);
		 * 
		 * int iNum = 125;
		 * byte bNum = (byte) iNum;
		 * 
		 * System.out.println(bNum);
		 */		
		/*
		 * double dNum = 3.14; 
		 * int iNum = (int) dNum;
		 * 
		 * System.out.println(iNum);
		 */
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int) dNum + (int)fNum; 
		//����ȯ�� �����ؼ� 1.2=1, 0.9=0
		//1+0= 1
		int iNum2 = (int) (dNum + fNum);
		//����ȯ�ϱ� ���� ���� ����
		//1.2+0.9=2.1
		//�Ǽ�2.1�� ������ ����ȯ�ϸ� 2
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum + yourNum;
		System.out.println(myNum);
	}

}
