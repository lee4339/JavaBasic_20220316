package j19_컬렉션.student.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import j19_컬렉션.student.Student;

public class StudentSetMain {

	public static void main(String[] args) {
//		일번(1)[축구], 이번(2)[농구, 골프], 삼번(3)[테니스, 음악감상, 독서]
//		studentSet
		
		HashSet<Student> studentSet = new HashSet<Student>();
		
		
		Student student1 = new Student();
		student1.setName("일번");
		student1.setStudentYear(1);
		ArrayList<String> hobby1 = new ArrayList<String>();
		hobby1.add("축구");
		student1.setHobby(hobby1);
		
		Student student2 = new Student();
		student2.setName("이번");
		student2.setStudentYear(2);
		ArrayList<String> hobby2 = new ArrayList<String>();
		hobby2.add("농구");
		hobby2.add("골프");
		student2.setHobby(hobby2);
		
		Student student3 = new Student();
		student3.setName("삼번");
		student3.setStudentYear(3);
		ArrayList<String> hobby3 = new ArrayList<String>();
		hobby3.add("테니스");
		hobby3.add("음악감상");
		hobby3.add("독서");
		student3.setHobby(hobby3);
		
		studentSet.add(student1);
		studentSet.add(student2);
		studentSet.add(student3);
		
		System.out.println(studentSet);
		
		String name = "일번";
		
		Iterator<Student> iterator = studentSet.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getName().equals(name)) {
				studentSet.remove(student);
				break;
			}
		}
		System.out.println(studentSet);
		

	}

}
