package arreglos;

public class Arreglosejem {

	public static void main(String[] args) {
	int intArray[];
	int [] intArray2;
		
	short shortArray[];
	String array[];// declaracion de array
		
		array = new String[6];//Asignado memoria para 5 array
		
		array[0] = "Cero";
		array[1] = "Uno";
		array[2] = "Dos";
		array[3] = "Tres";
		array[4] = "Cuatro";
		array[5] = "Cinco";
		
		//System.out.println("Elemento en la posición 1:" + array[1]);
		//System.out.println("Elemento en la posición 3:" + array[3]);
		
		for(int i = 0; i < array.length; i++) {	
		System.out.println("Elemento en la posición 1:"+ i + ":" + array[i]);
	}
         int[] intArrayDinamico = new int [] {10,2,5,4,3,4,12};
	}       

}
