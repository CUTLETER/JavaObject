package day09.encap.data;

import java.util.Arrays;
import java.util.jar.Attributes.Name;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 멤버 객체 2개 만듦
		Member m = new Member("홍길동", 90, "gail", "경기도", "010");
		Member m2 = new Member();
		m2.setName("나");
		m2.setAge(20);
		m2.setEmail("hanmail");
		m2.setAddr("서울");
		m2.setPhone("970");
		
		
		// (참조 타입 Member를 담는) 객체 배열
		Member[] arr = new Member[2];
		arr[0] = m;
		arr[1] = m2;
		
		System.out.println(Arrays.toString(arr)); // 주소값이 담김
		// 담긴 값을 뽑아내려면 getter 써야 함 
		
		
		// 객체 배열을 순회
		for(int i=0; i<arr.length; i++) {
			Member member = arr[i];
			System.out.println(arr[i].getName()); // 위 아래 똑같은 표현
			System.out.println(member.getAge());
		}
		
		
		
	}

}
