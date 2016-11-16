package mx.com.everis.tallerjava.Tarea2arreglos;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arregloNumeros = {1,2,3,4,5,6};
		int sumaTotal = 0;
		int sumaTotalDesc = 0;
		
		for (int i=1; i<=arregloNumeros.length; i++)
		{
			System.out.print(i+",");
			sumaTotal+=i;
			
		}
		System.out.println();
		System.out.println("La suma de forma ascendente es : "+sumaTotal);
		
		for (int i = arregloNumeros.length; i>0; i--)
		{
			System.out.print(i+",");
	        sumaTotalDesc+=i;  
		}
		System.out.println();
		System.out.println("La suma de forma descendente es : "+sumaTotalDesc);

	}

}
