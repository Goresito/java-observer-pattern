package com.java.observadores;


public class Image extends Observer{
	
	public void mostrarImage() {
		System.out.println("Mostrar Imagen");
	}

	@Override
	public void update() {
		mostrarImage();
	}
	
}
