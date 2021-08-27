package tarea.ajedrez;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rey reyNegro = new Rey ();
		reyNegro.setColor ("Negro");
		
		Rey reyBlanco = new Rey ();
		reyNegro.setColor ("Blanco");
		
		Reina reinaNegra = new Reina ();
		reinaNegra.setColor ("Negro");
		
		Reina reinaBlanca = new Reina ();
		reinaBlanca.setColor ("Blanca");
		
		Alfil alfilNegro = new Alfil ();
		alfilNegro.setColor ("Negro");
		
		Alfil alfilBlanco = new Alfil ();
		alfilBlanco.setColor ("Blanco");
		
		Caballo caballoNegro = new Caballo ();
		caballoNegro.setColor ("Negro");
		
		Caballo caballoBlanco = new Caballo ();
		caballoBlanco.setColor ("Blanco");
		
		Torres torresNegro = new Torres();
		torresNegro.setColor("Negro");
		
		Torres torresBlanco = new Torres();
		torresBlanco.setColor("Blanco");
		
		Peon peonNegro = new Peon();
		peonNegro.setColor("Negro");
		
		
		Peon peonBlanco = new Peon();
		peonBlanco.setColor("Blanco");
		
		Main tablero[][] = new Main[8][8];
		tablero[0][0]=torresNegro;
		tablero[0][1]=caballoNegro;
		tablero[0][2]=alfilNegro;
		tablero[0][3]=reinaNegra;
		tablero[0][4]=reyNegro;
		tablero[0][5]=alfilNegro;
		tablero[0][6]=caballoNegro;
		tablero[0][7]=torresNegro;
		tablero[1][0]=peonNegro;
		tablero[1][1]=peonNegro;
		tablero[1][2]=peonNegro;
		tablero[1][3]=peonNegro;
		tablero[1][4]=peonNegro;
		tablero[1][5]=peonNegro;
		tablero[1][6]=peonNegro;
		tablero[1][7]=peonNegro;
		
		tablero[7][0]=torresBlanco;
		tablero[7][1]=caballoBlanco;
		tablero[7][2]=alfilBlanco;
		tablero[7][3]=reinaBlanca;
		tablero[7][4]=reyBlanco;
		tablero[7][5]=alfilBlanco;
		tablero[7][6]=caballoBlanco;
		tablero[7][7]=torresBlanco;
		tablero[6][0]=peonBlanco;
		tablero[6][1]=peonBlanco;
		tablero[6][2]=peonBlanco;
		tablero[6][3]=peonBlanco;
		tablero[6][4]=peonBlanco;
		tablero[6][5]=peonBlanco;
		tablero[6][6]=peonBlanco;
		tablero[6][7]=peonBlanco;
		
	}

}
