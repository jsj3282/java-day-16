package day16;

class A{
	public void getPwd() {
		System.out.println("AŬ����");
	}
}
class B extends A{
	public void getPwd() {
		System.out.println("BŬ����");
	}
}
class C extends B{
	public void getPwd() {
		System.out.println("CŬ����");
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
