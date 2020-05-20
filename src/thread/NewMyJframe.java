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
			label.setText(reHour + "시 " + reMinute + "분 " + reSecond + "초 사용");
			System.out.println("총 시간 : " + second);
		
	}
	
}
