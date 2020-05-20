package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

class TimerQuiz extends Thread {
	
	private Date date;
	private SimpleDateFormat simpl;
	public void setDate() {
		date = new Date();
		simpl = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
	}
	public String getDate() {
		return simpl.format(date);
	}
	public void time() {
		for(int i = 0; i < 10; i++) {
			setDate();
			String s = getDate();
			System.out.println(s);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
	}

}
