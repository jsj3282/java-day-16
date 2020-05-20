package day16;

import java.util.ArrayList;
import java.util.Scanner;

class Member{
	private String stNum;
	private String stName;
	private String stJumsu;
	private int kor;
	private int eng;
	private int math;
	
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStJumsu() {
		return stJumsu;
	}
	public void setStJumsu(String stJumsu) {
		this.stJumsu = stJumsu;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public boolean chkStNum(ArrayList<Member> arr) {
		for(Member m:arr) {
			if(m.getStNum().equals(this.stNum)==true){
				return true;
			}
		}return false;
	}
	public boolean searchSt(ArrayList<Member> arr, String stNum) {
		for(Member m:arr) {
			if(m.getStNum().equals(stNum)==true) {
				setStNum(stNum);
				setStName(m.getStName());
				setKor(m.getKor());
				setEng(m.getEng());
				setMath(m.getMath());
				setStJumsu(m.getStJumsu());
				return true;
			}
		}
		return false;
	}
}
public class Test24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Member> arr = new ArrayList<Member>();
		String stNum, stName, stJumsu;
		int kor, eng, math, avr;
		int num;
		boolean bl;
		while(true) {
			System.out.println("1. �л� �˻�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			Member mb = new Member();
			switch(num) {
			case 1:
				System.out.print("ã�� �л� �й� �Է� : ");
				stNum = input.next();
				bl = mb.searchSt(arr, stNum);
				if(bl == true) {
					System.out.println("�й� : " + mb.getStNum());
					System.out.println("�̸� : " + mb.getStName());
					System.out.println("���� : " + mb.getKor());
					System.out.println("����  : " + mb.getEng());
					System.out.println("���� : " + mb.getMath());
				}else {
					System.out.println("ã�� �л��� �����ϴ�!!!");
				}
				break;
			case 2:
				bl = true;
				while(bl) {
					System.out.print("�й� �Է� : ");
					stNum = input.next();
					mb.setStNum(stNum);
					bl = mb.chkStNum(arr);
					if(bl == true) {
						System.out.println("�����ϴ� �й� �Դϴ�.");
						System.out.println("�ٽ� �Է� �Ͻÿ�");
					}
				}
				System.out.print("�̸� �Է� : ");
				stName = input.next();
				System.out.print("���� ���� �Է� : ");
				kor = input.nextInt();
				System.out.print("���� ���� �Է� : ");
				eng = input.nextInt();
				System.out.print("���� ���� �Է� : ");
				math = input.nextInt();
				mb.setStName(stName);
				mb.setKor(kor);
				mb.setEng(eng);
				mb.setMath(math);
				avr = (kor + eng + math) / 3;
				if(avr >= 90) {
					mb.setStJumsu("A");
				}else if(avr >= 80) {
					mb.setStJumsu("B");
				}else if(avr >= 70) {
					mb.setStJumsu("C");
				}else if(avr >= 60) {
					mb.setStJumsu("D");
				}else {
					mb.setStJumsu("F");
				}
				arr.add(mb);
				System.out.println("���ԵǼ̽��ϴ�!!!");
				break;
			case 3:
				return;
			}
		}

	}

}
