package com.example.demo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarBookingSystemApplicationTests {

	@Test
	void contextLoads() throws InterruptedException, BrokenBarrierException {
		
		final CyclicBarrier gate = new CyclicBarrier(3);
		
		Thread t1 = new Thread(){
		    public void run(){
		        try {
					gate.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
		        //do stuff
		        System.out.println("thread 1");
		    }};
		Thread t2 = new Thread(){
		    public void run(){
		        try {
					gate.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
		        //do stuff 
		        System.out.println("thread 2");
		    }};

		t1.start();
		t2.start();
		
		gate.await();
		System.out.println("all threads started");
	}

}
