package com.thread;

public class Test_Thread {
	public static void main(String[] args) {
		System.out.println("Test_Thread->start...");
		
		Thread taskTable1=new Thread(new TaskTable());
		taskTable1.setName("TaskTable-One");
		taskTable1.start();
		
		Thread taskTable2=new Thread(new TaskTable());
		taskTable2.setName("TaskTable-Two");
		taskTable2.start();
		
		Thread taskTable3=new Thread(new TaskTable());
		taskTable3.setName("TaskTable-Three");
		taskTable3.start();
		
		System.out.println("Test_Thread->end...");
	}
}

class TaskTable implements Runnable{
	@Override
	public void run() {
		for(int index=0;index<=10;index++) {
			System.out.println(Thread.currentThread().getName()+"->executing..."+index);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
