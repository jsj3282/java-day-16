package day16;

class Parents{
	public void familyName() {
		System.out.print("��");
	}
	public void name() {
		System.out.println("����");
	}
}

class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("�Ɽ");
	}
}
public class Test03 {

	public static void main(String[] args) {
		
		Parents par = new Parents();
		/*
		par.name();
		Daughter dau = new Daughter();
		dau.name();
		Son son = new Son();
		son.name();
		*/
		par.familyName();
		par.name();
		par = new Daughter();
		par.name();
		par = new Son();
		par.name();
	}

}