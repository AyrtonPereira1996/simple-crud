//Ayrton Pereira - Diferenças entre DAO e DTO

package com.designpatterns.dto;

public class Pessoa {  
	
	//Encapsulamos os atributos da classe, cada atributo comunicará com um campo da base de dados
	private int codigo;//ira comunicar-se como campo "codigo" da tabela tabela_pessoa
	private String nome;//ira comunicar-se como campo "nome" da tabela tabela_pessoa
	private String sexo;//ira comunicar-se como campo "sexo" da tabela tabela_pessoa
	private int ano_nascimento;//ira comunicar-se como campo "data" da tabela tabela_pessoa
	
	public Pessoa(String nome, String sexo, int ano_nascimento) //Construtor da classe
	{
		this.nome = nome;
		this.sexo = sexo;
		this.ano_nascimento = ano_nascimento;
	}
	public Pessoa() {}

	//Metodos acessores e modificadores que iram pegar e modificar dados atraves de oobjectos
	public int getCodigo() { //ira pegar o codigo do objecto
		return this.codigo;}
	
	public void setCodigo(int codigo) {//ira modificar o codigo do objecto
		this.codigo = codigo;}
	
	public String getNome(){//ira pegar o nome do objecto
		return this.nome;}
	
	public void setNome(String nome) {//ira modificar o nome do objecto
		this.nome = nome;}

	public String getSexo() { //ira pegar o sexo do objecto
		return this.sexo;}
	
	public void setSexo(String sexo) {//ira modificar o sexo do objecto
		this.sexo = sexo;}
	
	public int getAno_Nascimento() { //ira pegar o ano do objecto
		return this.ano_nascimento;}
	
	public void setAno_Nascimento(int ano_nascimento) {//ira modificar o ano do objecto
		this.ano_nascimento = ano_nascimento;}}
