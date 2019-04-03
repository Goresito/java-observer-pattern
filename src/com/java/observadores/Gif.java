package com.java.observadores;


public class Gif extends Observer{
	
	public void mostrarGif() {
		System.out.println("Mostrar Gif");
	}

	@Override
	public void update() {
		mostrarGif();
	}
	
}
