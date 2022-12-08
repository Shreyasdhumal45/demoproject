package com.demo;

public class Demo extends Thread{
	
	int sum=0;
public void run() {
	synchronized(this) {
	for (int i=1;i<=10;i++) {
		sum=sum+10;
		
	}
	this.notify();
	}
}
	
public static void main(String[] args) throws InterruptedException {
	Demo d=new Demo();
	d.start();
	synchronized(d) {
		d.wait();
		System.out.println(d.sum);
	}
	
}
}
