import java.util.Random;
import java.util.Scanner;

public class ExamenDesarrolloBFranciscoPascual {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int tamanyo = introducirTamanyoArray();
		
		int[] listaNumeros = rellenarArray(tamanyo);
		
		int suma = sumarValores(listaNumeros);
		
		double media = calcularMedia(listaNumeros, suma);
		
		int numerosMenoresQueLaMedia = contarNumerosInferiores(listaNumeros, media);
		
	}
	
	//pedimos introducir el largo del aray
	public static int introducirTamanyoArray() {
		
		System.out.println("Introduce el tamaño del array:");
		int tamanyo = sc.nextInt();
		
		return tamanyo;
	}

	//declaramos, rellenamos e imprimimos los valores del array
	public static int[] rellenarArray(int tamanyo) {
		int max = 30;
		int[] listaNumeros = new int[tamanyo];
		
		Random random = new Random();
		
		for (int i = 0; i < listaNumeros.length; i++) {
			int valor = random.nextInt(max); listaNumeros[i] = valor;
			System.out.println("Posición: " + i + " Valor: " + listaNumeros[i]);
		}
		
		return listaNumeros;
	}

	//sumamos los valores del array
	public static int sumarValores(int[] listaNumeros) {
		int suma = 0;
		
		for (int i = 0; i < listaNumeros.length; i++) { 
			suma = suma + listaNumeros[i]; 
			}
		
		System.out.println("La suma de todos los valores es: " + suma );
		
		return suma;
	}

	//calculamos la media
	public static double calcularMedia(int[] listaNumeros, int suma) {
		double media = suma/listaNumeros.length;
		System.out.println("La media es: " + media);
		
		return media;
	}

	//contamos los numeros que hay que sean menores que la media
	public static int contarNumerosInferiores(int[] listaNumeros, double media) {
		int numerosMenoresQueLaMedia = 0;
		
		for (int i = 0; i < listaNumeros.length; i++) { 
			if (listaNumeros[i] < media) 
				numerosMenoresQueLaMedia++; 
			}
		
		System.out.println("Cantidad de números inferiores a la media:" + numerosMenoresQueLaMedia);
		
		return numerosMenoresQueLaMedia;
	}

}
