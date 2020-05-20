package day16;

import java.util.ArrayList;
import java.util.Scanner;

class StudentManage{
	 private int schoolNum;
	 private String name;
	 private int kor;
	 private int eng;
	 private int math;
	 private double average;
	 private String grade;
	 public void setGrade(double average) {
		if (average>=90) {
			this.grade = "A";
		}else if(average>=80) {
			this.grade = "B";
		}else if(average>=80) {
			this.grade = "C";
		}else if(average>=70) {
			this.grade =  "D";
		}else {
			this.grade =  "F";
		}	 
	 }
	public String getGrade() {
		return grade;
		
	}
	public int getSchoolNum() {
		return schoolNum;
	}
	public void setSchoolNum(int schoolNum) {
		this.schoolNum = schoolNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getAverage() {
		return average;
	}
	public void setAverage(int kor, int eng, int math) {
		this.average = (kor + eng + math) / 3;
	}
	 
	 
	 
 }
public class Test23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<StudentManage> studentCollection = new ArrayList<StudentManage>();
		boolean flag = true;
		while(flag) {
			System.out.println("1. �л� �˻�");
			System.out.println("2. ���");
			System.out.println("3. ����");
			System.out.print(">>>> ");
			int num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("ã�� �л� �й� �Է� : ");
				int checkNum = input.nextInt();
				for(int i=0; i < studentCollection.size(); i++) {
					if(checkNum==studentCollection.get(i).getSchoolNum()) {
						System.out.println("�й� : " + studentCollection.get(i).getSchoolNum());
						System.out.println("�̸� : " + studentCollection.get(i).getName());
						System.out.println("���� : " + studentCollection.get(i).getKor());
						System.out.println("���� : " + studentCollection.get(i).getEng());
						System.out.println("���� : " + studentCollection.get(i).getMath());
						System.out.println("��� : " + studentCollection.get(i).getAverage());
						System.out.println("��� : " + studentCollection.get(i).getGrade());
						break;
					}
				}
				break;
			case 2:
				StudentManage st = new StudentManage();
				System.out.print("�й� �Է� : ");
				int schoolNumber = input.nextInt();
				st.setSchoolNum(schoolNumber);
				System.out.print("�̸� �Է� : ");
				String name = input.next();
				st.setName(name);
				System.out.print("���� ���� �Է� : ");
				int kor = input.nextInt();
				st.setKor(kor);
				System.out.print("���� ���� �Է� : ");
				int eng = input.nextInt();
				st.setEng(eng);
				System.out.print("���� ���� �Է� : ");
				int math = input.nextInt();
				st.setMath(math);
				st.setAverage(kor, eng, math);
				st.setGrade(st.getAverage());
				studentCollection.add(st);
				System.out.println("���� �Ǽ̽��ϴ�!!!");
				break;
			case 3:
				System.out.println("���α׷� �����մϴ�!!!");
				flag = false;
			}
				
		}

	}

}
