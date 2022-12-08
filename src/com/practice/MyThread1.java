package com.practice;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i=1;i<=10;i++) {
			try{
				Thread.sleep(2000);
			}catch(Exception e) {
			System.out.println(e);
			}
			
			
			System.out.println(i);
			
		}
	}
public static void main(String[] args) {
	MyThread1 mt=new MyThread1();
	MyThread1 mt1=new MyThread1();
	Thread th=new Thread(mt);
	Thread th1=new Thread(mt1);
	th.start();
	th1.start();
}
}
