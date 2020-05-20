package day16;

class Parents{
	public void familyName() {
		System.out.print("이");
	}
	public void name() {
		System.out.println("순신");
	}
}

class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}

class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
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
