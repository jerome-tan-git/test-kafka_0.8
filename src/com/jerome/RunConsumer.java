package com.jerome;

public class RunConsumer {
	public static void main(String[] args) {
		Consumer c = new Consumer("my-replicated-topic_1");
		c.start();
	}

}
