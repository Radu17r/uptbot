package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

	public static void main(String[] args) throws IOException {
		System.out.println("Chat bot by Radu (not actually)");
		ChatEngine ce = new ChatEngine();
		BufferedReader readerCmd = new BufferedReader(new InputStreamReader(System.in));
		String cmd = null;
		while(true) {
			System.out.println("How may I help you?");
			cmd = readerCmd.readLine();
			ce.reply(cmd);
		}
	}
}
