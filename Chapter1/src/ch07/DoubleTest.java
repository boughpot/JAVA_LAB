package ch07;

public class DoubleTest {

	public static void main(String[] args) {
		//double dnum = 3.14;
		//�Ǽ����� double�� �⺻ �ڷ����̶�, ���̻�d�� ������ �����ϴ�.
		float fnum = 3.14F;
		//3.14�� ���� ����, floatŸ�� ������ double Ÿ�� ���ͷ� ����Ұ���. 
		//���̻�f�� �� ���� ����Ѵ�.
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
