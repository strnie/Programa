/****************
 * Mascota.java *
 ****************/

package mascotas;

/* Clase que implementa el comportamiento de una mascota */
public class Mascota
{
	protected String nombre;	/* Nombre de la mascota */
	protected String raza;		/* Raza de la mascota */
	protected int edad;			/* Edad de la mascota */
	protected String color;		/* Color de la mascota */

	/* Constructor de la clase Mascota */
	public Mascota (String nombre, String raza, int edad, String color)
	{
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.color = color;
	}
	
	/* Modifica el nombre de la mascota */
	public void cambiarNombre (String nombre)
	{
		this.nombre = nombre;
	}
	
	/* Devuelve el nombre de la mascota */
	public String obtenerNombre ()
	{
		return nombre;
	}
	
	/* Muestra por pantalla los datos de la mascota */
	public void escribir ()
	{
		System.out.println("\tNombre: " + nombre);
		System.out.println("\tRaza: " + raza);
		System.out.println("\tEdad: " + edad);
		System.out.println("\tColor: " + color);
	}
	
	/* Función que implementa el comportamiento de la mascota comiendo */
	public void comer ()
	{
		System.out.println(nombre + " está comiendo...");
	}
	
	/* Función que implementa el comportamiento de la mascota jugando */
	public void jugar ()
	{
		System.out.println(nombre + " está jugando...");
	}
}
