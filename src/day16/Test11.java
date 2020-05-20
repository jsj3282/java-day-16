package day16;

interface Attack01{
	public abstract void attack();
}

interface Defense01{
	public abstract void defense();
}

class Unit1 implements Attack01, Defense01{
	public void unit() {
		System.out.print("unit ");
	}

	@Override
	public void defense() {
		System.out.println("방어하라");
		
	}

	@Override
	public void attack() {
		System.out.println("공격하라");
		
	}
	
}
public class Test11 {

	public static void main(String[] args) {
		
		Unit1 u1 = new Unit1();
		u1.unit();
		u1.attack();
		u1.defense();
	}

}
