package j14_추상;

/**
 * 
 * 추상(abstract)
 * 1. 추상 메소드(abstract method)
 * 접근 지정자와 반환 자료형 사이에 abstract 키워드가 존재하고 
 * 매개변수 뒤에 바로 ;(세미콜론)으로 끝나는 메소드.
 * 예) public abstract void test();
 * 
 * 2. 추상 클래스(abstract class)
 * 접근 지정자와 class 키워드 사이에 abstract 키워드가 존재하고,
 * 클래스 내부에 추상 메소드가 하나라도 정의되어 있으면 무조건 추상 클래스.
 * 
 * 
 */

public class abstractTest {

	
	public static void main(String[] args) {
		Animal animal1 = new Animal() {
			
			@Override
			public void move() {
				System.out.println("동물이 움직입니다1.");
				
			}
		};
		Animal animal2 = new Animal() {
			
			@Override
			public void move() {
				System.out.println("동물이 움직입니다2.");
				
			}
		};
		Animal animal3 = new Animal() {
			
			@Override
			public void move() {
				System.out.println("동물이 움직입니다3.");
				
			}
		};
		// 재사용 할때는 클래스를 만들어 상속, 한번만 사용할거면 익명함수
		
		Eagle e1 = new Eagle();
		Eagle e2 = new Eagle();
		Eagle e3 = new Eagle();
		
		animal1.move();
		e1.move();
		e1.eat();
		
	}
}
