package day16;
class Aclass{
	public String getPwd() {
		return "AÅ¬·¡½º";
	}
}
class PrintClass{
	public void print(Object ob) {
		Aclass aob = (Aclass)ob;
		System.out.println(aob.getPwd());
	}
}
public class Test04 {

	public static void main(String[] args) {
		
		Aclass a = new Aclass();
		PrintClass pc = new PrintClass();
		pc.print(a);

	}

}
