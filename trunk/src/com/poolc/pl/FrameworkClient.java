package com.poolc.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;



public class FrameworkClient {
	private final static FrameworkClient instance = new FrameworkClient();
	private BufferedReader br;
	private PrintWriter pw;
	
	private Socket sock;
	
	public FrameworkClient() {
		try {
		
			sock = new Socket("127.0.0.1", 10002);
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static FrameworkClient getInstance() {
		return instance;
	}
	
	public void run() {
		//do something
		
		
		
		
		
		//when sock close 
//		try {
//			br.close();
//			pw.close();
//			sock.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}


}
