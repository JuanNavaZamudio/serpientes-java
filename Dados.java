import java.util.Random;

public class Dados 
{
byte puntos;
byte getPuntos()
{
	return puntos;
	}
void setPuntos(byte point)
{
	puntos=point;
	}

byte tirada()
{
	Random rnd=new Random();
	byte puntaje=(byte)(rnd.nextInt(6)+1);
	return puntaje;
	}
	

}
