public class RunTimerThread extends Thread {
	String className = getName();

	public void run() {

		System.out.println(className + "スレッドで動いています。");

	}
}