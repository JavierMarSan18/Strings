package strings;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {

		try {
			Scanner entry = new Scanner(System.in);
			String menu;

			boolean condicion = true;

			do {
				System.out.println("||---------------------------||");
				System.out.println("||Seleccione una opcion:     ||");
				System.out.println("||---------------------------||");
				System.out.println("||1. Tamaño                  ||");
				System.out.println("||2. Subcadena               ||");
				System.out.println("||3. Comparar palabras       ||");
				System.out.println("||4. Comparar tamaño         ||");
				System.out.println("||5. Salir                   ||");
				System.out.println("||---------------------------||");
				System.out.print(".: ");
				menu = entry.nextLine();

				if (VerNumeric(menu) == true) {

					int op = Integer.parseInt(menu);

					if (op <= 4 || op >= 1) {

						switch (op) {
						case 1:
							TamanioCadena(entry);
							break;
						case 2:
							Subcadena(entry);
							break;
						case 3:
							CompararPalabras(entry);
							break;
						case 4:
							CompararTam(entry);
							break;
						case 5:
							condicion = false;
							break;
						}

					} else {
						continue;
					}
				} else {
					continue;
				}
			} while (condicion);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void TamanioCadena(Scanner entry) {

		String cadena;

		System.out.println("||---------------------------||");
		System.out.println("||Ingresa una cadena de texto||");
		System.out.println("||---------------------------||");
		System.out.print(".: ");
		cadena = entry.nextLine();
		System.out.println("El tamaño de la cadena es: " + cadena.length());
	}

	private static void Subcadena(Scanner entry) {
		String cadena;
		String indice = "";
		String tam = "";
		int indiceI = 0;
		int tamanio = 0;
		boolean condicion = true;

		System.out.println("||---------------------------||");
		System.out.println("||Ingresa una cadena de texto||");
		System.out.println("||---------------------------||");
		System.out.print(".: ");
		cadena = entry.nextLine();

		do {
			System.out.println("||---------------------------||");
			System.out.println("||Ingresa indice inicial     ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");

			if (indice.equals("")) {
				indice = entry.nextLine();

				if (VerNumeric(indice) == true) {

					indiceI = Integer.parseInt(indice);

					if (!(indiceI >= 0 || indiceI <= cadena.length())) {
						System.out.println("El valor ingresado es invalido");
						continue;
					}
				} else {
					indice = "";
					continue;
				}
			} else {
				System.out.println(indice);
			}

			System.out.println("||---------------------------||");
			System.out.println("||Tamaño de la subcadena     ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");
			tam = entry.nextLine();

			if (VerNumeric(tam) == true) {

				tamanio = Integer.parseInt(tam);

				if (tamanio <= (cadena.length() - indiceI)) {

					System.out.println(cadena.substring(indiceI, indiceI + tamanio));
					condicion = false;

				} else {
					System.out.println("Valor fuera de rango de la cadena");
					continue;
				}
			} else {
				System.out.println("El valor ingresado es invalido");
				continue;
			}

		} while (condicion);

	}

	private static void CompararPalabras(Scanner entry) {
		String cadena_1;
		String cadena_2;
		String menu;
		int op;
		boolean condicion = true;

		do {

			System.out.println("||---------------------------||");
			System.out.println("||¿Desea ignorar mayusculas? ||");
			System.out.println("||---------------------------||");
			System.out.println("||1. Si                      ||");
			System.out.println("||2. No                      ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");
			menu = entry.nextLine();

			if (VerNumeric(menu) == true) {
				op = Integer.parseInt(menu);

			} else {
				System.out.println("El valor ingresado es invalido");
				continue;
			}

			System.out.println("||---------------------------||");
			System.out.println("||Ingresa la primera palabra ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");
			cadena_1 = entry.nextLine();

			System.out.println("||---------------------------||");
			System.out.println("||Ingresa la segunda palabra ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");
			cadena_2 = entry.nextLine();

			switch (op) {
			case 1:

				cadena_1 = cadena_1.toLowerCase();
				cadena_2 = cadena_2.toLowerCase();

				if (cadena_1.equals(cadena_2)) {
					System.out.println("Las cadenas son iguales!!!");
				} else {
					System.out.println("Las cadenas NO son iguales!!!");
				}
				break;
			case 2:

				if (cadena_1.equals(cadena_2)) {
					System.out.println("Las cadenas son iguales!!!");
				} else {
					System.out.println("Las cadenas NO son iguales!!!");
				}
				break;
			}

			condicion = false;

		} while (condicion);
	}

	private static void CompararTam(Scanner entry) {
		String cadena_1;
		String cadena_2;
		String menu;
		int op;
		boolean condicion = true;

		do {

			System.out.println("||---------------------------||");
			System.out.println("||¿Desea ignorar espacios en ||");
			System.out.println("|| blanco?                   ||");
			System.out.println("||---------------------------||");
			System.out.println("||1. Si                      ||");
			System.out.println("||2. No                      ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");
			menu = entry.nextLine();

			if (VerNumeric(menu) == true) {
				op = Integer.parseInt(menu);

			} else {
				System.out.println("El valor ingresado es invalido");
				continue;
			}

			System.out.println("||---------------------------||");
			System.out.println("||Ingresa la primera frase   ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");
			cadena_1 = entry.nextLine();

			System.out.println("||---------------------------||");
			System.out.println("||Ingresa la segunda frase   ||");
			System.out.println("||---------------------------||");
			System.out.print(".: ");
			cadena_2 = entry.nextLine();

			switch (op) {
			case 1:

				cadena_1 = cadena_1.replace(" ", "");
				cadena_2 = cadena_2.replace(" ", "");

				if (cadena_1.length() == cadena_2.length()) {
					System.out.println("Las frases tiene el mismo tamaño!!!");
				} else {
					System.out.println("Las cadenas NO son iguales!!!");
				}
				break;
			case 2:

				if (cadena_1.length() == cadena_2.length()) {
					System.out.println("Las frases tiene el mismo tamaño!!!");
				} else {
					System.out.println("Las frases NO tiene el mismo tamaño!!!");
				}
				break;
			}

			condicion = false;

		} while (condicion);
	}

	public static boolean VerNumeric(String cadena) {
		boolean resultado;

		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException Exception) {
			resultado = false;
		}

		return resultado;
	}
}
