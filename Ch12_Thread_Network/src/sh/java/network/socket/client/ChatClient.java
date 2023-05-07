package sh.java.network.socket.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	final String SERVER_IP = "localhost";
	final int PORT = 5001;
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		new ChatClient().start();
	}

	private void start() {
		try {
			// 1. 서버소켓에 연결요청 (서버ip, port)
			System.out.println(SERVER_IP + ":" + PORT + "에 접속중...");
			Socket clientSocket = new Socket(SERVER_IP, PORT);
			
			// 2. 입출력스트림
			try(
				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
			){
				String inMsg = null;
				while((inMsg = br.readLine()) != null) {
					System.out.println("서버 : " + inMsg);
					System.out.print("클라이언트 : ");
					String outMsg = sc.nextLine();
					pw.println(outMsg);
					pw.flush();
					
					if("exit".equals(outMsg))
						break;
				}
				System.out.println("채팅을 종료합니다...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
