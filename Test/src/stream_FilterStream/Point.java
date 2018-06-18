package stream_FilterStream;

import java.io.Serializable;

@SuppressWarnings("serial") //Point Ŭ������ Serial���� ����� ����
public class Point implements Serializable{
//����ȭ ��Ű���� Ŭ������ Serializable�������̽��� �����ؾ� ����ȭ����
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);		
	}
	@Override
	public String toString() {
		return "Point ("+x+","+y+")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
