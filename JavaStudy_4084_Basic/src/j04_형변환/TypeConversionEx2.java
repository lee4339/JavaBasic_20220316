package j04_형변환;

public class TypeConversionEx2 {

	public static void main(String[] args) {
		// 최저 9160원
		// 4주 근무
		// 1, 3 주는 3일 근무 
		// 2, 4 주는 5일 근무
		// 3, 4 주는 시급의 5%를 더 추가한다.
		// 하루 8시간
		
		// 월급을 구하시오.
		
		final int HOURLY_WAGE = 9160;
		int monthlyPay = 0;
		double b = HOURLY_WAGE * 0.05;
		
		// 이건호 직원의 월급은 0000원입니다.
		// 시급 * 시간 * 일수
		double w1;
		double w2;
		double w3;
		double w4;
		
		w1 = 8 * 3 * HOURLY_WAGE;
		w2 = 8 * 5 * HOURLY_WAGE;
		w3 = 8 * 3 * (HOURLY_WAGE + b);
		w4 = 8 * 5 * (HOURLY_WAGE + b);
		monthlyPay = ((int)((w1 + w2 + w3 + w4) / 10)) * 10;
		
		System.out.println("이건호 직원의 월급은" + monthlyPay + "원 입니다.");
		
	}

}
