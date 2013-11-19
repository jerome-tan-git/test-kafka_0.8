package com.jerome;

public class RunProducer {
	public static void main(String[] args) {
		Producer c = new Producer("MyTopic");
		c.start();
	}
}
