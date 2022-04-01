package j09_반복;

public class ContinueEx {

	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			if(i % 2 == 0) {
//			continue; // 만나면 밑에 있는 소스코드를 무시 / 그 다음 반복으로 진행하라
//			}
//			System.out.println(i);
//		}
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				break; // 반복문제어, 반복문에서 바로 벗어난다.
			}
			System.out.println(i);
		}

	}

}
