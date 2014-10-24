package mochilaPack;

import java.util.ArrayList;

public class Mochila {
	int pesoMaximo;
	ArrayList<Objeto> listaObjetosCandidatos = new ArrayList<Objeto>();
	int totalObjetosCandidatos;		
	
	public Mochila(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public int getTotalObjetosCandidatos() {
		return totalObjetosCandidatos;
	}

	public void setTotalObjetosCandidatos(int totalObjetosCandidatos) {
		this.totalObjetosCandidatos = totalObjetosCandidatos;
	}

	
}
