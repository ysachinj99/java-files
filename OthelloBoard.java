public class OthelloBoard {

	private int board[][];
	final static int player1Symbol = 1;
	final static int player2Symbol = 2;
    private int movex[];
    private int movey[];

	public OthelloBoard() {
		board = new int[8][8];
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;
        movex = new int[8];
        movey = new int[8];
        movex[0]=-1;movex[1]=-1;
        movex[2]=0;movex[3]=1;
        movex[4]=1;movex[5]=1;
        movex[6]=0;movex[7]=-1;
	    movey[0]=0;movey[1]=1;
        movey[2]=1;movey[3]=1;
        movey[4]=0;movey[5]=-1;
        movey[6]=-1;movey[7]=-1;
	}

	public void print() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean move(int symbol, int x, int y){

        boolean res=false;
      
          if(board[x][y]!=0){
            return false;
          }
	      for(int i=0;i<8;i++) {
	    	int a= check(symbol,x,y,movex[i],movey[i]);
	    	 if(a!=-1) {
	    		 print(symbol,x,y,i,a);
                 board[x][y]=symbol;
	    		 res=true;
	    	 }
	      }
      
      
	      return res;
        }
    private void print(int symbol, int x, int y, int i, int count) {
        while(count!=0) {
				x=x+movex[i];
				y=y+movey[i];
				board[x][y]=symbol;
				count--;
		}	
	}
	private int check(int symbol,int x, int y, int i,int j) {
		int temp=3-symbol;
		x=x+i;
		y=y+j;
		int count=0;
		while(x>0&&y>0&&x<7&&y<7&&board[x][y]==temp) {
			x=x+i;
			y=y+j;
            if(x==8||x==-1||y==8||y==-1){
            break;
            }   
		    count++;
		}
		if(x==-1||y==-1||x==8||y==8||board[x][y]==temp||board[x][y]==0) {
			return -1;
		}
		if(count>0) {
	    	return count;
		}else {
			return -1;
		}
	}
}