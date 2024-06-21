package day10.poly.basic2;

public class House {
	
	/*멤버변수에 Student, Teacher, Employee
	private Student[] students = new Student[100]; // 멤버변수 Student로 배열 생성
	private Teacher[] teachers = new Teacher[100]; // 멤버변수 Teacher로 배열 생성
	private Employee[] employees = new Employee[100]; // 멤버변수 Employee로 배열 생성
	배열 일일이 만들어야 해서 역시나 번거로움 */
	
	
	
	
	
	
	//멤버변수에 순서대로, Person들을 저장하는 메소드
	/*
	public void checkIn(Student s) {
		
	}
	
	public void checkIn(Teacher s) {
		
	}
	
	public void checkIn(Employee s) {
		
	}
	위 방식도 번거로움 */ 
	private Person[] people = new Person [100]; 
	private int index = 0;
	public void checkIn(Person pp) {
		
		//people[0] = pp;
		//people[1] = pp;
		//people[2] = pp;
		
		people[index] = pp;
		index++; // 위에 꺼를 간단하게
	}
	
	
	// 배열에 저장된 회원의 이름을 출력함
	public void confirm() {
		for(int i=0; i<index; i++) {
			System.out.println(people[i].info());
		}
	}
	
	
	
}
