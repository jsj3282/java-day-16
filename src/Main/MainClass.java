package Main;

import java.util.ArrayList;
import java.util.Scanner;

class StInfo{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<StInfo> arr = new ArrayList<StInfo>();
		String name;
		while(true) {
			System.out.println("1. �̸� ���   2. �̸� Ȯ��");
			int num = input.nextInt();
			switch(num) {
			case 1:
				StInfo stinfo = new StInfo();
				System.out.print("�̸� �Է� : ");
				name = input.next();
				stinfo.setName(name);
				arr.add(stinfo);
				System.out.println("���� ��� �Ǿ����ϴ�.");
				break;
			case 2:
				for(int i = 0; i<arr.size(); i++) {
					System.out.println("�̸� : " + arr.get(i).getName());
				}
				//for(StInfo info :arr) System.out.println("�̸� : " + info.getName())
			}
		}

	}

}
