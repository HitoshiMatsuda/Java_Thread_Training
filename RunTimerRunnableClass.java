public class RunTimerRunnableClass implements Runnable {

	@Override
	public void run() {
		String className = Thread.currentThread().getName();
		System.out.println(className + "スレッドで動いています。Runnable");
	}

}
