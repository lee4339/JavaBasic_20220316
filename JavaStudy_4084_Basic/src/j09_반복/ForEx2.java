package j09_반복;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.print("반복할 횟수를 입력하세요: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println(i + 1);
		}
		
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println(n - i);
		}
	}

}
