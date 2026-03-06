package cifradoCesar;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("Introduce el mensaje: ");
		String mensaje = scan.nextLine();

		System.out.print("Introduce la clave de desplazamiento (número entero): ");
		int clave = scan.nextInt();
		scan.close();
	}

	public static String codificar(String texto, int clave) {
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);

			if (Character.isLetter(caracter)) {
				char base = Character.isLowerCase(caracter) ? 'a' : 'A';
				// Aplicamos aritmética modular para el desplazamiento
				// (caracter - base + clave) % 26 maneja el desplazamiento dentro del alfabeto
				int nuevaPosicion = (caracter - base + clave) % 26;

				// Manejo de claves negativas para descifrado
				if (nuevaPosicion < 0) {
					nuevaPosicion += 26;
				}

				resultado.append((char) (base + nuevaPosicion));
			} else {
				// Si no es una letra, se mantiene igual
				resultado.append(caracter);
			}
		}
		return resultado.toString();
	}
}
