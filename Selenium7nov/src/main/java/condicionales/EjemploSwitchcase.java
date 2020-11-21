package condicionales;

public class EjemploSwitchcase {

	public static void main(String[] args) {
		int i = 4;
		
		switch (i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
			break;
		case 2:
			System.out.println("i es dos");
			break;
		case 3:
			System.out.println("i es tres");
			break;
		default:
			System.out.println("i es mayor que 3");	
		}

	}

}
