package javabook.ch05;

public class SmartTV extends Product {
	String resoluation;
	public SmartTV(String pname, int price, String resoluation ) {
		this.pname = pname;
		this.price = price;
		this.resoluation = resoluation;
	}
	@Override
	public void printExtra() {
		System.out.println("해상도: " + resoluation);
		// TODO Auto-generated method stub

	}

}
