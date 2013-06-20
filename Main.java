import javax.swing.*;


public class Main{
	
Juego pasos=new Juego();
Dados dado=new Dados();
Dados dado2=new Dados();

DatosJugador jugador[]=new DatosJugador[4];
byte tablero[]={0,0,0,0,0,+10,0,0,0,0,0,0,0,0,+30,0,0,0,0,0,0,0,0,0,0,0,+33,0,0,0,0,0,0,-25,0,0,0,0,0,0,0,0,0,0,0,+23,0,0,0,0,0,0,0,0,-15,0,0,0,0,0,0,0,0,0,0,0,+10,0,0,0,0,0,-15,0,0,0,0,0,0,0,+20,0,0,0,0,0,0,-38,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-93,0,0,0,0,0,0,0,0,0,0,0,0,0};

byte jugadores=0,c=0;
boolean respuesta=false;


void game(){

jugadores=pasos.setJugadores();
pasos.getJugadores(jugadores);
byte ii=0;
boolean ganador=false;
Icon dados =  new ImageIcon("images/dados.gif");

for(int i=0;i<4;i++){
jugador[i]=new DatosJugador();

jugador[i].nombre="";
jugador[i].posicion=0;
jugador[i].iniciales="";
jugador[i].ganador=false;
}

for(int i=0;i<=jugadores;i++){

	 ii=(byte)(i+1);
	jugador[i].nombre=JOptionPane.showInputDialog(null,"cual es su nombre jugador "+ii+" ?");
	jugador[i].iniciales="J"+(Integer.toString(i+1)); 
}	

do{
for(int i=0;i<=jugadores;i++){
JOptionPane.showMessageDialog(null,"Turno de "+jugador[i].nombre);
respuesta=pasos.getRespuesta();
byte puntos=0;
JOptionPane.showMessageDialog(null,"Turno de "+jugador[i].nombre,"bien! ahora "+jugador[i].nombre+"tiralos dados",JOptionPane.YES_OPTION,dados);
puntos=(byte)(dado.tirada()+dado2.tirada());

	if(respuesta==true){
	jugador[i].posicion=(byte)(jugador[i].posicion+puntos); 
	jugador[i].posicion=(byte)(jugador[i].posicion+tablero[jugador[i].posicion]);
	JOptionPane.showMessageDialog(null,"bien! avanzas "+puntos);
	}

if(respuesta==false){
	jugador[i].posicion=(byte)(jugador[i].posicion-puntos); 

	JOptionPane.showMessageDialog(null,"mal retrocedes " +puntos);
}
if(jugador[i].posicion<0)
{c=(byte)(jugador[i].posicion+dado.tirada()); 
jugador[i].posicion=(byte)(jugador[i].posicion+c);
}

if(jugador[i].posicion>100)
{c=(byte)(jugador[i].posicion-100); 
jugador[i].posicion=(byte)(jugador[i].posicion-c);
System.out.println(jugador[i].iniciales+"llegaste al 100 pero retrocedes "+c);
}

if(jugador[i].posicion==100){
ganador=true; 
jugador[i].ganador=true;}

}
pasos.dibujarTablero(jugadores,jugador);
pasos.mostrarPosiciones(jugadores,jugador);
System.out.println("siguiente turno");

}while(ganador!=true);
int j=0;
while(jugador[j].ganador==false){
	j++;
}
JOptionPane.showMessageDialog(null,"felicidades "+jugador[j].nombre+" eres el ganador!");
System.out.println("felicidades "+jugador[j].nombre+" eres el ganador!");
	
	}

public static void main(String args[]){
Main juego=new Main();
juego.game();

}


}
