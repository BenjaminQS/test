package com.dynamic.proxy;

import java.util.Random;

public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.println("moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	@Override
//	public void stop() {
//		System.out.println("stop...");
//		try {
//			Thread.sleep(new Random().nextInt(10000));
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//	}

}
