/*****************
 * Programa.java *
 *****************/

package programa;

import mascotas.*;

import java.util.Scanner;

/* Clase que implementa el comportamiento del programa */
class Programa
{
	public static void main (String[] args)
	{
		Scanner teclado;
		Perro perro;
		Gato gato;
		char claseMascota;
		String nombre;
		String raza;
		int edad;
		String color;
		boolean peligroso;
		boolean cazador;
		
		System.out.println("\t\t\tMASCOTAS");
		System.out.println("\t\t\t========");
		
		teclado = new Scanner(System.in);
		
		/* Solicitar si la mascota es un perro o un gato */
		System.out.print("\n\n¿Qué clase de mascota tienes? (P)erro / (G)ato: ");
		claseMascota = Character.toUpperCase(teclado.nextLine().charAt(0));
	
		/* Introducir los datos de la mascota */
		System.out.println("\nIntroduce los datos de tu mascota:\n");
		
		System.out.print("\tNombre: ");
		nombre = teclado.nextLine();
		System.out.print("\tRaza: ");
		raza = teclado.nextLine();		
		System.out.print("\tEdad: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		System.out.print("\tColor: ");
		color = teclado.nextLine();	
		
		if (claseMascota == 'P')
		{
			System.out.print("\t¿Es de raza peligrosa? (true/false): ");
			peligroso = teclado.nextBoolean();
			System.out.println();
			
			/* Crear un objeto de la clase Perro y utilizarlo */
			perro = new Perro (nombre, raza, edad, color, peligroso);

			perro.comer();
			perro.jugar();
			perro.ladrar();
			
			System.out.println("\nDatos de " + perro.obtenerNombre() + ":\n");
			perro.escribir();	
		}
		else
		{
			System.out.print("\t¿Caza ratones? (true/false): ");
			cazador = teclado.nextBoolean();
			System.out.println();
			
			/* Crear un objeto de la clase Gato y utilizarlo */
			gato = new Gato (nombre, raza, edad, color, cazador);
			
			gato.comer();
			gato.jugar();
			gato.maullar();
			
			System.out.println("\nDatos de " + gato.obtenerNombre() + ":\n");
			gato.escribir();
		}
	}
}