package thread;

class NewMyJframe extends MyJframe {
	private int second;
	static boolean FLAG = true;

	public NewMyJframe() {
		second = 0;
	}

	public void run() {
		while(FLAG) {
			second++;
			try {
				Thread.sleep(1000);
				super.setDate();
				label.setText(super.getDate());
			}catch(InterruptedException e) {}
		}
			int reHour = second / (60 * 60);
			int reSecond = second % (60 * 60);
			int reMinute = reSecond / 60;
			label.setText(reHour + "�� " + reMinute + "�� " + reSecond + "�� ���");
			System.out.println("�� �ð� : " + second);
		
	}
	
}
