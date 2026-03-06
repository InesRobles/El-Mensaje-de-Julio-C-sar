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
}
