public class MainClass {
	public static void main(String[] args) {
		// スレッド処理の対象となるオブジェクトを生成
		RunTimerThread runThread1 = new RunTimerThread();
		RunTimerThread runThread2 = new RunTimerThread();
		RunTimerThread runThread3 = new RunTimerThread();
		
		runThread1.start();
		runThread2.start();
		runThread3.start();

		RunTimerRunnableClass rTimerRunnableClass = new RunTimerRunnableClass();
		Thread thread0 = new Thread(rTimerRunnableClass);
		Thread thread4 = new Thread(rTimerRunnableClass);
		Thread thread5 = new Thread(rTimerRunnableClass);
		thread0.start();
		thread4.start();
		thread5.start();
	}
}