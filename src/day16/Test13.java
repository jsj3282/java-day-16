package day16;

import java.io.IOException;

interface A���� {
	void attack();

	void defense();
}

class A���� implements A���� {

	@Override
	public void attack() {
		System.out.println("������ ���� �մϴ�.");
	}

	@Override
	public void defense() {
		System.out.println("������ ��� �մϴ�.");
	}
}

class A���� implements A���� {

	@Override
	public void attack() {
		System.out.println("����Ⱑ ���� �մϴ�.");
	}

	@Override
	public void defense() {
		System.out.println("����Ⱑ ��� �մϴ�.");
	}

}

public class Test13 {

	public static void main(String[] args) throws IOException {
		
		A���� ���� = new A����();
		A���� ���� = new A����();
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1. ���� 2. ����");
		int choice = 0;
		int num = System.in.read() - 48;
		System.in.read();
		System.in.read();
		if(num == 1) {
			System.out.println("���� �����ϼ̽��ϴ�.");
		}else {
			System.out.println("������ �����ϼ̽��ϴ�.");
		}
		System.out.println("1. ���� 2. ���");
		choice = System.in.read() - 48;
		if(choice == 1 && num == 1) {
			����.attack();
		}else if(choice == 2 && num == 1) {
			����.defense();
		}
		if(choice == 1 && num == 2) {
			����.attack();
		}else if(choice == 2 && num == 2) {
			����.defense();
		}
	}

}
