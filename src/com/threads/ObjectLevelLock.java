package com.threads;

public class ObjectLevelLock {

	/*
	 * object level lock In object level, when two threads are working on same
	 * object then synchronized instance methods can be executed only by one thread
	 * at a time
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("---------------- Main Started -- ahmed ------------------");
		ObjectLevelLock objectLevelLock = new ObjectLevelLock();
		Thread threadOne = new Thread1(objectLevelLock);
		Thread threadTwo = new Thread2(objectLevelLock);

		threadOne.start();
		threadTwo.start();

		System.out.println("--------------  Main Ended -- ahmed -----------");

	}

	public synchronized void m1() {
		System.out.println("Executing m1() method, executed by : " + Thread.currentThread());
	}

	public synchronized void m2() {
		System.out.println("Executing m2() method, executed by : " + Thread.currentThread());
	}

}

class Thread1 extends Thread {
	ObjectLevelLock objectLevelLock = null;

	Thread1(ObjectLevelLock objectLevelLock) {
		this.objectLevelLock = objectLevelLock;
	}

	@Override
	public void run() {
		objectLevelLock.m1();
		objectLevelLock.m2();
	}
}

class Thread2 extends Thread {
	ObjectLevelLock objectLevelLock = null;

	Thread2(ObjectLevelLock objectLevelLock) {
		this.objectLevelLock = objectLevelLock;
	}

	@Override
	public void run() {
		objectLevelLock.m2();
		objectLevelLock.m1();
	}
}
