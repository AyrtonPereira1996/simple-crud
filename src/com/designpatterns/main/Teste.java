package com.designpatterns.main;

import java.sql.Connection;
import java.sql.SQLException;

import com.designpatterns.conexao.Conexao;
import com.designpatterns.dao.PessoaDAO;
import com.designpatterns.dto.Pessoa;

public class Teste {
	public static void main(String[] args) throws SQLException, InterruptedException {
		
		/*Pessoa p = new Pessoa("Joao", "Masc.", 1996);
		PessoaDAO pdao = new PessoaDAO();
		pdao.inserir(p);
		*/
		
		/*Pessoa p = new Pessoa();
		PessoaDAO pdao = new PessoaDAO();
		p.setNome("Ayrton Pereira");
		p.setSexo("M");
		p.setCodigo(1);
		p.setAno_Nascimento(1996);
		pdao.editar(p);*/
		
		/*
		Pessoa p = new Pessoa();
		PessoaDAO pdao = new PessoaDAO();
		p.setCodigo(2);
		pdao.excluir(p);*/
		
		/*
		PessoaDAO p = new PessoaDAO();
		p.pesquisa();
		*/
	}
}
