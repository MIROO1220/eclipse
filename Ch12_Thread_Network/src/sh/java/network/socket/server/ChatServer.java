package sh.java.network.socket.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	final int PORT = 5001; // 0~1024 (well-known port)를 피해서 지정
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new ChatServer().start();
		
	}

	
	private void start() {
		try {
			// 1. server socket 생성
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			while(true) {
				System.out.println(InetAddress.getLocalHost().getHostAddress() + ":" + PORT + "에서 서버대기중...");
				
				// 2. client 요청 대기 / 요청이 오면 새로운 소켓을 다시 생성해서 통신한다.
				Socket socket = serverSocket.accept();
				System.out.println(socket.getInetAddress().getHostAddress() + "로부터 요청!!!");
				
				// 3. 입출력생성
				try(
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream()); // bridge stream없이 byte기반/문자기반 연결 가능
				){
					// 웰컴메세지 출력
					pw.println("welcome!");
					pw.flush(); // 내부버퍼가 차지 않았어도 전송! 반드시 작성

					String inMsg = null;
					while((inMsg = br.readLine()) != null) {
						if("exit".equals(inMsg)) {
							System.out.println("클라이언트가 채팅방을 떠났습니다...");
							break;
						}
						
						System.out.println("클라이언트 : " + inMsg);
						System.out.print("서버 : ");
						String outMsg = sc.nextLine();
						pw.println(outMsg);
						pw.flush();
					}
					
				} catch(Exception e) {
					System.err.println(e.getMessage());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
