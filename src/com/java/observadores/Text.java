package com.java.observadores;


public class Text extends Observer{
	
	public void mostrarTexto() {
		System.out.println("Mostrar Texto");
	}

	@Override
	public void update() {
		mostrarTexto();
	}

}
