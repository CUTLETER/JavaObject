package day07.import_ex;

import java.util.Scanner;

import day07.abc.Apple;
import day07.abc.Melon;

public class MainClass {

	public static void main(String[] args) {
		
		//abc패키지에 있는 Apple을 사용함
		Apple apple = new Apple(); // 패키지가 달라서 빨간줄 -> Scanner 쓸 때처럼 import 작업 해야 함
		// 동일한 이름을 가지고 있는 클래스가 많음

		Melon melon = new Melon();
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
	}
}
