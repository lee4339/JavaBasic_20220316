package j16_스태틱.loopController;

import java.util.Scanner;

public class Main {
	public static boolean flag = true; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(FlagController.flag) {
			int input = sc.nextInt();
			if(input == 1) {
				System.out.println("계속 반복");
			}else if(input == 2){
				System.out.println("반복 중지");
				FlagController.changeFlag();
			}else {
				System.out.println("다시 입력");
			}
				
		}
		System.out.println("프로그램 종료");

	}

}
