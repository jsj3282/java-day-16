package day16;

import java.util.ArrayList;

public class Test20 {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(123);		//����ڽ�
		arr.add("456");
		arr.add(1.123);
		int a = (int)arr.get(0);		//��ڽ�
		String st = (String)arr.get(1); 
		double dou = (double)arr.get(2);
		System.out.println(a);
		System.out.println(st);
		System.out.println(dou);

	}

}
