package day16;

import java.io.IOException;

interface A공방01 {
	void attack();

	void defense();
}

class A지상군01 implements A공방01 {

	@Override
	public void attack() {
		System.out.println("지상군이 공격 합니다");

	}

	@Override
	public void defense() {
		System.out.println("지상군이 방어 합니다");

	}

}

class A공군01 implements A공방01 {

	@Override
	public void attack() {
		System.out.println("비행기가 공격합니다.");
	}

	@Override
	public void defense() {
		System.out.println("비행기가 방어합니다.");

	}

}

public class Test15 {

	public static void main(String[] args) throws IOException {
		
		A공방01 parents = null;
		System.out.println("적이 처들어 왔습니다");
		System.out.println("1. 지상군 2. 공군");
		int choice = 0;
		int num = System.in.read() - 48;
		System.in.read();
		System.in.read();
		if(num == 1) {
			System.out.println("지상군 선택하셨습니다");
			parents = new A지상군01();
		}else {
			System.out.println("공군 선택하셨습니다");
			parents = new A공군01();
		}
		System.out.println("1. 공격 2. 방어");
		choice = System.in.read() - 48;
		if(choice == 1) {
			parents.attack();
		}else {
			parents.defense();
		}
		
	}

}
