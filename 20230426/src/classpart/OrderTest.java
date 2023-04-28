package classpart;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderNum = 201803120001L;
		order.id = "abc123";
		order.orderDate = "2018년3월12일";
		order.name = "홍길순";
		order.proNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + order.orderNum);
		System.out.println("주문자 아이디: " + order.id);
		System.out.println("주문 날짜: " + order.orderDate);
		System.out.println("주문자 이름: " + order.name);
		System.out.println("주문 상품 번호: " + order.proNum);
		System.out.println("배송 주소: " + order.address);

	}

}
