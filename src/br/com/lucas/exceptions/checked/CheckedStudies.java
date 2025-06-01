package br.com.lucas.exceptions.checked;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class CheckedStudies {
	
//------------------------------------------------------------------------	
//	IOException
	public static void checkedIOExemplo() {
		try {
			FileReader file = new FileReader("ARQUIVO_INEXISTENTE.TXT");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
//------------------------------------------------------------------------	
//	SQLException
	public static void checkedSqlExemplo() {
		try {
			throw new SQLException("Erro de SQL Simulado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//------------------------------------------------------------------------	
//	ClassNotFoundException
	public static void classNotFoundExemplo() {
		try {
			Class.forName("ClasseInexistente");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
//------------------------------------------------------------------------

//---------------------------------------------------------------------

//---------------------------------------------------------------------	
//---------------------------------------------------------------------	
//---------------------------------------------------------------------	
}
