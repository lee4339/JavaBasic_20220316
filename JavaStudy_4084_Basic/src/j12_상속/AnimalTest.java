package j12_상속;

/**
 * 
 * 오버라이딩(재정의)
 * 상속 관계에 있는 부모 클래스에서 이미 정의된 메소드를 자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의하는 것
 *
 */

public class AnimalTest {

	
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		
		h.move();
		t.move();
		
		h.readBooks();
		t.hunting();

	}	

}
