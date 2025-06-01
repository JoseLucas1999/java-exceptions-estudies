package br.com.lucas.exceptions.throwExecption;

public class SaldoInsuficienteException extends RuntimeException{
	
//	criamos a excepiton
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
	
	public static void sacar(double saldo, double saque) {
		if(saque > saldo) {
			throw new SaldoInsuficienteException("saldo insuficiente para saque!");
		}
		System.out.println("Saque realizado com secesso!");
	}
	
	
	public void executarSaque() {
		double saldo = 100.0;
		double saque = 200.0;
		sacar(saldo,saque);
	}
	

}
