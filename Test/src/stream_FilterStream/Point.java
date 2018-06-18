package stream_FilterStream;

import java.io.Serializable;

@SuppressWarnings("serial") //Point 클래스에 Serial관련 경고문을 무시
public class Point implements Serializable{
//직렬화 시키려는 클래스에 Serializable인터페이스를 구현해야 직렬화가능
	
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
