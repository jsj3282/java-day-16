package day16;

import java.util.Scanner;

interface ����1 {

	void ȸ������(String id);

	void ȸ��������();

}

interface ����2 {
	void �̴����̺�Ʈ����();

	void ��ü�̺�Ʈ����();
}

class A��� implements ����1 {
	
	String[] ȸ������ = new String[100];
	public int i = 0;
	@Override
	public void ȸ������(String id) {
		ȸ������[i] = id;
		i++;
		//System.out.println(i);
	}

	@Override
	public void ȸ��������() {
		System.out.println("ȸ���� ���� : " + i);
	}

}

class B��� implements ����2 {
	private String[] �̴����̺�Ʈ = new String[] {"����", "1+1"};
	private String[] ��ü�̺�Ʈ = new String[] {"����", "1+1", "����"};

	
	@Override
	public void �̴����̺�Ʈ����() {
		for (int i = 0; i < �̴����̺�Ʈ.length; i++) {
			System.out.print(�̴����̺�Ʈ[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void ��ü�̺�Ʈ����() {
		for (int i = 0; i < ��ü�̺�Ʈ.length; i++) {
			System.out.print(��ü�̺�Ʈ[i] + " ");
		}
		System.out.println();

	}

}

public class Test17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int num = 0;
		A��� aa1 = new A���();
		while (true) {
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ��������");
			System.out.println("3. �̴��� �̺�Ʈ");
			System.out.println("4. ��ü �̺�Ʈ");
			System.out.print(">>> ");
			num = input.nextInt();
			switch (num) {
			case 1:
				//A��� aa1 = new A���();
				System.out.print("ȸ�������� ���̵� �Է� : ");
				String id = input.next();
				aa1.ȸ������(id);
				break;
			case 2:
				A��� aa2 = new A���();
				aa1.ȸ��������();
				break;
			case 3:
				B��� bb1 = new B���();
				System.out.print("�̴��� �̺�Ʈ : ");
				bb1.�̴����̺�Ʈ����();
				break;
			case 4:
				B��� bb2 = new B���();
				System.out.println("��ü �̺�Ʈ : ");
				bb2.��ü�̺�Ʈ����();
				break;
			}
		}
	}

}
