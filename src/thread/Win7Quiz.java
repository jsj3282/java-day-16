package thread;

import java.util.HashMap;
import java.util.Scanner;

class Win7Quiz extends TimerQuiz {
	private String[] name;
	private String[] info;
	public Win7Quiz(String s, String m, String cPath, String mPath) {
		name = new String[2];
		name[0] = s;
		name[1] = m;
		info = new String[2];
		info[0] = cPath;
		info[1] = mPath;
	}
	public void function(String funcName) {
		String[] name = getName1();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for(int i = 0; i<name.length; i++) {
			map.put(name[i], info[i]);
			if(map.containsKey(funcName)) {
				System.out.println(map.get(funcName) +"��� �մϴ�.");
			}else {
				System.out.println("���� ����Դϴ�.");
			}
		}
	}
	public void funcPrint() {
		System.out.println("[��밡��] : ");
		String[] name = getName1();
		String[] info = getInfo();
		HashMap map = new HashMap();
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " ");
		}
		System.out.println();
	}
	public String[] getName1() {
		return name;
	}
	public String[] getInfo() {
		return info;
	}
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("===== ȯ���մϴ� =====");
		int sel = 0;
		String funcName = null;
		while(true) {
			System.out.println("1. ��  ��");
			System.out.println("2. off");
			System.out.print("�Է� >>>> ");
			sel = input.nextInt();
			switch(sel) {
			case 1:
				funcPrint();
				System.out.print("����� ��� �Է� : ");
				funcName = input.next();
				function(funcName);
				break;
			
			case 2:
				return;
			}
		}
	}
}
