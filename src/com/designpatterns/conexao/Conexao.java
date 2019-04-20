package com.designpatterns.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "123456");
			System.out.println("Conectado com sucesso");
			return con;
		} catch (Exception e) {
			System.out.println("Falha ao conectar");
			e.printStackTrace();
			return con;
		}
	}
}
