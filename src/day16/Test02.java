package day16;

class A{
	public void getPwd() {
		System.out.println("A클래스");
	}
}
class B extends A{
	public void getPwd() {
		System.out.println("B클래스");
	}
}
class C extends B{
	public void getPwd() {
		System.out.println("C클래스");
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		A a;
		a = new B();
		a.getPwd();
		a = new C();
		a.getPwd();
	}

}
