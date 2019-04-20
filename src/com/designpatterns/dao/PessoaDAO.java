//Ayrton Pereira - Diferenças entre DAO e DTO
package com.designpatterns.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import com.designpatterns.conexao.Conexao;
import com.designpatterns.dto.Pessoa;

public class PessoaDAO { //Classe DAO para registo, deletação, listagem e edição de registos na base de dados
	public void inserir(Pessoa p) {//metodo que ira permitir inserir registos na base de dados
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("insert into tabela_pessoa ");
			sql.append("(codigo, nome, sexo, data_nascimento) ");
			sql.append("values (default, '"+ p.getNome() + "', '"+ p.getSexo()+ "', '"+ p.getAno_Nascimento() + "')");
			Connection con = Conexao.getConnection(); 
			Statement stmt = con.createStatement();
			stmt.execute(sql.toString());
			stmt.close();
			System.out.println("Pessoa inserida!");
		} catch (SQLException e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}}
	
	public void editar(Pessoa p) {//metodo que ira permitir editar registos na base de dados
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("update tabela_pessoa ");
			sql.append("set nome='"+ p.getNome() + "', sexo='" + p.getSexo() + "', data_nascimento='" + p.getAno_Nascimento()+ "'");
			sql.append("where codigo = "+ p.getCodigo());
			Connection con = Conexao.getConnection();
			Statement stmt = con.createStatement();
			stmt.execute(sql.toString());
			stmt.close();
			System.out.println("Pessoa editada!");
		} catch (SQLException e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}}
	
	
	public void excluir(Pessoa p) {//metodo que ira excluir registos na base de dados
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("delete from tabela_pessoa ");
			sql.append("where codigo="+p.getCodigo());
			Connection con = Conexao.getConnection();
			Statement stmt = con.createStatement();
			stmt.execute(sql.toString());
			stmt.close();
			System.out.println("Pessoa excluida!");
		} catch (Exception e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}
	}
	
	public void pesquisa() throws SQLException, InterruptedException{//metodo que ira pesquisa registos na base de dados
		
	
			StringBuilder sql = new StringBuilder();
			sql.append("select * from tabela_pessoa ");
			sql.append("order by codigo asc ");
			Connection con = Conexao.getConnection();
			Statement stmt = con.prepareStatement(sql.toString());
			ResultSet resultado = stmt.executeQuery(sql.toString());
			
			while(resultado.next()) {
				Pessoa p = new Pessoa();
				String nome= resultado.getString("nome");
				int codigo= resultado.getInt("codigo");
				int ano=resultado.getInt("data_nascimento");
				String sexo = resultado.getString("sexo");
				System.out.println("-------- Pessoas --------");
				System.out.println("Código da pessoa: " + codigo);
				System.out.println("Nome da pessoa: " + nome);
				System.out.println("Sexo da pessoa: " + sexo);
				System.out.println("Idade da pessoa: " + (2019 - ano));
				TimeUnit.SECONDS.sleep(5);
				System.out.println("");
			}
			
	}
}
