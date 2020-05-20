package day16;

class Print_02<T>{
	public void display(T num1, T num2) {
		System.out.println(num1 + "," + num2);
	}
}
public class Test19 {

	public static void main(String[] args) {
		
		Print_02<String> str = new Print_02<String>();
		str.display("hello", "test");
		Print_02<Double> dou = new Print_02<Double>();
		dou.display(10.111, 20.222);
		Print_02<Integer> inte = new Print_02<Integer>();
		inte.display(10, 20);

	}

}
