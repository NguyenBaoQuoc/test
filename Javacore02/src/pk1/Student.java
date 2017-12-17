package pk1;

import java.util.ArrayList;

public class Student {
	private String name;
	private String age;
	private Subject[] subject;
	
	public void learning() {
		
	}
	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public Subject[] learningSomeSubject() {
		return subject;
	}
	
//	public ArrayList<Subject> learningSomeSubject() {
//		ArrayList<Subject> alSubject = new ArrayList<>();
//		alSubject.add(new Subject());
//		return alSubject;
//	}
}
