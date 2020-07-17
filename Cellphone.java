package javabook.ch05;

public class Cellphone extends Product {
	String carrier;
	public Cellphone(String pname, int price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
	}
	@Override
	public void printExtra() {
		System.out.println("통신사: "+carrier);
		// TODO Auto-generated method stub

	}

}
