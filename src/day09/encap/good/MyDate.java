package day09.encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	
	
	/*
	 * 은닉된 변수의 값을 사용할 때는 getter / setter 를 사용함
	 *
	 * 
	 * *****setter*****
	 * 1. 은닉 변수의 값을 '저장'할 메소드
	 * 2. 생성 규칙 - 접근 제어자는 public으로 선언하고 이름은 set+멤버변수명 
	 * ex) setYear() 카멜 표기법
	 */
	
	public void setYear(int year) {
		// setter를 사용하면 유효성 검증코드를 넣을 수도 있음
		if (year<1 || year>2024) {
			System.out.println("입력값 오류");
			return;
		}
		
		this.year = year;
	}
	
	
	
	/*
	 * getter 메소드 선언
	 * 1. 은닉 변수의 값을 조회하고 반환하는 메소드
	 * 2. 접근 제어자 public 선언하고 이름은 get+멤버변수명
	 */
	
	public int getYear() {
		return year;
	}
	
	
	
	/* 문제
	 * month, day, ssn에 대한 getter, setter 생성
	 * month = 1-12 까지만
	 * day = 1-31 까지만
	 * ssn = "-" 제거하고 문자열의 길이가 13인 경우만 저장되도록
	 */
	
	
	public void setMonth(int month) {
		if (month > 0 && month <= 12 ) {
				System.out.println(month);
			}
		this.month = month;
		}
		
	
	
	
	
	
	public int getMonth() {
		return month;
	}
	
	
	
	
	
	public void setDay(int day) {
		if (day > 0 && day <= 31) {
			System.out.println(day);
		}
		this.day = day;
	}
	
	
	
	
	
	public int getDay() {
		return day;
	}
	
	
	
	
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", "");
		if (ssn.length() != 13) {
			System.out.println("입력값 오류");
		}
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return ssn;
	}


	
}
