package j09_반복;

public class WhileEx4 {
	
	public static void main(String[] args) {
		int dan = 0;
		
		
		
		while(dan < 8) {
			++dan;
			System.out.println((dan +1) + "단");
			int num = 0;
			
			while(num < 9) {
				int result = 0;
				result = dan * (++num);
				System.out.println((dan + 1) + " X " + num + " = " + result);
			}
			System.out.println();
		}
	}

}
