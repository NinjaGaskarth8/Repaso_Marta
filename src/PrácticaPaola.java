import java.util.Scanner;

public class PrácticaPaola {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int opcion = 0;
		float op1 = 0.0f, op2 = 0.0f;

		do {
			System.out.println("Calculator 3000: \n" + "1º) Suma \n" + "2º) Resta \n" + "3º) Multiplicación \n"
					+ "4º) División \n" + "5º) Salir \n");

			opcion = ent.nextInt();

			if (opcion >= 1 && opcion <= 4) {
				System.out.println("Introduce un número:");
				op1 = ent.nextFloat();
				System.out.println("Introduce el otro número:");
				op2 = ent.nextFloat();
			}

			switch (opcion) {
			case 1:
				sumar(op1, op2);
				break;
			case 2:
				restar(op1, op2);
				break;
			case 3:
				break;
			case 4:
				dividir(op1, op2);
				break;
			case 5:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 5);

	}



}
