/**************
 * Gato.java *
 **************/

package mascotas;

/* Clase que implementa el comportamiento de un gato */
public class Gato extends Mascota
{
	private boolean cazador;	/* Indica si el gato caza ratones */
	
	/* Constructor de la clase Gato */
	public Gato (String nombre, String raza, int edad, String color, boolean cazador)
	{
		super(nombre, raza, edad, color);
		this.cazador = cazador;
	}
	
	/* Muestra por pantalla los datos del gato */
	@Override
	public void escribir ()
	{
		super.escribir();
		System.out.println("\tCazador: " + cazador);	
	}
	
	/* Función que implementa el comportamiento de maullar el gato */
	public void maullar ()
	{
		System.out.println(nombre + " está maullando...");
	}
}