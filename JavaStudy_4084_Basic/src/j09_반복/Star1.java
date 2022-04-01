package j09_반복;

public class Star1 {
//(숙제)
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * 
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 * 
	 *     *
	 *    **
	 *   ***
	 *  ****
	 * *****
	 * 
	 * *****
	 *  ****
	 *   ***
	 *    **
	 *     *
	 *     
	 *
	 *     *
	 *    ***
	 *   *****
	 *  *******
	 * *********           
	 *       
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
