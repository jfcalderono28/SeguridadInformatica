package cifradoRSA;

import java.util.Scanner;

public class CifradoCesarMetodo {
	String texto = "";
	int desplazamiento;
	String cifrado = "", descifrado = "";

	public void cifrar() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el texto a cifrar: ");
		texto = scanner.nextLine().toLowerCase();

		System.out.print("Introduce el número de posiciones a desplazar: ");
		desplazamiento = scanner.nextInt();

		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.charAt(i);
			if (letra >= 'a' && letra <= 'z') {
				letra = (char) (letra + desplazamiento);
				if (letra > 'z') {
					letra = (char) (letra - 26);
				} else if (letra < 'a') {
					letra = (char) (letra + 26);
				}
			}
			cifrado += letra;
		}

		System.out.println("El texto cifrado es: " + cifrado);
	}

	public void descifrar() {
		for (int i = 0; i < cifrado.length(); i++) {
			char letra = cifrado.charAt(i);
			if (letra >= 'a' && letra <= 'z') {
				letra = (char) (letra - desplazamiento);
				if (letra > 'z') {
					letra = (char) (letra - 26);
				} else if (letra < 'a') {
					letra = (char) (letra + 26);
				}
			}
			descifrado += letra;
		}
		System.out.println("El texto descifrado es: " + descifrado);

	}

}
