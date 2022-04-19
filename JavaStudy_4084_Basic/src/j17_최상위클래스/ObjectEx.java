package j17_최상위클래스;

import j16_스태틱.Student;

public class ObjectEx {
	
	public static void main(String[] args) {
		Object obj = new Object();
		String toString = obj.toString();
		System.out.println(toString);
		
		Student student = new Student("일번");
		System.out.println(student);
		
		User user = new User(20220001, "aaaa", "1234", "일번이", "aaaa@naver.com");
		User user2 = new User(20220001, "aaaa", "1234", "일번이", "aaaa@naver.com");
		System.out.println(user == user2);
		System.out.println(user.equals(user2));
		System.out.println(user.hashCode() == user.hashCode());
		Object o = user2;
		
		
	}
	
}
