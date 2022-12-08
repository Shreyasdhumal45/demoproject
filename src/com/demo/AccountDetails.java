package com.demo;

public class AccountDetails implements Runnable {
Account ac=new Account();
 
    @Override
	public void run() {
    for (int i=1;i<=5;i++){
    	
    	widamount(1000);
    	if (ac.getBalance()<=0) {
    		System.out.println(" Account is OverDrawn");
    	}
    	}
    	
    }
   
	private synchronized void widamount (int amt) {
	   
		if (amt<=ac.getBalance() ){
			System.out.println(Thread.currentThread().getName()+" is going to withdraw  " );
		
		}else {
			System.out.println("Account balance is low "+ac.getBalance());
			}
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		int bal=ac.withdraw(amt);
		System.out.println("Amount withdrawn successfully Remainig balance "+bal);
	}
	public static void main(String[] args) {
		AccountDetails ad=new AccountDetails();
		Thread th=new Thread(ad);
		th.setName("Gaurav");
		th.start();
		
//		Thread th1=new Thread(ad);
//		th1.setName("Shreyas");
//		th1.start();
	}
	}

	

