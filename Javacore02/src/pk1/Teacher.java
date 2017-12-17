package pk1;

public class Teacher {
	private String name;
	private int age;
	private Subject subject;
	
	public void teaching() {
		
	}
	
	public Subject teachingASubject() {
		return subject;
	}
	
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Teacher(Subject subject) {
		this.subject = subject;
	}
}
