package ch06;

public class OrderTest {

	public static void main(String[] args) {

		Order orderA = new Order();
		
		orderA.orderNumber = "202011020003";
		orderA.phoneNumber = "01023450001";
		orderA.address = "서울시 강남구 역삼동 111-333";
		orderA.date = "20201102";
		orderA.time = "130258";
		orderA.price = 35000;
		orderA.menuNumber = "0003";
		
		orderA.showOrderNumber();
		
	}

}
