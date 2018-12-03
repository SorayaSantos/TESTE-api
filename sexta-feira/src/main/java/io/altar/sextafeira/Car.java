package io.altar.sextafeira;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class Car implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@NotNull
	int ano;
	
	String marca;
	String cor;
	
	public Car(){}
	
	public Car(int ano, String marca, String cor) {
		super();
		this.ano = ano;
		this.marca = marca;
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
}
