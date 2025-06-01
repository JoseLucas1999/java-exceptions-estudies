package br.com.lucas.exceptions.unchecked;

import java.util.Scanner;

public class UncheckedStudies {

//------------------------------------------------------------------------	
//	ArrayIndexOutOfBoundsException
	public static void arrayIndexOutOfBounds() {
		int[] numeros = { 1, 2, 3 };
		System.out.println(numeros[5]);
	}

//------------------------------------------------------------------------	
//	NullPointerException
	public static void nullPointer() {
		Object ob = null;
		System.out.println(ob.toString()); // there are not ob to convert
	}

//	NullPointerException
	public static void nullPointer2() {
		String texto = null;
		System.out.println(texto.length());
	}

//------------------------------------------------------------------------	
//    ArithmeticException
	public static void Arithmetic() {
		int result = 10 / 0;
		System.out.println("Valor de c eh: " + result);
	}

//------------------------------------------------------------------------
//    NumberFormatException
//    Quando tentamos converter uma String para um número e ela não é um número válido.
	public static void NumberFormat() {
		String num = "abc";
		int valor = Integer.parseInt(num);
		System.out.println("Valor de parse eh: " + valor);
	}

//---------------------------------------------------------------------
//    ClassCastException
//    Quando tentamos converter (cast) um objeto para um tipo que não é compatível.
	public static void ClassCast() {
		Object obj = "sou uma string";
		Integer num = (Integer) obj;
	}
//---------------------------------------------------------------------	
//   IllegalArgumentException
//   Quando um método recebe um argumento que não faz sentido.

	public static void illegalArgument() {
		int idade = -5;

		if (idade < 0) {
			throw new IllegalArgumentException("Idade não pode ser negativa");
		}
		System.out.println("Idade igual: " + idade);

	}

//---------------------------------------------------------------------
//    IllegalStateException
//    Quando o estado de um objeto não é apropriado para a operação.

	public static void illagelState() {
		Scanner scan = new Scanner(System.in);
		scan.close();
		// Vai gerar IllegalStateException porque o Scanner já foi fechado
		scan.nextLine();
	}

//---------------------------------------------------------------------
	
	public static void callAllMethods() {
		
		try {
			UncheckedStudies.Arithmetic();
		} catch (ArithmeticException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		
		try{ 
			UncheckedStudies.arrayIndexOutOfBounds();
        }catch(ArrayIndexOutOfBoundsException e){
        	e.printStackTrace();
//        	System.out.println(e.getMessage());
        }
        
        try {
        	UncheckedStudies.nullPointer();			
		} catch (NullPointerException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
        try {
        	UncheckedStudies.NumberFormat();
		} catch (NumberFormatException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
        try {
        	UncheckedStudies.ClassCast();
		} catch (ClassCastException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
        try {
        	UncheckedStudies.illegalArgument();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
        
        try {
        	UncheckedStudies.illagelState();
		} catch (IllegalStateException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}
//-----------------------------------------------------------

}
