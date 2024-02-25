/**************
 * Perro.java *
 **************/

package mascotas;

/* Clase que implementa el comportamiento de un perro */
public class Perro extends Mascota
{
	private boolean peligroso;	/* Indica si el perro es de una raza peligrosa */
	
	/* Constructor de la clase Perro */
	public Perro (String nombre, String raza, int edad, String color, boolean peligroso)
	{
		super(nombre, raza, edad, color);
		this.peligroso = peligroso;
	}
	
	/* Muestra por pantalla los datos del perro */
	@Override
	public void escribir ()
	{
		super.escribir();
		System.out.println("\tPeligroso: " + peligroso);	
	}
	
	/* Función que implementa el comportamiento de ladrar el perro */
	public void ladrar ()
	{
		System.out.println(nombre + " está ladrando...");
	}
}