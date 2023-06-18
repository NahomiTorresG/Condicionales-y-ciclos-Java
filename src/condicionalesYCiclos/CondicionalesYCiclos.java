package condicionalesYCiclos;
import java. util.Scanner;
public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Condicionales
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 */
		
		System.out.println("Programa para calcular la hora");
		
		
		//Equivalente al prompt en JS, se llama Scanner
		
		//var hora = prompt("mensaje")
		//Java, crea un nuevo objeto Scanner, llamalo hora y este será un nuevo objeto de la clase Scanner, que tiene los argumentos para guardar la informacion que le pasé como entrada
		Scanner valorIngresado = new Scanner(System.in);//declaro el objeto
		
		System.out.println("Por favor, ingresa una hora en un formato de 24 horas");
		
		//valor ingresado = prompt ("mensaje"); en una sola linea (declaro vaiable, asingo el prompt, y la info del prompt la guardo en esa variable
		
		int hora = valorIngresado.nextInt();  //usar la informacion del objeto
		
		//int hora = 13; //declaramos una variable
		if(hora>=0 && hora <=23) {
			System.out.println("Hora ingresada correctamente");
		
		if (hora >= 0 && hora <= 11) {
			System.out.println("Buenos días solecito");
		}else if (hora >= 12 && hora <= 18) {
			System.out.println("Buenas tardes, que calor hace");
		} else if (hora >= 19 && hora <= 24) {
			System.out.println("Buenas noches, a mimir");
		}else {
			System.out.println("Es de madrugada, no es bueno desvelarse");
		}
		
	} else {
		System.out.println("Hora mal ingresada");
	}
	valorIngresado.close();
	
	
	/*Condicional switch*/
	
	int opcion = 1;

	switch (opcion) {
	case 1:
		System.out.println("Bienvenido al servicio de reservas");
		// logica de negocio para la funcion de las reservas
		break;

	case 2:
		System.out.println("Bienvenido al servicio de check-in");
		break;

	case 3:
		System.out.println("Bienvenido al servicio de check-out");
		break;

	default:
		System.out.println("Opción inválida");
		break;
	}//cierre del switch
	
	
	
//	//Ejemplo del switch anidado
//	int entradaDato = 5;
//	
//	switch(entradaDato) {
//	case 1:
//		switch(otraOpcion) {
//		case 1:
//			System.out.println("Esta es la primera opcion del primer caso");
//			break;
//		case 2:
//			System.out.println("Esta es la ssegunda opcion del primer caso");
//			break;
//			default:
//				System.out.println("Opcion invalida");
//		}
//	}
	
	
	
	
	
	}

}
