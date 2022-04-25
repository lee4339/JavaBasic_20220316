package j19_컬렉션.student;

import java.util.ArrayList;

public interface StudentService {
	public boolean addStudent();
	public Student getStudentByStudentCode(int studentCode);
	public ArrayList<Student> getStudents();
	public boolean updateStudent(int studentCode);
	public boolean removeStudent(int studentCode);
	
}
