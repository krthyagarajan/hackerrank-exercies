package com.training.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading {

	public static void main(String[] args) throws InterruptedException {

		StringInput input = new StringInput("Hi User. Welcome to Java Programming. Have a nice day.");
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i =0 ; i < 5; i++) {
			executor.execute(input);
		}
	}
}


class StringInput implements Runnable{
	private List<String> inputList;
	
	public StringInput(String input){
		inputList  = new ArrayList<String>(Arrays.asList(input.split("\\.")));
	}

	@Override
	public void run() {
		String currentString = null;
		if(!inputList.isEmpty()) {
			currentString = inputList.remove(0).trim();
			System.out.println(currentString + " : " + Thread.currentThread().getName());

			  synchronized(this) { try { wait(100); } catch (InterruptedException e) {
			  e.printStackTrace(); } }
			 
		}
	}
}


