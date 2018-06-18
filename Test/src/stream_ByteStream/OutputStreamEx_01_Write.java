package stream_ByteStream;

// + OutputStream �ֿ� �޼ҵ�
// - void write(int b) throws IOException
//   ��½�Ʈ������ b�� �ش��ϴ� ���� ���
//   (ASCII �ѱ��� ���)
// - void write(byte[] b) throws IOException
//   ��½�Ʈ������ b�迭 ���
//   b.length��ŭ ����Ѵ�(������� ���鹮�ڷ� ��µ�)
// - void write(byte[] b, int off, int len) throws IOException
//   ��½�Ʈ������ b�迭�� off�ε������� len��ŭ ���




import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_01_Write {

	public static void main(String[] args) {
		
	    OutputStream os;
	    
	    os = System.out; //PrintStream(�ڽ�Ŭ����) -> OutputStream(�θ�Ŭ����)
	    
//	    os.println(); //println �޼ҵ�� �ڽ�Ŭ���� �޼ҵ��̹Ƿ� ������
	    
//	    PrintStream ps;  //PrintStream(�ڽ�Ŭ����)�� ��ü�� �����ϸ� println�޼ҵ� ��밡��
//	    ps = System.out;
//	    ps.println();
	    
	    try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(10);  //���� ASCII �ڵ� //os.write('\n');
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os!=null) os.close();  // ��½�Ʈ�� ��ȯ
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	     
	    System.out.println(" + + + ���α׷� ���� ���� + + +");  //close�޼ҵ�� ��½�Ʈ���� ������ ��� �ȵ�
	    
	}

}
