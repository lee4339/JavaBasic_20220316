package j17_최상위클래스;

public class AcademyTest {

	public static void main(String[] args) {
		Academy a = new Academy();
		Academy a1 = new Academy("코리아", "부산", "IT");
		Academy a2 = new Academy("코리아", "부산", "IT");
		
		System.out.println("주소비교: " + (a1 == a2));
		System.out.println("hashcode 비교: " + (a1.hashCode() == a2.hashCode()));
		System.out.println("equals 비교: " + a1.equals(a2));
		System.out.println(a1);
		System.out.println(a2);
		

	}

}
