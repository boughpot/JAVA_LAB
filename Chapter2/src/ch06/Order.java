package ch06;

public class Order {

	String orderNumber;
	String phoneNumber;
	String address;
	String date;
	String time;
	int price;
	String menuNumber;
	
	public void showOrderNumber() {
		System.out.println("�ֹ� ���� ��ȣ : " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ : " + phoneNumber);
		System.out.println("�ֹ� �� �ּ� : " + address);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ� �ð� : " + time);
		System.out.println("�ֹ� ���� : " + price);
		System.out.println("�޴� ��ȣ : " + menuNumber);
		
	}
}
