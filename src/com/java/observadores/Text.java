package com.java.observadores;

import com.java.subject.Subject;

public class Text extends Observer{
	
	public Text(Subject sb) {
		super(sb);
	}
	
	public Text() {
		
	}
	
	public void mostrarTexto() {
		System.out.println("Mostrar Texto");
	}

	@Override
	public void update() {
		mostrarTexto();
	}

}
