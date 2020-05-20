package day16;

import java.util.Scanner;

interface 팀장1 {

	void 회원저장(String id);

	void 회원수보기();

}

interface 팀장2 {
	void 이달의이벤트보기();

	void 전체이벤트보기();
}

class A사람 implements 팀장1 {
	
	String[] 회원모음 = new String[100];
	public int i = 0;
	@Override
	public void 회원저장(String id) {
		회원모음[i] = id;
		i++;
		//System.out.println(i);
	}

	@Override
	public void 회원수보기() {
		System.out.println("회원의 수는 : " + i);
	}

}

class B사람 implements 팀장2 {
	private String[] 이달의이벤트 = new String[] {"할인", "1+1"};
	private String[] 전체이벤트 = new String[] {"할인", "1+1", "쿠폰"};

	
	@Override
	public void 이달의이벤트보기() {
		for (int i = 0; i < 이달의이벤트.length; i++) {
			System.out.print(이달의이벤트[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void 전체이벤트보기() {
		for (int i = 0; i < 전체이벤트.length; i++) {
			System.out.print(전체이벤트[i] + " ");
		}
		System.out.println();

	}

}

public class Test17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int num = 0;
		A사람 aa1 = new A사람();
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원수보기");
			System.out.println("3. 이달의 이벤트");
			System.out.println("4. 전체 이벤트");
			System.out.print(">>> ");
			num = input.nextInt();
			switch (num) {
			case 1:
				//A사람 aa1 = new A사람();
				System.out.print("회원가입할 아이디를 입력 : ");
				String id = input.next();
				aa1.회원저장(id);
				break;
			case 2:
				A사람 aa2 = new A사람();
				aa1.회원수보기();
				break;
			case 3:
				B사람 bb1 = new B사람();
				System.out.print("이달의 이벤트 : ");
				bb1.이달의이벤트보기();
				break;
			case 4:
				B사람 bb2 = new B사람();
				System.out.println("전체 이벤트 : ");
				bb2.전체이벤트보기();
				break;
			}
		}
	}

}
