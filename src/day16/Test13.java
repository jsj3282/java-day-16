package day16;

import java.io.IOException;

interface A공방 {
	void attack();

	void defense();
}

class A지상군 implements A공방 {

	@Override
	public void attack() {
		System.out.println("지상군이 공격 합니다.");
	}

	@Override
	public void defense() {
		System.out.println("지상군이 방어 합니다.");
	}
}

class A공군 implements A공방 {

	@Override
	public void attack() {
		System.out.println("비행기가 공격 합니다.");
	}

	@Override
	public void defense() {
		System.out.println("비행기가 방어 합니다.");
	}

}

public class Test13 {

	public static void main(String[] args) throws IOException {
		
		A지상군 지상군 = new A지상군();
		A공군 공군 = new A공군();
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1. 지상군 2. 공군");
		int choice = 0;
		int num = System.in.read() - 48;
		System.in.read();
		System.in.read();
		if(num == 1) {
			System.out.println("지상군 선택하셨습니다.");
		}else {
			System.out.println("공군을 선택하셨습니다.");
		}
		System.out.println("1. 공격 2. 방어");
		choice = System.in.read() - 48;
		if(choice == 1 && num == 1) {
			지상군.attack();
		}else if(choice == 2 && num == 1) {
			지상군.defense();
		}
		if(choice == 1 && num == 2) {
			공군.attack();
		}else if(choice == 2 && num == 2) {
			공군.defense();
		}
	}

}
