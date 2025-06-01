package br.com.lucas.exceptions.throwExecption;

public class ThrowNewExceptions {
//	throw new é a forma que temos em Java de lançar manualmente uma exceção.
//	Aqui, o método decide que não quer continuar se a idade for inválida.
//	Você protege seu método contra argumentos inválidos.
//  Ajuda a debugar e saber exatamente qual argumento estava errado.
//---------------------------------------------------------------------
//	Exemplo 1: Validação simples
	public static void simpleValidation() {
		int idade = -5;

		if (idade < 0) {
			throw new IllegalArgumentException("Idade não pode ser negativa");
		}
		System.out.println("Idade igual: " + idade);
	}
//---------------------------------------------------------------------
//	Exemplo 2: Validação de string vazia ou nula
	public static void stringValidation() {
		String nome = "";
		if(nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("o nome não pode ser nulo");
		}
	}
//---------------------------------------------------------------------
//	 Exemplo 3: Validando valores dentro de um intervalo
	
	public static void intervalValues() {
		int nota = 11;
		if(nota < 0 || nota > 10) {
			throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
		}
	}
//---------------------------------------------------------------------
//	Exemplo 4: Usando em métodos que retornam algo
	public static int returningSomething(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("Não é possivel dividir por zero!");
		}
		return a/b;
	}	
	
//---------------------------------------------------------------------	
//	METHOD TO CALL ALL THE OTHER METHODS
	
	public static void callAllMethods() {
		try {
			simpleValidation();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			stringValidation();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			intervalValues();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		try {
			int result  = returningSomething(10,0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
//---------------------------------------------------------------------	

}
