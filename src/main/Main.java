package main;

import exceptions.ExeceptionStudies;

public class Main {
	public static void main(String[] args) {
	
//------------------------------------------------------------------------		
		try {
			ExeceptionStudies.Arithmetic();
		} catch (Exception e) {
			System.out.println("ArithmeticException: "+ e.getMessage());
		}
		
//------------------------------------------------------------------------		
		try{ 
			ExeceptionStudies.arrayIndexOutOfBounds();
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException: "+ e.getMessage());
        }
        
//------------------------------------------------------------------------		
        try {
        	ExeceptionStudies.nullPointer();			
		} catch (Exception e) {
			System.out.println("NullPointerException: "+ e.getMessage());
		}
//---------------------------------------------------------------------	
        try {
        	ExeceptionStudies.NumberFormat();
		} catch (Exception e) {
			System.out.println("NumberFormatException: "+ e.getMessage());
		}
//---------------------------------------------------------------------
        try {
        	ExeceptionStudies.ClassCast();
		} catch (Exception e) {
			System.out.println("ClassCastException: "+ e.getMessage());
		}
//---------------------------------------------------------------------		
//---------------------------------------------------------------------		
//---------------------------------------------------------------------		
//---------------------------------------------------------------------		
//---------------------------------------------------------------------		
        
        
	}

}

//tratamento de erros

//Errors
//Não são exceções, mas problemas graves que geralmente não podem 
//ser tratados pelo programa, como OutOfMemoryError.
//os blocos try-catch-finally precisam estar dentro de um método 
//(ou de um bloco estático), não diretamente dentro de uma classe