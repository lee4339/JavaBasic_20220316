package j08_조건;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.print("x축 입력: ");
		x = sc.nextInt();
		System.out.println("y축 입력: ");
		y = sc.nextInt();
		String result = null;
		
		if(x == 0 && y == 0) {
			result = "원점";
		}else if(x > 0 && y > 0) {
			result = "1사분면";
		}else if(x < 0 && y > 0) {
			result = "2사분면";
		}else if(x < 0 && y < 0) {
			result = "3사분면";
		}else {
			result = "4사분면";
		}
		System.out.println(result + " 입니다.");

	}

}
