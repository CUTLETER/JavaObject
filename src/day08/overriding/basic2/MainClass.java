package day08.overriding.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); // 부모
		p.age = 20;
		p.name = "홍길동";
		System.out.println(p.info());
		
		
		
		Student s = new Student();
		s.age = 15;
		s.name = "홍길장";
		s.studentId = "123123";
		System.out.println(s.info());
		
		Employee e = new Employee();
		e.age = 60;
		e.name = "홍길강";
		e.department = "미술부";
		System.out.println(e.info());
		
		Teacher t = new Teacher();
		t.age = 80;
		t.name = "홍길망";
		t.subject = "백엔드";
		System.out.println(t.info());
		
		
		
	}
}
