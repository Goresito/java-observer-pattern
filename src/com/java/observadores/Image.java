package com.java.observadores;

import com.java.subject.Subject;

public class Image extends Observer{
	
	public Image(Subject sb) {
		super(sb);
	}
	
	public Image() {
		
	}
	
	public void mostrarImage() {
		System.out.println("Mostrar Imagen");
	}

	@Override
	public void update() {
		mostrarImage();
	}
	
}
