package j07_입력;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		/*
		 * 이름: 이건호
		 * 연락처: 010-0000-0000
		 * 직업: 직업
		 * 성별: 남
		 * 나이: 00
		 * 주소: 부산광역시 사하구
		 * 이메일(email): aaaa@kakao.com
		 * 
		 * 고객의 이름은 이건호이고 직업은 직업입니다.
		 * 나이는 00이며 성별은 남성입니다.
		 * 연락처: 
		 * 주소: 
		 * 이메일:
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String name = null;
		String phone = null;
		String job = null;
		String gender = null;
		String age = null;
		//int age = 0;
		String address = null;
		String email = null;
		
//		System.out.print("이름: ");
//		name = sc.next();
//		
//		System.out.print("연락처: ");
//		phone = sc.next();
//		
//		System.out.print("직업: ");
//		job = sc.next();
//		
//		System.out.print("성별: ");
//		gender = sc.next();
		
		System.out.print("나이: ");
		//age = sc.nextInt();
		age = sc.next();
		//age = Integer.parseInt(sc.next());
//		sc.nextLine();
//		
//		System.out.print("주소: ");
//		address = sc.nextLine();
//		
//		System.out.print("이메일: ");
//		email = sc.next();
//		
//		System.out.println();
		
		System.out.println("고객의 이름은 " + name + "이고 직업은 " + job + "입니다.");
		System.out.println("나이는 " + Integer.toString((Integer.parseInt(age) + 1)) + "이며 성별은 " + gender + "입니다.");
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		System.out.println("이메일: " + email);
		
		
		

	}

}
