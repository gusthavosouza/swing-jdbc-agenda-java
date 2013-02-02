package gu.java.nota;

import java.sql.SQLException;

public class GuException extends Exception {
	
	public GuException (String menssagem , Exception e) {
		super(menssagem, e);
	}
	public GuException(String menssagem){
		super(menssagem);
	}
	public GuException(SQLException e, String errorMsg) {
		// TODO Auto-generated constructor stub
	}
}
