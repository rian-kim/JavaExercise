package witharrayList;

public class Customer {
	protected int customerID; //고객아이디
	protected String customerName; // 고객이름
	protected String customerGrade; //고객등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; //적립 비율
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER"; 
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 "+customerGrade+"이며, 보너스 포인트는" + bonusPoint +"입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
