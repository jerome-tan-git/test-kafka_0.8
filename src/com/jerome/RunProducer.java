package com.jerome;

public class RunProducer {
	public static void main(String[] args) {
		Producer c = new Producer("my-replicated-topic_1");
		c.start();
	}
}
