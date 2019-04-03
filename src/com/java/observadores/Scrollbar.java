package com.java.observadores;

public class Scrollbar extends Observer{
	
	public void mostrarScrollbar() {
		System.out.println("Mostrar Scrollbar");
	}
	
	@Override
	public void update() {
		mostrarScrollbar();
	}

}
