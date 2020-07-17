package javabook.ch05;

// 쇼핑몰 상품 정의를 위한 추상 클래스,
// 다양한 상품 종류를 지원하려고 기본 정보 설정과 출력만 추상 클래스에서 지정하고
//추가 정보는 서브 클래스에서 구현하도록 유도한다.
public abstract class Product {
	//상품이름과 가격 변수
	String pname;
	int price;
	
	public void printDetail() {
		System.out.print("상품명: "+pname+" , ");
		System.out.print("가격: "+price+" , ");
		printExtra();
		
	}
	public abstract void printExtra();
}
