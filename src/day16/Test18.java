package day16;

class Print{
	public void disply(double n1, double n2) {
		System.out.println(n1 + "," + n2);
	}
	public void disply(String n1, String n2) {
		System.out.println(n1 + "," + n2);
	}
	public void disply(int n1, int n2) {
		System.out.println(n1 + "," + n2);
	}
}
public class Test18 {

	public static void main(String[] args) {
		
		Print str = new Print();
		str.disply("Hello", "test");
		Print dou = new Print();
		str.disply(10.11, 20.22);
		Print inte = new Print();
		inte.disply(10, 20);

	}

}
