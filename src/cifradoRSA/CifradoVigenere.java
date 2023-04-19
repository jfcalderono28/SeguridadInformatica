package cifradoRSA;

public class CifradoVigenere {
	private final String clave;

	public CifradoVigenere(String clave) {
		this.clave = clave;
	}

	public String cifrar(String mensaje) {
		String textoCifrado = "";
		int indiceClave = 0;
		for (char c : mensaje.toCharArray()) {
			if (Character.isLetter(c)) {
				int desplazamiento = clave.charAt(indiceClave) - 'a';
				char caracterCifrado = (char) ((c - 'a' + desplazamiento) % 26 + 'a');
				textoCifrado += caracterCifrado;
				indiceClave = (indiceClave + 1) % clave.length();
			} else {
				textoCifrado += c;
			}
		}
		return textoCifrado;
	}

	public String descifrar(String textoCifrado) {
		String mensaje = "";
		int indiceClave = 0;
		for (char c : textoCifrado.toCharArray()) {
			if (Character.isLetter(c)) {
				int desplazamiento = clave.charAt(indiceClave) - 'a';
				char caracterDescifrado = (char) ((c - 'a' - desplazamiento + 26) % 26 + 'a');
				mensaje += caracterDescifrado;
				indiceClave = (indiceClave + 1) % clave.length();
			} else {
				mensaje += c;
			}
		}
		return mensaje;
	}
}
