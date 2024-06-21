package day10.poly.instanceof_;

public class MainClass {
	
	public static void main(String[] args) {
		

		Person s1 = new Student("홍길동", 20, "123123");
		Person t1 = new Teacher("박진영", 10, "html");
		Person e1 = new Employee("배고파",20,"식사부");
	
		
		
		
		personInfo(s1);
		personInfo(t1);
		personInfo(e1);
		
		
	}
	
	// 매개변수로 Person타입을 받는 메소드 생성
	// instanceof 키워드 학습
	public static void personInfo(Person p) { // static을 넣으니 위에 main 안에서 바로 메소드 실행 가능해짐
		
		// 캐스팅
		if(p instanceof Employee) { // p 객체가 Employee 타입을 갖고 있다면 true 반환함
			Employee e = (Employee)p;
			System.out.println("E 캐스팅 완료");
			System.out.println(e.info());
		} else if (p instanceof Student) { // p 객체가 Student 타입을 갖고 있다면 true 반환함
			Student s = (Student)p;
			System.out.println("S 캐스팅 완료");
			System.out.println(s.info());
		} else if (p instanceof Teacher) { // p 객체가 Teacher 타입을 갖고 있다면 true 반환함
			Teacher t = (Teacher)p;
			System.out.println("T 캐스팅 완료");
			System.out.println(t.info());
		}
		
		
	}
	
	
	
	
	
	
}
