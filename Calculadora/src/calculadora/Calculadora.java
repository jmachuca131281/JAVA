/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Jmachuca
 */
public class Calculadora {

	public static float resultado = 0;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione la operación:\n1. Multiplicación\n2. Suma\n3. Resta"
			+ "\n4. División\n5. Logaritmo\n6. Potensia\n7. Raiz\n8. Exponencial");
		int opt = sc.nextInt();
		System.out.println("Ingrese el primer número");
		float n1 = sc.nextFloat();
		System.out.println("Ingrese el segundo número");
		float n2 = sc.nextFloat();

		switch (opt) {
			case 1:
				multiplicar(n1, n2);
				break;
			case 2:
				suma(n1, n2);
				break;
			case 3:
				resta(n1, n2);
				break;
			case 4:
				division(n1, n2);
				break;
			case 5:
				logaritmo();
				break;
			case 6:
				potencia();
				break;
			case 7:
				raiz();
				break;
			case 8:
				exponencial();
				break;
		}
	}
	
	public static void multiplicar(float n1, float n2)
	{
		resultado = n1 * n2;
		System.out.println("La multiplicación es: " + resultado);
	}

	public static void suma(float n1, float n2)
	{
		resultado = n1 + n2;
		System.out.println("La suma es: " + resultado);
	}

	public static void resta(float n1, float n2)
	{
		resultado = n1 - n2;
		System.out.println("La resta es: " + resultado);
	}

	public static void division(float n1, float n2)
	{
		resultado = n1 / n2;
		System.out.println("La división es: " + resultado);
	}

	public static void logaritmo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		double var = sc.nextDouble();
		resultado =(float) Math.log(var);
		System.out.println("El logaritmo es: " + resultado);
	}
	
	public static void potencia()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		double var = sc.nextDouble();
		resultado = (float) Math.pow(2, var);
		System.out.println("La potencia es: " + resultado);
	}

	public static void raiz()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		double var = sc.nextFloat();
		resultado = (float) Math.sqrt(var);
		System.out.println("La raiz cuadrada es: " + resultado);
	}

	public static void exponencial()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		double var = sc.nextDouble();
		resultado = (float) Math.exp(var);
		System.out.println("El exponencial es: " + resultado);
	}
}
