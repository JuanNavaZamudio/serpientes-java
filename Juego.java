import javax.swing.*;
import java.util.Random;

public class Juego{

DatosJugador jugador[]=new DatosJugador[4];



static	byte setJugadores(){
	boolean flag=false;
	byte jugador=0;
	
	while(flag==false){
	jugador=Byte.parseByte(JOptionPane.showInputDialog("cuantos jugadores son? (2-4)"));
jugador--;
if((jugador>=1) && (jugador<=3))
	flag=true;
	else JOptionPane.showMessageDialog(null,"el numero de jugadores debe estar entre 2 y 4");
}
	return jugador;
}

byte getJugadores(byte jugadores){
	byte totalJugadores=0;
	return totalJugadores=jugadores;
}

static int getTirada(){
Dados dado=new Dados();
return dado.tirada();
}

boolean getRespuesta(){
	PreguntasRepuestas pregunta=new PreguntasRepuestas();
	boolean respuesta=false;
	Random generar=new Random();
	int numero=generar.nextInt(56);
	
	String []preguntas=pregunta.preguntas();
	boolean []respuestas=pregunta.repuesta();
	
	int r=JOptionPane.showConfirmDialog(null,preguntas[numero],"???",JOptionPane.YES_NO_OPTION);
	if(JOptionPane.YES_OPTION==r)
	   respuesta=true;
	   
	 if(respuesta==respuestas[numero])
		respuesta=true;
		
		return respuesta;
	 
	}
	/*
	void dibujarTablero(byte jugadores, DatosJugador jugador[]){
				for(byte i=0;i<=5;i++){
			int c=100, d=81, e=0, f=0;
			
			e=d+10;
			while(c>=e){
				System.out.print("("+c);
				for(byte j=0;i<=jugadores;i++){
				if(jugador[j].posicion==c)
					System.out.print(jugador[j].iniciales);
					else
					System.out.print("  ");
				}
				System.out.print(")");
				c--;
				}
				System.out.print("\n");
				c=c-20;
			
			f=c+10;
			while(d<=f){
				System.out.print("("+c);
				for(byte j=0;i<=jugadores;i++){
				if(jugador[j].posicion==d)
					System.out.print(jugador[j].iniciales);
					else
					System.out.print("  ");
				}
				System.out.print(")");
				d++;
				}
				System.out.print("\n");
				d=d-20;
			}
		}
*/
		void dibujarTablero(byte jugadores, DatosJugador jugador[]){
			byte j=0;
			while(j<100){
			for (byte i=0;i<10;i++){
				if(j<9)
				System.out.print("( "+(j+1));
					else
						System.out.print("("+(j+1));
				
				for(int k=0;k<=jugadores;k++){
				if(jugador[k].posicion==j)
					System.out.print(jugador[k].iniciales);
					else
					System.out.print("  ");
				}
				System.out.print(")");
				j++;
			}
			System.out.print("\n");
			
		}

		}

	void mostrarPosiciones(byte jugadores, DatosJugador jugador[]){
		for(byte i=0;i<=jugadores;i++){
		System.out.println(jugador[i].nombre+" está en la posicion "+(jugador[i].posicion+1));
		}
		}
}
