package br.com.lucas;

import br.com.lucas.exceptions.checked.CheckedStudies;
import br.com.lucas.exceptions.unchecked.UncheckedStudies;

public class Main {
	public static void main(String[] args) {
		
		UncheckedStudies.callAllMethods();
		CheckedStudies.checkedIOExemplo();
		CheckedStudies.checkedSqlExemplo();
		CheckedStudies.classNotFoundExemplo();
        
	}

}