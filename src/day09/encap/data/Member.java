package day09.encap.data;

public class Member {
	
	// 특정 기능을 가지지 않고 단순히 데이터를 저장하는 용도
	private String name;
	private int age;
	private String email;
	private String addr;
	private String phone;
	
	
	
	
	// 기본 생성자 빠르게 = 컨트롤 + 스페이스
	public Member() {
	
	}
	
	
	
	
	// 매개변수 포함된 일반 생성자 빠르게 만드는 법 alt + shift + s 눌러서 CuF
	public Member(String name, int age, String email, String addr, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
	}
	
	
	
	
	
	// 게터세터 빠르게 alt + shift + s 눌러서 게터세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
