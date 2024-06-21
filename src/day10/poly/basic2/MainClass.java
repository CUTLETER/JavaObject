package day10.poly.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		/* 
		Student s1 = new Student("홍길동", 20, "123123");
		Student s2 = new Student("이순신", 30, "456456");
		Student s3 = new Student("유선화", 20, "789789");
		
		Teacher t1 = new Teacher("박진영", 10, "html");
		Teacher t2 = new Teacher("박인욱", 20, "java");
		
		Employee e1 = new Employee("배고파",20,"식사부");
		
		Student[] students = {s1,s2,s3};
		Teacher[] teachers = {t1};
		Employee[] emps = {e1};
	    위처럼 배열에 담으려면 각자 데이터 타입에 맞는 배열을 생성해야 하는 번거로움 있음
		*/
		
		
		
		// 배열의 다형성 - 타입을 통일할 수 있음 -  부모인 Person 로 형 변환 일으켜서 데이터 타입 통일하기
		Person s1 = new Student("홍길동", 20, "123123");
		Person s2 = new Student("이순신", 30, "456456");
		Person s3 = new Student("유선화", 20, "789789");
		Person t1 = new Teacher("박진영", 10, "html");
		Person t2 = new Teacher("박인욱", 20, "java");
		Person e1 = new Employee("배고파",20,"식사부");
		
		Person[] people = {s1,s2,s3,t1,t2,e1};
		
		for (Person p : people) {
			System.out.println(p.info()); // 오버라이딩된 메소드가 실행됨
			
		}
		
		System.out.println("---------------");
		
		// 매개변수에도 다형성이 적용됨
		House h = new House();
		h.checkIn(s1);
		h.checkIn(s2);
		h.checkIn(s3);
		h.checkIn(t1);
		h.checkIn(t2);
		h.checkIn(e1);
		
		h.confirm();
		
		
		
		
		
		
		
		
		
	}
}
