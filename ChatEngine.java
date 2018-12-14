package com;


import java.io.IOException;


public class ChatEngine {
	public void reply(String line) throws IOException {
		if(line.toLowerCase().contains("pay") || line.toLowerCase().contains("taxes")) {
			System.out.println("Pay taxes at the second floor.");
		}
		else if(line.toLowerCase().contains("certificate")) {
			System.out.println("Please see the secretary to obtain a certificate.");
		}
		else if(line.toLowerCase().contains("add")) {
			Calculator.botadd();
		}
	}
}
