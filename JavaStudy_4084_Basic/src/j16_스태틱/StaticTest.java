package j16_스태틱;

public class StaticTest {
	
	
	public static void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		test();
		StaticEx.name = "홍길동";
		StaticEx2.print();
	}

}
