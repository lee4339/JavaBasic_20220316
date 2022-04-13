package j13_배열;

public class CustomArray {
	private String[] strArray;
	
//	public CustomArray(int arraySize) {
//		strArray = new String[arraySize];
//	}
	
	public CustomArray() {
		strArray = new String[0];
	}
	
	private void strArraySizeUp() {
		
		String[] tempstrArray = new String[strArray.length + 1];
		for(int i = 0; i < strArray.length; i++) {
			tempstrArray[i] = strArray[i];
		}
		strArray = tempstrArray;
	}
	
	public void add(String str) {
		strArraySizeUp();
		strArray[strArray.length - 1] = str;
	}

	public String[] getStrArray() {
		return strArray;
	}

}
