package br.com.lucas.erros;

public class ErrosStudies {
	public static void erros() {
        try {
        	stackOverflow();
		} catch (Exception e) {
			System.out.println("StackOverflowError: "+ e.getMessage());
		}
        
        try {
        	stackOverflow();
		} catch (Throwable t) {
			System.out.println("StackOverflowError: "+ t.getMessage());
		}
		
	}
	
//	StackOverflowError
	public static void stackOverflow() {
		System.out.println("chmando recurso");
		stackOverflow();
	}
}
