package tictactoe;

public class Tictactoe {

	//Definicion del tablero
	public String[][] table = {
		{"\0", "\0", "\0"},
		{"\0", "\0", "\0"},
		{"\0", "\0", "\0"},
	};
	public String actualPlayer;
	public String winner;

	Tictactoe(){
	}
	public void play(int x, int y) {

		int realX = x-1;
		int realY = y-1;
		
		checkIfOutTable(realX, realY);
		checkIfEmpty(realX, realY);

		this.table[realX][realY] = actualPlayer;
	}

	public void checkIfOutTable(int x, int y){
		if(x< 0 || x > 2 || y < 0 || y > 2){
			throw new RuntimeException("La casilla esta fuera de los limites");
		}
	}

	public void checkIfEmpty(int x, int y){
		if(this.table[x][y] != "\0"){
			throw new RuntimeException("La casilla esta llena");
		}
	}

	public String nextPlayer() {
		if(this.actualPlayer == null){
			actualPlayer = "X";
			return actualPlayer;
		}
		switch (this.actualPlayer) {
			case "X":
				actualPlayer = "O";
				break;
			
			case "O":
				actualPlayer = "X";
				break;
		}
		return actualPlayer;
	}

	public String checkWinner(){
		//revision de las filas
		for (int i = 0; i < table.length; i++) {

			if(this.table[i][0]== this.table[i][1] && 
				this.table[i][1]== this.table[i][2]&& 
				this.table[i][0] != "\0"){
				winner = this.table[i][0];
				return winner;
			}
		}

		//revision de columnas
		for (int i = 0; i < table.length; i++) {

			if(this.table[0][i]== this.table[1][i] && 
				this.table[1][i]== this.table[2][i] && 
				this.table[0][i] != "\0"){
				winner = this.table[0][i];
				return winner;
			}
		}

		//diagonal superior
		if(this.table[0][0] == this.table[1][1] &&
			this.table[2][2] == this.table[1][1]&& 
			this.table[0][0] != "\0"
		){
			winner  = this.table[1][1];
			return winner;
		}

		if(this.table[0][2] == this.table[1][1] &&
			this.table[2][0] == this.table[1][1]&& 
			this.table[0][2] != "\0"
		){
			winner  = this.table[1][1];
			return winner;
		}

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if(this.table[i][j] != "\0"){
					winner = "D";
				}
				else{
					winner = null;
					return winner;
				}
			}
		}

		return winner;
	}

	public void printTable(){
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				if(this.table[i][j] == "\0"){
					System.out.print("\t");
					continue;
				}
				System.out.print(this.table[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
