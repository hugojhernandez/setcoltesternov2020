package metodos;

public class MetodoEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado =suma(4,7);
		System.out.println(resultado);
		
		int resultado2 =suma(134,14);
		System.out.println(resultado2);
		
		String marca = carro(3);
		System.out.println(marca);
	}
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	// sobrecarga de metodos
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	
	//hasta aqui sobrecarga de metodos
	
	
	public static String carro(int a) {
		String[]  cars = {"VOLVO","BMW","FORD","MAZDA"};
		return cars[a];
		
	}
}
