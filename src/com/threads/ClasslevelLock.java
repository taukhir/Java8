package com.threads;

public class ClasslevelLock {

	public static synchronized void m1() {
		System.out.println("Executing m1() method, executed by : " + Thread.currentThread());
	}

	public static synchronized void m2() {
		System.out.println("Executing m2() method, executed by : " + Thread.currentThread());
	}

	public static void main(String[] args) {
		System.out.println("---------------- Main Started -- ahmed ------------------");
		Thread threadOne = new ThreadOne();
		Thread threadTwo = new ThreadTwo();

		threadOne.start();
		threadTwo.start();

		System.out.println("--------------  Main Ended -- ahmed -----------");
	}

}

class ThreadOne extends Thread {

	@Override
	public void run() {
		ClasslevelLock.m1();
		ClasslevelLock.m2();
	}
}

class ThreadTwo extends Thread {

	@Override
	public void run() {
		ClasslevelLock.m2();
		ClasslevelLock.m1();
	}
}
