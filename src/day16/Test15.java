package day16;

import java.io.IOException;

interface A����01 {
	void attack();

	void defense();
}

class A����01 implements A����01 {

	@Override
	public void attack() {
		System.out.println("������ ���� �մϴ�");

	}

	@Override
	public void defense() {
		System.out.println("������ ��� �մϴ�");

	}

}

class A����01 implements A����01 {

	@Override
	public void attack() {
		System.out.println("����Ⱑ �����մϴ�.");
	}

	@Override
	public void defense() {
		System.out.println("����Ⱑ ����մϴ�.");

	}

}

public class Test15 {

	public static void main(String[] args) throws IOException {
		
		A����01 parents = null;
		System.out.println("���� ó��� �Խ��ϴ�");
		System.out.println("1. ���� 2. ����");
		int choice = 0;
		int num = System.in.read() - 48;
		System.in.read();
		System.in.read();
		if(num == 1) {
			System.out.println("���� �����ϼ̽��ϴ�");
			parents = new A����01();
		}else {
			System.out.println("���� �����ϼ̽��ϴ�");
			parents = new A����01();
		}
		System.out.println("1. ���� 2. ���");
		choice = System.in.read() - 48;
		if(choice == 1) {
			parents.attack();
		}else {
			parents.defense();
		}
		
	}

}
