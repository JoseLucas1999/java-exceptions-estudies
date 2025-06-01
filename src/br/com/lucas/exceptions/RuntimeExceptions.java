package br.com.lucas.exceptions;

public class RuntimeExceptions {
	

}

//"Throwable possui erros (graves) e exceptions (podem ser tratadas). 
//As exceptions são divididas em checked (JRE te obriga a tratar) 
//e unchecked (não obriga a tratar, mas podem estourar em runtime). 
//As unchecked são filhas de RuntimeException, que é a mais genérica, 
//e dentro dela tem classes mais específicas."

//RuntimeException (Unchecked)
//├── NullPointerException
//├── ArrayIndexOutOfBoundsException
//├── ArithmeticException
//├── IllegalArgumentException
//├── ClassCastException
//├── NumberFormatException
//└── ... (outras unchecked)