package j05_연산자;

public class OperationEx6 {

	public static void main(String[] args) {
		boolean flag = true;
		boolean flag2 = false;

		System.out.println(flag && flag2 ? "AND참" :
							flag || flag2 ? "AND(거짓), OR(참)" : "AND(거짓), OR(거짓)");
		
		int score = 85;
		System.out.println(score > 89 ? "A학점" :
							score > 79 ? "B학점" :
							score > 69 ? "C학점" :
							score > 59 ? "D학점" : "F학점");
		
		
		/*
		 * select == 1 -> 덧셈
		 * select == 2 -> 뺄셈
		 * select == 3 -> 곱셈
		 * select == 4 -> 나눗셈
		 * select == 5 -> 1,2,3,4가 아닐때 0을 반환
		 */
		
		char select = '5';
		int num1 = 10;
		int num2 = 5;
		int result = 0;
		///////////////////////////////////////////////////////////////
		result = select == '1' ? num1 + num2 :
			   	 select == '2' ? num1 - num2 :
				 select == '3' ? num1 * num2 :
				 select == '4' ? num1 / num2 : 0 ;
		
		
		//////////////////////////////////////////////////////////////
		System.out.println("결과: " + result);
		//////////////////////////////////////////////////////////////
		/*
		 * score가 100 ~ 0 사이만 가능
		 * 만약 아니라면 x를 리턴
		 * score가 90이상 A
		 * score가 80이상 B
		 * score가 70이상 C
		 * score가 60이상 D
		 * score가 0~59 F
		 */
		score = 100; // -10
		char grade = ' ';
		//////////////////////////////////////////////////////////////////
		grade = score < 0 || score > 100 ? 'X' : 
				score > 89 ? 'A' :
				score > 79 ? 'B' :
				score > 69 ? 'C' :
				score > 59 ? 'D' : 'F';
		/////////////////////////////////////////////////////////////////
		System.out.println("결과: " + grade);


	}

}
