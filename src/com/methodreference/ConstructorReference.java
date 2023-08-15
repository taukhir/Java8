package com.methodreference;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello, Welcome to the coding arena");
	}
}
