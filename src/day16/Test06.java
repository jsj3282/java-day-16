package day16;

import java.util.Scanner;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num = num;
	}
	public abstract void combo();
}

class NewAbstract extends Abstract{

	@Override
	public void combo() {
		System.out.println(num + "�� �޺� ���� & ���ϱ�");
		
	}
	
}
public class Test06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		NewAbstract abs = new NewAbstract();
		int num;
		System.out.print("���� Ƚ�� �Է� : ");
		num = input.nextInt();
		abs.setNum(num);
		abs.combo();

	}
	
}
