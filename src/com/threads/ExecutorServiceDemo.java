package com.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(4);

		Future<String> msg = (Future<String>) es.submit(() -> {
			return "executed";
		});

		Future<Integer> add = es.submit(() -> {
			return 20;
		});

		System.out.println(msg.get());
		System.out.println(add.get());
	}

}
