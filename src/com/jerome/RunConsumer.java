package com.jerome;

public class RunConsumer {
	public static void main(String[] args) {
		Consumer c = new Consumer("MyTopic");
		c.start();
	}

}
