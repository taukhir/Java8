package com.threads;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

}

class MyThreads implements Runnable {

	String threadName;
	CyclicBarrier cb;

	MyThreads(String name, CyclicBarrier cb) {
		this.threadName = name;
		this.cb = cb;
	}

	@Override
	public void run() {
		try {

			System.out.println(threadName);
			cb.wait(); // all threads will wait here

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Finished implements Runnable {

	@Override
	public void run() {
		System.out.println("Finished ... ");
	}

}
