package j16_스태틱;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("일번이");
		Student student2 = new Student("이번이");
		Student student3 = new Student("삼번이");
		Student student4 = new Student("사번이");
		Student student5 = new Student("오번이");
		
		student1.studentInfo();
		student2.studentInfo();
		student3.studentInfo();
		student4.studentInfo();
		student5.studentInfo();
	}
}
