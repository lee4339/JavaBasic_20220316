package j13_배열;

public class ArrayTest {

	public static void main(String[] args) {
		String[] strArray = new String[5];
		
		strArray[0] = "java";
		strArray[1] = "c";
		strArray[2] = "python";
		strArray[3] = "html";
		strArray[4] = "javascript";
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
////////////////////////////////////////////////////////////////////////////////////////
		int[] numArray = new int[100];
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
		}
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		

	}

}
