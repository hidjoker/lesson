package thread_Chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


public class Server {

	static Map<String , PrintWriter> idMap = new HashMap<>(); //id�� ��½�Ʈ�� ���� ��

	//���� �޼ҵ�
	public static void main(String[] args) {

		ServerSocket serv=null; // ���� ���� ����
		Socket sock = null; // ��� ���� ����
		try {
			serv = new ServerSocket(20000);

			while(true) {
				System.out.println("Listening.....");
				sock = serv.accept();
				System.out.println(sock.getInetAddress().getHostAddress()+"���� ������ �����߽��ϴ�.");
				new ClientManager(sock).start();
			}
			
		} catch (IOException e) {
			System.out.println("[����] ���� ���� ����!!");
		}
		
		
	}
	
	//Ŭ���̾�Ʈ �Ŵ��� innerclass ������
	public static class ClientManager extends Thread{
				
		private String id; // id ����ʵ�
		Socket sock=null; // sock ����
				
		//������(���� ����)
		public ClientManager(Socket sock) { 
			this.sock = sock;
		}
				
		//������
		@Override
		public void run() {
			
			BufferedReader in = null; // �Է� ��Ʈ�� �ʱ�ȭ
			
			try {
				// �Է� ��Ʈ�� ����
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			} catch (IOException e1) {
				System.out.println("[ERROR]�Է� ��Ʈ�� ���� ����");
			}
			String msg; // ���۹��� ���ڿ� �ӽ� �����
			String[] msgArr; // ID�ĺ��ϱ� ���� ���� ���ڿ� �迭
					
				try {
					while(true){
					msg = in.readLine(); //������ ���� ���ڿ� ���۹ޱ�
					if(msg.equals("����")) {  //���۹��� ���ڿ��� ���� ���
						for(String id : idMap.keySet()) {
							if(this.id==id)continue;
							idMap.get(id).println(this.id+"���� �α׾ƿ� �ϼ̽��ϴ�");
							idMap.get(id).flush();
						}
						idMap.get(id).close(); // �ش� id ��½�Ʈ�� �ڿ� ȸ��
						this.sock.close(); //�ش� id ���� ����
						idMap.remove(id); // �ش� id ������ ����						
					}else if(msg.contains("_ID_IS_")) { //���۹��� ���ڿ��� ID�ĺ��ڸ� ������ ���
						msgArr = msg.split("_ID_IS_");
						this.id=msgArr[1];
						System.out.println("idȮ�� :"+this.id);
						idMap.put(this.id, new PrintWriter(sock.getOutputStream()));
						for(String id : idMap.keySet()) {
							System.out.println("������ : "+idMap.keySet().size());
							if(this.id==id) continue;
						idMap.get(id).println(this.id +"���� �α��� �Ǿ����ϴ�");
						idMap.get(id).flush();
						}
					}else { //���۹��� ���ڿ� �о� �״�� Ŭ���̾�Ʈ ����(���)
						for(String id : idMap.keySet()) {
							if(this.id==id) continue;
							idMap.get(id).println(this.id+">>" + msg);
							idMap.get(id).flush();
						}
					}
					}
				} catch (IOException e) {
					System.out.println("[����-Ŭ���̾�Ʈ �Ŵ���]����� ������ϴ�!! ");
				}finally {
					try {
						if(in!=null) in.close();
						System.out.println(" + + + ��� ���� + + + ");		
					} catch (IOException e) {
						System.out
						.println("[ERROR] �ڿ� ȸ�� ����");
			    }

			  }
			
		   }
						
     }
    
	
		
	

	
	

	
}
