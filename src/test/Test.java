package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public class TestCollection {

	public static void circularFifoQueue() {
		// 创建两个元素的循环队列
		CircularFifoQueue<String> cirque = new CircularFifoQueue<>(5);
		cirque.add("a");
		cirque.add("b");
		cirque.add("c");
		for (String temp : cirque)
			System.out.println(temp);
		System.out.println(cirque.size());
		System.out.println(cirque.maxSize());
	}
	
	
	public static int sum(int num){
		if(num < 1)
			return 1;
		else
			return num + sum(num -1);
	}

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		
		int i = sum(5);
		System.out.println("sum :" + i);
		System.out.println(dateFormat.format(date));
		System.out.println("sum :" + i);
		
		
		Integer k = new Integer(1);
		Integer j = new Integer(1);
		if (k.equals(j) )
			System.out.println("k == j");
		else
			System.out.println("k != j");

	}
}
