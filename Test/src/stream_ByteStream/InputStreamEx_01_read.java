package stream_ByteStream;

// + 입출력, Input / Output, I/O
//  - 프로그램이 입력장치, 출력장치와 데이터 송/수신을 하는 것
//
// + 스트림, Stream
//  - 통로, 흐름
//  - SW적인 장치
//  - 입출력 장치와 프로그램이 데이터를 교환할 수 있도록 제공되는 통로
//  - System.in , System.out
//  - 단방향
//  - FIFO 구조로 이루어져있다(Queue)
//  - 바이트단위로 동작한다
//  - 버퍼를 가지고 있다
//  ** 버퍼, Buffer
//     스트림 안에 포함되어있으며 I/O 장치와 프로그램 간의
//    처리속도 차이를 줄이기 위해 사용된다
//
//  + 스트림 분류
//  - 입력 스트림 : 입력 장치와 연결된 스트림
//  - 출력 스트림 : 출력 장치와 연결된 스트림
//  - 1차 스트림 : 입출력 장치와 직접 연결되는 스트림
//  - 2차 스트림 : 1차 스트림과 연결되는 스트림
//  - 바이트 스트림 : 바이트(1B) 단위로 입출력하는 스트림 
//  - 문자 스트림 : 문자(char, 2B) 단위로 입출력하는 스트림
//  - 보조 스트림 : 직접적인 입출력 기능은 없지만 다른 스트림의 기능을 향상시킬 수 있도록 
//                   도와주는 스트림(ex 2차 스트림)



// + InputStream의 주요 메소드
// - int read() throws IOException
//     입력스트림에서 1Byte를 읽어들인다
//     읽은 데이터의 ASCII를 int형으로 반환
// - int read(byte[] b) throws IOException
//     입력스트림에서 b배열의 최대 크기만큼 읽어들인다
//     읽은 데이터를 b배열의 처음부터 기록한다
//     읽은 데이터의 길이를 int형으로 반환한다
// - int read(byte[] b, int off, int len) throws IOException
//     입력스트림에서 len만큼 읽어들인다
//     읽은 데이터를 b배열의 off 인덱스부터 기록한다
//     읽은 데이터의 길이를 int형으로 반환한다

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01_read {
	public static void main(String[] args) {
		
	   
		InputStream is;
		is = System.in; //System.in 자바 표준 입력스트림(키보드와 연결)
		
		StringBuffer sb = new StringBuffer();
		
		int in;
		System.out.println("입력대기중...");
		
		try {
			while((in = is.read())!= -1) { //입력버퍼의 내용이 없으면 -1을 반환 ex) ABC = 65 66 67 -1
				//키보드 입력은 스트림의 끝이 없어서 콘솔에 ctrl+z EOF(입력의끝 스트림의끝) 강제 입력
				//read는 바이트(Byte) 스트림으로 1바이트씩 전송하기때문에 한글이 깨짐. 캐릭터 스트림으로 해줘야 함. 문자외에는 바이트 스트림이 유리 
				sb.append((char)in);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) //close메소드의 null포인트 예외처리
				is.close(); //throws 메소드 예외처리
			} catch (IOException e) {
				e.printStackTrace();
			} 
			//입력스트림 종료 및 자원회수(키보드 입력은 자동적으로 됨)
			

		}
		
		System.out.println("입력결과 : "+sb);		
		
		
		
		
		
		
	}

}
