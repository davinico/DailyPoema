package com.projetoEmail.ProjetoEmail.Dto;

public class CorpoEmailDto {
	String nome;
	String html;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String organizaHtml(String nome,String poema,String codigoFonteEmail) {
		codigoFonteEmail = codigoFonteEmail.replace("{nome}", nome);
		codigoFonteEmail = codigoFonteEmail.replace("{poema}", poema);
		return codigoFonteEmail;
	}
	
}
