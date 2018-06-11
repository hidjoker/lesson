import java.util.Random;

public class MineGame {
	// 랜드의 행과 열
	public static final int MAX_ROW = 10;
	public static final int MAX_COL = 10;

	// 지뢰
	public static final int[][] mines = new int[MAX_ROW][MAX_COL];
	
	// 랜드
	public static final int[][] land = new int[MAX_ROW][MAX_COL];

	public MineGame() {
		initMines(10);
		initLand();
	}

	public MineGame(int cnt_mines) {
		initMines(cnt_mines);
		initLand();
	}

	public void initMines(int cnt_mines) {
		Random ran = new Random();
		while(cnt_mines > 0) {
			int row = ran.nextInt(MAX_ROW); 
			int col = ran.nextInt(MAX_COL);

			if( mines[row][col] == 0) {
				mines[row][col] = 9;
				cnt_mines--;
			}
		}
	}

	public void initLand() {
		for(int i=0; i<MAX_ROW; i++) {
			for(int j=0; j<MAX_COL; j++) {
				if(mines[i][j] != 0) {
					if(i>0)	land[i-1][j]++; //좌
					if(i<MAX_ROW-1)	land[i+1][j]++; //우
					if(j>0)	land[i][j-1]++; //상
					if(j<MAX_COL-1)	land[i][j+1]++; //하
					if(i>0 && j>0)	land[i-1][j-1]++; //좌상
					if(i>0 && j<MAX_COL-1)	land[i-1][j+1]++; //좌하
					if(i<MAX_ROW-1 && j>0)	land[i+1][j-1]++; //우상
					if(i<MAX_ROW-1 && j<MAX_COL-1)	land[i+1][j+1]++; //우하
				}
			}
		}

		for(int i=0; i<MAX_ROW; i++) {
			for(int j=0; j<MAX_COL; j++) {
				if(mines[i][j]==9)	land[i][j]=9;
			}
		}
	}

	public void print(int[][] map) {
		for(int i=0; i<MAX_ROW; i++) {
			for(int j=0; j<MAX_COL; j++) {
				System.out.printf("%3d", map[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MineGame mg = new MineGame();

		System.out.println("-----지뢰--------------");
		mg.print(mines);
		System.out.println("-----맵--------------");
		mg.print(land);
	}
}
